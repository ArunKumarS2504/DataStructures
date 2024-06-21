import java.util.Scanner;

public class Fibonaaci {
    
    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int f1=0,f2=1,f3;
        System.out.print(f1+" "+f2+" ");
        for(int i=3;i<=num;i++){
            f3=f1+f2;
            System.out.print(f3+" ");
        f1=f2;
        f2=f3;
        }
        

    }
}
