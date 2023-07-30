package Pratice_Questions;
import java.util.*;
public class reverse_GivenNumber {
    public static int reverseGivenNumber(int num){
        int reverse = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = reverseGivenNumber(num);
        System.out.println("Reverse of " + num + " : " + reverse);
    }
    
}
