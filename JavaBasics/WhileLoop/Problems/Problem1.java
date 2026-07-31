package JavaBasics.WhileLoop.Problems;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();                  // Count digits of a number
      if(n==0) System.out.print("1");
      else {
        int count = 0;
        while(n!=0){
          n /=10;
          count++;
        }
        System.out.print(count);
      }

      sc.close();
    }
}
