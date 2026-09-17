package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(Fo(arr,6,0,n-1));

        sc.close();
    }
    static int Fo(int[] arr, int target, int lo, int hi){
        if(lo>hi)return -1;
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==target){
            if(arr[mid-1]!= target) return mid;
            else return Fo(arr,target,lo,mid-1);
        }
        else if(arr[mid]>target) return Fo(arr,target,lo,mid-1);
        else return Fo(arr,target,mid+1,hi);
    }
}
