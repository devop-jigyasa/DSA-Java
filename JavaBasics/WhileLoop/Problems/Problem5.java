package JavaBasics.WhileLoop.Problems;
import java.util.Scanner;
public class Problem5{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
     int a = sc.nextInt();                 //print result of a^b (Consider all the cases a=+ve/-ve/0 and b = +ve/-ve/0)
     int b = sc.nextInt();
     int result = 1;
     if(b>=0){
      for(int i=1; i<=b; i++){
         result *=a;
      }
      System.out.print(result);
     } else System.out.print("Enter Valid Input");


      sc.close();
    }
}