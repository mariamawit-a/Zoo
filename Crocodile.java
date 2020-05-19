//Name Mariamawit Jembere
//Project 2

public class Crocodile extends Animal 
{
    
    public Crocodile(String name) 
    {
        super(name);    
        setprefferedBiome("River");
        setspecies("Crocodylus");
        setgenus("niloticus");
        setfoodmoney(5000);
    }
    
    //I tried accessing the budget of the zoo in the feed function of each animal class but it did not work
    @Override
    public void feed() 
   {    
       this.getcurrentZoo().setbudget(this.getcurrentZoo().getbudget() - 5000); 
   }
    
    @Override
    public void getFeedingInstructions() 
   {
       System.out.println("Meat 5000$"); 
   }
  
    
}
