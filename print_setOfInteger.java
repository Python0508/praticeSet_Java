package Pratice_Questions;
import java.util.*;
public class print_setOfInteger {
    public static void setOfInteger(boolean true_false){
        int even_Sum = 0;
        int odd_Sum = 0;
        int choice;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                even_Sum = even_Sum + num;
            }else{
                odd_Sum = odd_Sum + num;
            }

            System.out.println("Press 1 for continure / else Press 0: ");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("Set of evenSum: " + even_Sum);
        System.out.println("Set of oddSum: " + odd_Sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("For play press true / else Press false: ");
        boolean playGame = sc.nextBoolean();
        if(playGame == true){
            setOfInteger(playGame);
            
            
        }
        
    }
    
}
