//Name Mariamawit Jembere
//Project 2

public class Gazelle extends Animal 
{    
    public Gazelle(String name) 
    {
        super(name);
        setprefferedBiome("Savanna");
        setspecies("Rhim");
        setgenus("gazelle");
        setfoodmoney(900);
    }
    
    //I tried accessing the budget of the zoo in the feed function of each animal class but it did not work
    @Override
    public void feed() 
   {    
       this.getcurrentZoo().setbudget(this.getcurrentZoo().getbudget() - 900); 
   }
    
    @Override
    public void getFeedingInstructions() 
   {
       System.out.println("Grass 900$"); 
   }
    
}
