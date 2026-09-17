package Recursion;
import java.util.Scanner;
import java.math.BigInteger;
public class ReversePower {
    static int reverse(int n, int r){
        if(n==0){
            return r;
        }
        return reverse(n/10, r*10+n%10);
    }
    static long power(long a, int b){
        if(b==0) return 1;
        long call = power(a, b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }

    static BigInteger powerr(BigInteger a, int b) {  
    if(b == 0)
        return BigInteger.ONE;
    BigInteger call = powerr(a, b / 2);
    if(b % 2 == 0) return call.multiply(call);
    else return call.multiply(call).multiply(a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int rev = reverse(n,r);
        System.out.println(rev);
        System.out.println(power(n,rev));       //valid till 11, n>11 will go beyond limit of long

        BigInteger ans = powerr(BigInteger.valueOf(n), rev);    // it will give correct value for nay value of n
        System.out.println(ans);

        sc.close();
    }
}
