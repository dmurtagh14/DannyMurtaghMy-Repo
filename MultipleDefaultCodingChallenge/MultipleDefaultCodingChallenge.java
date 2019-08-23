/*Create a class that implements the same method from two different interfaces. 
Now see if you can fix the ambiguity of the methods using the ways that were discussed.
1.    Super¬
2.    Default – class’s own implementation
3.    Higher inheritance precedence gets priority
*/
class Garage implements Car, Truck{
    public void noise(){
        System.out.println("There is nothing in the garage :(");
        Truck.super.noise();
        //Car.super.noise();
    }

     public static void main(String[] args) {
        Garage garage = new Garage();
        garage.noise();               
    }
}

interface Car{
    String noise = "Beep Beep!";
    default void noise(){
        System.out.println("Im a car and I make the noise "+ noise);
    }
}

interface Truck{
    String noise = "HOOOONK";
    default void noise(){
        System.out.println("Im a truck and I make the noise "+ noise);
    }
}