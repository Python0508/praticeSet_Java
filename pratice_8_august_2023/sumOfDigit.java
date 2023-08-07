import java.util.*;
public class sumOfDigit {
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the number : ");
        int num = sc.nextInt();
        System.out.println("Sum of integer: " + sumOfDigit(num));
    }
    
}
