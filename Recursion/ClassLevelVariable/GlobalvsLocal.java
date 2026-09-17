package Recursion.ClassLevelVariable;
import java.util.Scanner;
public class GlobalvsLocal {
    
//Global Variable
    static int count =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculate(n);
        System.out.println();
        System.out.println("By main : " + count); // as main does not have its count variable so it will use static count

        fun(n);

        sc.close();
    }
    static void calculate(int n){
        if(n==0) return;
        count++;
        System.out.print(count + " ");
        calculate(n-1);
    }

//Local Variable
    static void fun(int n){
        if(n==0)return;
        int countt = 0;
        countt++;
        System.out.print(countt + " ");
        fun(n-1);
    }

}
