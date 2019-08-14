public class stringLength{
    public static void main(String[] args) {
        String str1, str2, str3, str4, str5;
        str1 = "Hey"; 
        str2 = "Hey Jude!"; 
        str3 = "Elanor Rigby";
        str4 = "z";

        System.out.println("------------------------\n");
        
        System.out.println(str3.length()+"\n");//string.length() counts the amount of characters in a string, returns an int

        if(str3.length() > str2.length()){
            System.out.println(str3 + " is better than "+ str2 + "\n");
        }

        System.out.println(str2.indexOf(str4)+ "\n"); /*string.indexOf() will return first position parameter occurs, 
                                                      returns an int, if not returns -1, case sensitive*/
        
        System.out.println(str1+" "+ str2);//concatenation --> adding strings to make a new string

        String newString1;
    }
}