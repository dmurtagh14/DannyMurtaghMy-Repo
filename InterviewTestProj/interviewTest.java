import java.util.Scanner;

class interviewTest{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double x = obj.nextDouble();
        double y = obj.nextDouble();
        System.out.println(x + " + "+y+ " = "+(x+y));
        obj.nextLine();
        System.out.println(x + " - "+y+ " = "+(x-y));
        System.out.println(x + " * "+y+ " = "+(x*y));
        System.out.println(x + " / "+y+ " = "+(x/y));
        System.out.println(x + " % "+y+ " = "+(x%y));
    }
}