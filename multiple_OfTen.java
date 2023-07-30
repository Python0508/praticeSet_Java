package Pratice_Questions;
import java.util.*;
public class multiple_OfTen {
    
    public static void main(String args[]){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            long number = sc.nextLong();
            if(number % 10 != 0){
                break;
            }else{
                System.out.println(number);
            }
        }while(true);
        
        
    }
    
}
