//Name Mariamawit Jembere
//Project 2
//Description - A Enclosure class have a specific biome and contains animals that are compatible 

import java.util.*;

public class Enclosure 
{
    private final String biome;
    private ArrayList<Animal> animals;
    
     
    public Enclosure(String biome)
    {
      this.biome = biome;
      this.animals = new ArrayList<Animal>();
    }
    
    public String getbiome ()
    {
      return biome;
    }
    
    //checks if animal that is trying to be added does not have an enemy in the enclosure 
    public boolean noEnemies(Animal animal1, Animal animal2)
	{
                //if the animal trying to be added is a crocodile or a lion but if there is a zebra or a gazelle living in the enclosure print an error message 
		if (animal1 instanceof Crocodile ||animal1 instanceof Lion )
		{
			if (animal2 instanceof Zebra || animal2 instanceof Gazelle)
			{
				animal1.setenemy(animal2);
				System.out.println("Error: " + animal1.getname() + " cannot live with " + animal2.getname() + ", as they are enemies. addAnimal Failed");
				return false;
			}
		}
		//if the animal trying to be added is a zebra or a gazelle but if there is a Crocodile or a Lion living in the enclosure print an error message 
		else if (animal1 instanceof Zebra || animal1 instanceof Gazelle)
		{
			if (animal2 instanceof Crocodile ||animal2 instanceof Lion)
			{
				animal1.setenemy(animal2);
				System.out.println("Error: " + animal1.getname() + " cannot live with " + animal2.getname() + ", as they are enemies. addAnimal Failed");
				return false;
			}
		}
			return true;
	}
   
    //adds animal in the enclouser after runnnig a compatible test   
    public void addAnimal(Animal anim)
    {
       boolean isEnemies = false;
       
        if (animals.isEmpty() && equals(anim))
        {
                animals.add(anim);
        }
        
        else if(animals.size()>0)
         {
            //check if the animal being added has an enemy or is an enemy of an animal that is already in the enclosure
            for(int j=0; j < animals.size() ; j++)
                 {
                      if (!noEnemies(anim, animals.get(j)))
                      {
                         isEnemies = true; 
                         break;
                      }
                 }
                 
            if(equals(anim) || !isEnemies)
            animals.add(anim);
         } 
                 
        else if(!equals(anim))
        {
          System.out.println("Error! "+ anim.getname() +" cannot live in the"+ biome +". addAnimal failed.");  
        }
    }
    
    public ArrayList<Animal> getAnimals()
    {
        return animals;
    }
    
    @Override
    public boolean equals(Object other)
    {
        return this.biome.equals(((Animal)other).prefferedBiome);
    }
    
    @Override
    public String toString()
    {
       String result = "   "+biome+":\n";
       char list = 96;
       for (int i=1; i <= animals.size(); i++)
       { 
           if(list==97)
           result+= "\n";
           
           result += ++list +"." + animals.get(i-1);
       }
       return result;
    
    }
    
}
