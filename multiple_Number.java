package Pratice_Questions;
import java.util.*;
public class multiple_Number {
    public static void multipleTable(int num){
        for(int i=1; i<=10; i++){
            int multiple = num * i;
            System.out.println(num + " * " + i + " = " + multiple);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        multipleTable(num);
    }
    
}
