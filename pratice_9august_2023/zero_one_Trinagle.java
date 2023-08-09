package Pratice_Questions.pratice_9august_2023;
import java.util.*;
public class zero_one_Trinagle {
    public static void zero_OneTrianglePattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        zero_OneTrianglePattern(num);
    }
}
