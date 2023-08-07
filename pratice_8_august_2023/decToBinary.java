import java.util.*;
public class decToBinary {
    public static void decToBinary(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum /= 2; 
        }
        System.out.println("Decimal of " + myNum + " : " + binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the DecNum: ");
        int decNum = sc.nextInt();
        decToBinary(decNum);
    }
    
}
