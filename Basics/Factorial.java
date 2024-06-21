import java.util.Scanner;

/**
 * FibonacciSeries
 */
public class Factorial {

    public static void main(String[] args) {
        
        int i, fact=1;
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("The fibo series of is"+fact);
        s.close();
    }
     
}