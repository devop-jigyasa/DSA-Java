package Methods.Problems;
import java.util.Scanner;
public class Problem2 {
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+ "  " +b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+ " " +b);
        swap(a,b);

        sc.close();
    }
}
