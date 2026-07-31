package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem6{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      for(int i=65; i<=90; i++){                // Print all alphabets with their ASCII values
        System.out.println((char)i +" - "+ i);
      }

      sc.close();
    }
}
