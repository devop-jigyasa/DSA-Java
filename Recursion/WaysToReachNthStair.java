package Recursion;
import java.util.Scanner;
public class WaysToReachNthStair {               //max 2 jumps possible
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = WaysTwo(n);
        System.out.println(ans);

        int anss = WaysThree(n);
        System.out.print(anss);

        sc.close();
    }

    public static int WaysTwo(int n){
        if(n==1||n==2) return n;
        return WaysTwo(n-1)+WaysTwo(n-2);
    }

    public static int WaysThree(int n){
        if(n==0) return 1;
        if (n==1||n==2) return n;
        return WaysThree(n-1)+WaysThree(n-2)+WaysThree(n-3);
    }
}
