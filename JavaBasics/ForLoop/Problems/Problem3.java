package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();             // Method 1          // Print AP 2,5,8,11...upto n terms
      for(int i=2; i<=(3*n-1); i=i+3){
        System.out.print(i+" ");
      }
      
      int nn = sc.nextInt();     // Method 2
      int a=2, d=3;
      for(int i=1;i <=nn; i++){
        System.out.print(a+" ");
        a+=d;
      }

      sc.close();
    }
}
