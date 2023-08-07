import java.util.*;
public class prime {
    public static boolean isPrime(int num){
        
        if(num == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    // Write a code prime in range
    public static void primeInRange(int num){
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the number: ");
        int num = sc.nextInt();
        primeInRange(num);
    }
    
}
