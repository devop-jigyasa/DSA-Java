package Recursion;
import java.util.Scanner;
public class Twophases {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

        sc.close();
    }
    static void print(int n){
       // if(n==0) return;
        if(n==0){
            
        }
        System.out.println(n);             //Going Down
        print(n-1);
        System.out.println(n);             //Coming Back up
    }
}
