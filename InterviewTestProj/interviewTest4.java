public class interviewTest4{
    public static void main(String[] args) {
        int [] numbers = {5, 7, 2, 4, 9, 101, 202, 393};
        int evenCount = 0;
        int oddCount = 0;
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] % 2 ==0)
                evenCount++;
                else
                oddCount++;
        }
        System.out.println("Even Numbers: "+ evenCount);
        System.out.println("Odd Numbers: "+ oddCount);
    }
}