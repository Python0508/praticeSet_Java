package Pratice_Questions;
import java.util.*;
public class prime {
    public static boolean isPrime(int num){
        boolean isPrime = true;
        if(num == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
    
}
