package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class PrintArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        print(arr,0);
        System.out.println();
        revprint(arr,n-1);
        System.out.println();
        reverseprint(arr,0);

        sc.close();

    }
    static void print(int[] arr, int idx){
        int n = arr.length;
        if(idx == n)return;
        System.out.print(arr[idx] + " ");
        print(arr, idx+1);
    }

    static void revprint(int[] arr, int idx){
        if(idx <0)return;
        System.out.print(arr[idx] + " ");
        revprint(arr, idx-1);
    }
    
    static void reverseprint(int[] arr, int idx){
        int n = arr.length;
        if(idx == n)return;
        reverseprint(arr, idx+1);
        System.out.print(arr[idx] + " ");
    }
}
