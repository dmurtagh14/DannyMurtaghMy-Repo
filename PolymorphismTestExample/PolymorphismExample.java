/**
 * @author Danny Murtagh
 * Polymorphism code example
 */

class Solution{

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Triangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        for(int i = 0; i < 2; i++){
            System.out.println(shapes[i].getName());
        }

        for (Shape s: shapes){
            System.out.println(s.getName());
        }
    }
}

  class Shape{
    protected String nameShape = " ";

    public void generateName(String name){
        this.nameShape = name;
    }
    //gets the name of the shape
    public String getName(){
        return nameShape;
    }
 }

 class Triangle extends Shape{
    public void generateName(){
        this.nameShape ="Trianlgle";
    }
}


 class Circle extends Shape{
    public void generateName(){
        this.nameShape = "Circle";
    }
}

 class Square extends Shape{
    public void generateName(){
        this.nameShape = "Square";
    }
}