import java.util.Scanner; // import the Scanner class from utility package

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); //creates a new scanner object that reads in user input
    String userName;
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine(); //the user input is converted to a string variable
    System.out.println("Username is: " + userName); //output userName as string
  }
}