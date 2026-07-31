package JavaBasics.WhileLoop;
import java.util.Scanner;
public class BasicWhileLoop {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int i = 1;
      while(i<=10){
        System.out.print(i+" ");
        i++;
      }
      sc.close();
    }
}
