package Pratice_Questions.pratice_9august_2023;
import java.util.*;
public class hollow_Rectangle {
    public static void hollow_RectanglePattern(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = sc.nextInt();
        System.out.print("Enter col number: ");
        int col = sc.nextInt();
        hollow_RectanglePattern(row, col);
    }
}
