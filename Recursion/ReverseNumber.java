package Recursion;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        // while(n!=0){
        //     r=r*10+n%10;
        //     n/=10;
        // }
        reverse(n,r);
        System.out.println(reverseee(n,r));

        sc.close();
    }
    static void reverse(int n, int r){           //void return type
        if(n==0){
            System.out.println(r);
            return;
        }
        reverse(n/10, r*10+n%10);
    }

    static int reverseee(int n, int r){         //int return type
        if(n==0){
            return r;
        }
        return reverseee(n/10, r*10+n%10);
    }
}
