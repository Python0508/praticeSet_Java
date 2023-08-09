package Pratice_Questions.pratice_9august_2023;
import java.util.*;
public class inverted_Rotated_halfPyramid {
    public static void inverted_Rotated_halfPyramidPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the number: ");
        int num = sc.nextInt();
        inverted_Rotated_halfPyramidPattern(num); 
    }    
}
