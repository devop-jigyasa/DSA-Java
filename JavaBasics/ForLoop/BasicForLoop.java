package JavaBasics.ForLoop;
import java.util.Scanner;
public class BasicForLoop {
    public static void main(String[] args){

        for(int i=1; i<=4; i++){
          System.out.print(i+" "); 
        }
       int a;                     //initialise i outside loop
      for (a=1; a<=3; a++){
        System.out.print(a+" ");
      }
      System.out.println();   // brings the cursor to next line after printing 3 
      System.out.print(a);

      Scanner sc = new Scanner (System.in);     // n times printing by taking n input from user
      int n = sc.nextInt();
      for(int i=1; i<=n; i++){
        System.out.println("Jigibabyy");
      }

      for(int i=1; i<=100; i++){                   // printing even(i%2==0)/odd(i%2!=0) numbers from 1 to 100
        if(i%2==0) System.out.print(i+" ");
      }

      for(int i=1; i<=170; i++){                // table of 17 - Method 1
        if(i%17==0) System.out.print(i+" ");
      }
      for(int i=17; i<=170; i=i+17){           // Method 2
        System.out.print(i+" ");
      }
      for(int i=1; i<=10; i++){                // Method 3
        System.out.print((i*17) + " ");
      }

      sc.close();
    } 
}
