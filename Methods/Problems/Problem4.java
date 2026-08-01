package Methods.Problems;
import java.util.Scanner;
public class Problem4 {                   //Permutation and Combination
    public static int fact(int x){
            int f=1;
            for(int i=1; i<=x; i++){
                f*=i;
            }
            return f;
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            System.out.print("Enter r : ");
            int r = sc.nextInt();

            int ncr = fact(n)/(fact(r)*fact(n-r));
            int npr = fact(n)/fact(r);

            System.out.println("Combination : " +ncr+ "   " + "Permutation : " +npr);

            sc.close();
    }
}
