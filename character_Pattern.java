package Pratice_Questions.pattern_pratice;
import java.util.*;
public class character_Pattern {
    public static void characterPattern(int num){
        char ch = 'A';
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        characterPattern(num);
    }
    
}
