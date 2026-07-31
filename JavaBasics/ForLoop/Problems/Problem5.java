package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem5{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();                // Print series 1 n 2 n-1 3 n-2....
      for(int i=1,j=n; i<=j; i++, j--){
        System.out.print(i+" ");
        if(i!=j) System.out.print(j+" ");
      }

      sc.close();
    }
}