package Pratice_Questions;
import java.util.*;
public class sum_OfNatural_Number {
    public static int sumOfNaturalNumber(int num){
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of natural number: " + sumOfNaturalNumber(num));
    }
    
}
