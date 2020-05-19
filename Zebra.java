//Name Mariamawit Jembere
//Project 2

public class Zebra extends Animal 
{
    
    public Zebra(String name) 
    {
        super(name);
        setprefferedBiome("Savanna");
        setspecies("Equus");
        setgenus("quagga");
        setfoodmoney(600);
    }
    
    //I tried accessing the budget of the zoo in the feed function of each animal class but it did not work
    @Override
    public void feed() 
   {    
       this.getcurrentZoo().setbudget(this.getcurrentZoo().getbudget() - 600); 
   }
    
    @Override
    public void getFeedingInstructions() 
   {
       System.out.println("Grass 600$"); 
   }
    
  
}
