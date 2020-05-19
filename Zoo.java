//Name Mariamawit Jembere
//Project 2
//Description - A Zoo class contains several enclousers with a specific biome in which an animal can be added to it according to their preferd biome and compatible animals.
//              The animals are fed according to there need if budget allows. 


import java.util.ArrayList;


public class Zoo 
{
    private String name;
    private String address; 
    //I chose to use arraylist rather than arrays because it is easier to access 
    private ArrayList<Enclosure> enclosures; 
    private int area;
    private double budget;
    private double totalfoodmoney=0;
    
    public Zoo(String name, String address, int area, double budget)
    {
        this.name=name;
        this.address=address;
        this.area=area;
        this.budget=budget;
        this.enclosures = new ArrayList<Enclosure>();
        
    }
    
   public String getname() 
   {
       return this.name;
   }
  
   public void setname(String name) 
   {
       this.name=name;
   }
  
   public String getaddress() 
   {
       return this.address;
   }
  
   public void setaddress(String address) 
   {
       this.address=address;
   }
  
   public int getarea() 
   {
       return this.area;
   }
  
   public void setarea(int area) 
   {
       this.area=area;
   }
  
   public double getbudget() 
   {
       return this.budget;
   }
  
   public void setbudget(double budget) 
   {
       this.budget=budget;
   }
   
   public void setbudget(int budget) 
   {
       this.budget=(double)budget;
   }
    
    public ArrayList<Enclosure> getenclosures() 
    {
        return this.enclosures;
    }

    public void setenclosures(ArrayList<Enclosure> enclosures) 
    {
        this.enclosures = enclosures;
    }

    public void addEnclosure(Enclosure enclos) 
    {
        enclosures.add(enclos);
    }

    //gets the feeding instruction for each animal in each enclousre   
    public void getFeedingInstructions() 
    {
        System.out.println("How to Feed:");
        
        for (int i=0; i < enclosures.size(); i++)
        { 
          System.out.println("  "+(i+1)+". "+ enclosures.get(i).getbiome());
          
            char list = 96;
            for (int j=0; j < (enclosures.get(i).getAnimals().size()); j++)
             {  
                System.out.print(++list+")");
                (enclosures.get(i).getAnimals()).get(j).getFeedingInstructions();
             }
        }   
        
    }

    //check if there is sufficient budget to feed each animal in each enclosures  
    public boolean sufficientBudget ()
    {
        for (int i=0; i < enclosures.size(); i++)
            { 
                for (int j=0; j < enclosures.get(i).getAnimals().size(); j++)
                 {  
                    totalfoodmoney = totalfoodmoney + enclosures.get(i).getAnimals().get(j).getfoodmoney();      
                 }
            }
        
        if(budget >= totalfoodmoney)
        return true;
        
        else
        return false;
    }
    
    //feed all animals and deduct from zoo budget
    public void feed() 
    {
        if(sufficientBudget())
        {   
            //I tried accessing the budget of the zoo in the feed function of each animal class but it did not work
            /*for (int i=0; i < enclosures.size(); i++)
            { 
                for (int j=0; j < enclosures.get(i).getAnimals().size(); j++)
                 {   
                     enclosures.get(i).getAnimals().get(j).feed();
                 }
            }*/
            
            setbudget(getbudget()-totalfoodmoney);   
            System.out.println("Feeding completed successfully ");
        }
        
        else
        {
            System.out.println("Feeding failed! Out of funds.");
        }
    }

    //
    @Override
    public boolean equals(Object other)
    {
         if (this.name == ((Zoo) other).name) 
         return true;
         else
         return false;
    }
    
    //prints the zoo information and all the encloures within 
    @Override
    public String toString()
    {
       String result = name+ "\n ==========\nAddress: " + address +"\nArea: "+ area +"\n========="+ 
              "\nEnclousers: \n";
       for (int i=1; i <= enclosures.size(); i++)
       { 
           result += "   "+Integer.toString(i)+"."+enclosures.get(i-1) + "\n";        
       }
       
       return result;
    }
    
}
    
    

