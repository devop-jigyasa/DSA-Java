package Recursion;
import java.util.Scanner;
public class TwoParameters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();
        print(x,n);

        sc.close();
    }
    static void print(int x, int n){
        if(x>n)return;
        System.out.println(x);
        print(x+1,n);
    }
}
