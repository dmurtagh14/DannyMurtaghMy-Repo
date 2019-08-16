//Packages/Subclasses challenge
/*create a program that demonstrates the following
1. Generate the absolute value of a negative number
2. Uses subclasses to output a sauteed onion

output:
1. The absolute value of -n is n
2. I have cut the onion! I have fried the onion! Together, we have cooked the onion! */
import java.util.Scanner;
import java.math.*;
class PackageCodingChallenge{
    public static void main(String[] args) {
        int num1 = -5;
        System.out.println(Math.abs(num1));
        Onion3 onion = new Onion3();
        onion.cook();
    }
}

class Onion{
    String cooking = "I have cut the onion!";
}

class Onion2 extends Onion{
    String fry = "I have fried the onion!";
}

class Onion3 extends Onion2{
    String s3 = "Together we hav cooked the onion!";
    void cook(){System.out.println(cooking + fry + s3);}
}