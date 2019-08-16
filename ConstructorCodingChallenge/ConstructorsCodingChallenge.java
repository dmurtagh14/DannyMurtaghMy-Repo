/*Create a program that utilizes each of the following to set and output attributes 
of an object(s):
1. Overload object constructors
2. Overloaded class methods
3. The "this" keyword
4. At least one static method
Make sure that each is used at least once in the program. The output should demonstarte the 
effects of each constructor and method call */

class ConstructorsCodingChallenge{
    public static void main(String[] args) {
        Object1 newObj = new Object1(43);
        Object1 newObj2 = new Object1(12);

        newObj.printOut();
        newObj2.printOut();
        newObj.otherNumber(40);
    }
}

class Object1{
    int num1;
    static String word1 = "Word";
    //constructor 1
    Object1(int number1) 
    {
        this.num1 = number1; //overloading constructor
    }

    void printOut(){System.out.println("my number is " + num1 + " and this is my " + word1);}
    void otherNumber(int number2){System.out.println("My other number is "+ number2);}
}