package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem7{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();                    // Check whether the number is composite or not
      for(int i=2; i<=n-1; i++){
        if(n%i==0){
          System.out.print("Composite Number");
          break;
        }
      }
      
      int nn = sc.nextInt();                   //Check whether the number is Prime or Composite 
      int x = 0;      // denotes prime number
      for(int i=2; i<=nn-1; i++){
        if(n%i==0){
          x=1;
          break;
        }
      }
      if(x==1) System.out.print("Composite Number");
      else System.out.print("Prime Number");

      sc.close();
    }
}
