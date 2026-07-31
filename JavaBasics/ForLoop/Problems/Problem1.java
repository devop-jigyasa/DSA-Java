package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//print all odd numbers from 1 to 100 that ar divisible by 3
      for(int i=1; i<=100; i=i+2){                   
        if(i%3==0) System.out.print(i+" ");
      }
      sc.close();
    }
}
