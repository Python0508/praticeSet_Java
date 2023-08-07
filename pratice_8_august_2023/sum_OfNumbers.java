import java.util.*;
public class sum_OfNumbers{
    public static int sumOf_NaturlNumber(int num){
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
        System.out.println("Sum of Naturn number: " + sumOf_NaturlNumber(num));
    }
}