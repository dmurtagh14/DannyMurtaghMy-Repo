   class abstractTest1{
    public static void main(String args[]){
        System.out.println("\n---------");
        Bike bike1 = new Honda("Honda");
        Bike bike2 = new Harley("Harley");
        bike2.bikeName();
        bike2.run();
        bike1.bikeName();
        bike1.run();
       }
  }

  abstract class Bike{
    String objectName = " "; 
      
    Bike(String name) 
    { 
        this.objectName = name; 
    } 
    abstract void run();

    public void bikeName() 
    { 
        System.out.println(this.objectName + " is "); 
    } 
    
  }

  class Honda extends Bike{
    Honda(String name){
        super(name);
    }

  @Override
  void run(){System.out.println("running safely!\n");}
}
class Harley extends Bike{
    Harley(String name){
        super(name);
    }
    @Override
    void run(){System.out.println("NOT SAFE!\n");}    
  }
 