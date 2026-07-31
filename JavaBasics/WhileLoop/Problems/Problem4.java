package JavaBasics.WhileLoop.Problems;
import java.util.Scanner;
public class Problem4{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();                    // Fctorial of number  
      int fact = 1;
      for(int i =1; i<=n; i++){
        fact *=i;
        System.out.println(i+" - " + fact);
      }
      System.out.print(fact);

      sc.close();
    }
}
