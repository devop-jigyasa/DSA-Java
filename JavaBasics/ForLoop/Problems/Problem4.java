package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      for(int i=99; i>0; i-=4){             // Print Series 99,95,91,...upto all positive terms 
        System.out.print(i+" ");
      }

      int a=1, r=2;                 // Print GP 1,2,4,8,..upto n terms
      int n = sc.nextInt();
      for(int i=1; i<=n; i++){
        System.out.print(a+" ");
        a*=r;
      }

      sc.close();
    }
}