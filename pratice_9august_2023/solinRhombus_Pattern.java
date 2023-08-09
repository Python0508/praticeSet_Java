package Pratice_Questions.pratice_9august_2023;
import java.util.*;
public class solinRhombus_Pattern {
    public static void solidRhombusPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        solidRhombusPattern(num);
    }
    
}
