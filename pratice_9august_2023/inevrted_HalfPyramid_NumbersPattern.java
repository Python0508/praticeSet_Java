package Pratice_Questions.pratice_9august_2023;
import java.io.StringReader;
import java.util.*;
public class inevrted_HalfPyramid_NumbersPattern {
    public static void ineverted_HalfPyramid_NumbersPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        ineverted_HalfPyramid_NumbersPattern(num);
    }
    
}
