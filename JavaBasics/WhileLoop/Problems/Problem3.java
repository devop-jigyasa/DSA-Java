package JavaBasics.WhileLoop.Problems;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Number : ");     // reverse of number and sum of digits
      int n = sc.nextInt();
      int r = 0;
      int sum = 0;
      while(n!=0){
        sum +=(n%10);
        r*=10;
        r+=(n%10);
        n/=10;
      }
      System.out.println("Reverse of Number is : " + r);
      System.out.print("Sum of Number : " +sum);

      sc.close();
    }
}