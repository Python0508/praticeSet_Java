import java.util.*;
public class reverse_number {
    public static void reverseNumber(int num){
        int lastDigit;
        while(num > 0){
            lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        reverseNumber(num);
    }    
    
}
