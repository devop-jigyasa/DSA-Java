package JavaBasics;
import java.util.Scanner;
public class LimitsOfDataTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

      int x = Integer.MAX_VALUE;            // Limit of Datatypes (int,long)
      System.out.println(x);
      int y = Integer.MIN_VALUE;
      System.out.println(y);
      long z = Long.MAX_VALUE;
      System.out.println(z);
      long a = Long.MIN_VALUE;
      System.out.println(a);

      long xx = 2147483647 + 10;         // int+int overflow 
      System.out.println(xx);
      long xy = 2147483647L+10;          // long+int performs long addition
      System.out.print(xy);

      sc.close();
    }
}
