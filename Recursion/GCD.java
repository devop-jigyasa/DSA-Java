package Recursion;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(gcdd(a,b));
        System.out.println(gcddd(a,b));
        System.out.println(gcdddd(a,b));

        sc.close();
    }

//Method 1
    static int gcd(int a, int b){                   //using for loop and less time complexity
        for(int i =Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }

//Method 2
    static int gcdd(int a, int b){                   //using for loop (more time complexity)
        int hcf = 1;
        for(int i = 1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0) hcf =i;
        }
        return hcf;
    }

//Method 3
    static int gcddd(int a, int b){               //using recursion 
        if(a==0) return b;
        return gcddd(b%a, a);
    }
    
//Method 4
    static int gcdddd(int a, int b){                        //using recursion with help of helper method
        return helper(Math.min(a,b), Math.max(a,b));
    }
    static int helper(int a, int b){               
        if(a==0) return b;
        return helper(b%a, a);
    }
}
