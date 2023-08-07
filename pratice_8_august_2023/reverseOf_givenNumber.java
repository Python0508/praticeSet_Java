import java.util.*;
public class reverseOf_givenNumber {
    public static void reverseGivenNumber(int num){
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }
        System.out.println("Reverse of given number: " + rev);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        reverseGivenNumber(num);
    }
    
}
