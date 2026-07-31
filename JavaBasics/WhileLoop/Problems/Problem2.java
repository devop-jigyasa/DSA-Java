package JavaBasics.WhileLoop.Problems;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();         //Print Sum of digits
      int sum = 0;
      while(n!=0){
        sum += n%10;
        n/=10;
      }
      System.out.print(sum);

      sc.close();
    }
}
