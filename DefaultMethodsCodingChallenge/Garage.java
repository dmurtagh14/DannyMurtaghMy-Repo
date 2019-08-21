/*Using default methods, create a program to portray how many cares are in your garage
HINT: Use an abstract method, and a default method in your interface */
class Garage implements Cars{
    public Garage(){
        this.getCar();        
    }

    public static void main(String[] args) {
       new Garage();
    }
}

interface Cars{
    int carsNum = 4;
    default void getCar(){
        System.out.println("There are " + carsNum + " cars in the garage!");
    }
}