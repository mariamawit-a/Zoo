//Name Mariamawit Jembere
//Project 2
//Description - The Animal class contains a the name, biological numeclature, and other traits of a general animal 

public class Animal implements Feedable
{
    private String name;
    private String genus;
    private String species;
    private Zoo currentZoo;
    private double foodMoney;
    protected Animal enemy;
    protected String prefferedBiome;
    
   public Animal(String name)
   {
    this.name = name;
   }
   
   public String getname() 
   {
       return this.name;
   }
  
   public void setname(String name) 
   {
       this.name=name;
   }
  
   public String getgenus() 
   {
       return this.genus;
   }
  
   public void setgenus(String genus) 
   {
       this.genus=genus;
   }
  
   public String getspecies() 
   {
       return this.species;
   }
  
   public void setspecies(String species) 
   {
       this.species=species;
   }
   
   public Zoo getcurrentZoo() 
   {
       return this.currentZoo;
   }
  
   public void setcurretnZoo(Zoo currentZoo) 
   {
       this.currentZoo=currentZoo;
   }
  
   public Animal getenemy() 
   {
       return this.enemy;
   }
  
   public void setenemy(Animal enemy) 
   {
       this.enemy=enemy;
   }
  
   public String getnprefferedBiome() 
   {
       return this.prefferedBiome;
   }
  
   public void setprefferedBiome(String prefferedBiome) 
   {
       this.prefferedBiome=prefferedBiome;
   }

   public void setfoodmoney(double foodMoney) 
   {
      this.foodMoney = foodMoney;  
   }
   
   public double getfoodmoney() 
   {
      return this.foodMoney;  
   }
    @Override
    public void getFeedingInstructions()
    {}
    
    @Override 
    public void feed()
    {}
    
    @Override
    public String toString()
    {
           return (getname()+" ("+ getspecies()+ " "+getgenus() + ")");
    }
}
