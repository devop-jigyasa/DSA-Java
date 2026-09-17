package Recursion;
import java.util.Scanner;
public class UniquePaths {                       //Only move Right and Down (Leetcode)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int ans = Paths(r,c);
        System.out.println(ans);

        int anss = Uniquepaths(1,1,r,c);
        System.out.print(anss);

        sc.close();
    }

//Method 1
    static int Paths(int r, int c){
        if(r==1 || c==1) return 1;
        return Paths(r,c-1) + Paths(r-1,c);
    }

//Method 2
    static int Uniquepaths(int cc, int cr, int lr, int lc){
        if(cc==lc && cr==lr) return 1;
        if(cr>lr || cc>lc) return 0;
        return Uniquepaths(cc+1, cr, lr,lc) + Uniquepaths(cc, cr+1, lr, lc);
    }
}
