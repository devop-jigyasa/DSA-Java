package Recursion.ClassLevelVariable;
import java.util.Scanner;
public class OneToN {
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);

        sc.close();
    }
    static void print(int x){
        if(x>n) return;
        System.out.println(x);
        print(x+1);
    }

}
