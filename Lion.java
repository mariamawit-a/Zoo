//Name Mariamawit Jembere
//Project 2

public class Lion extends Animal implements Feedable 
{
       
    public Lion(String name) 
    {
        super(name);
        setprefferedBiome("Savanna");
        setspecies("Panthera");
        setgenus("leo");
        setfoodmoney(4000);
    }
    
   //I tried accessing the budget of the zoo in the feed function of each animal class but it did not work
   @Override
    public void feed() 
   {    
       this.getcurrentZoo().setbudget(this.getcurrentZoo().getbudget() - 4000); 
   }
    
    @Override
    public void getFeedingInstructions() 
   {
       System.out.println("Meat 4000$"); 
   }
    
}
