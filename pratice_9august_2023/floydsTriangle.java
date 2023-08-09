package Pratice_Questions.pratice_9august_2023;
import java.util.*;
public class floydsTriangle {
    public static void floydsTrianglePattern(int num){
        int counter = 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        floydsTrianglePattern(num);
    }
    
}
