package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                   // print numbers n to 1
        for(int i=n; i>=1; i--){
            System.out.print(i+" ");
        }
        sc.close();
    }
}