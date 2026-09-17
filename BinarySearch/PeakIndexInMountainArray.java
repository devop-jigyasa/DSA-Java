package BinarySearch;
import java.util.Scanner;
public class PeakIndexInMountainArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int lo=1, hi=n-2; 
        boolean flag = true;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.print(mid);
                flag = false;
                break;
            }
            else if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]) lo=mid+1;
            else hi=mid-1;
        }
        if(flag) System.out.print("Peak not Found");


        

//Method 2
        // int lo=0, hi=n-1; 
        // while(lo<hi){
        //     int mid = (lo+hi)/2;
        //     if(arr[mid]>arr[mid+1]) hi = mid;
        //     else lo=mid+1;
        // }
        // System.out.print(lo);
        sc.close();
    }
}
