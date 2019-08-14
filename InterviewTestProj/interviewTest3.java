import java.util.Scanner;
class interviewTest3{
    public static void main(String[] args) {

        String secondWord = "Python";

        int slength = 3;
        if(slength < secondWord.length()){
            String thirdWord = secondWord.substring(3, 6);
            System.out.println(thirdWord+secondWord+thirdWord);
        }
    }
}