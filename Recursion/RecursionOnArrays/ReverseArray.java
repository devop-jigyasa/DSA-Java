package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ReverseArr(arr,0,n-1);
        for(int x : arr){
            System.out.print(x + " ");
        }

        sc.close();
    }
    static void ReverseArr(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
        ReverseArr(arr,lo+1, hi-1);
    }

}
