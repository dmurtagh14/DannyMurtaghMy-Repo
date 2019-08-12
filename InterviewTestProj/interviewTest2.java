//write a java program to check whether java is installed on your computer
import java.io.*;

public class interviewTest2 {
    public static void main(String[] args{
        System.out.println("\nJava Verion"+ System.getProperty("java.version"));
        System.out.println("\nJava Runtime Verion"+ System.getProperty("java.runtime.version"));
        System.out.println("\nJava Home"+ System.getProperty("java.home"));
        System.out.println("\nJava Vendor"+ System.getProperty("java.vendor"));
        System.out.println("\nJava Vendor URL"+ System.getProperty("java.vendor.url"));
        System.out.println("\nJava Class Path"+ System.getProperty("java.class.path")+ "\n");
    }
}