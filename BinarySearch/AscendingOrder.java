package BinarySearch;
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        int ans = binarySearch(arr, target);
        System.out.print(ans);

        sc.close();
    }
    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return -1;
    }

    
//Only by Main method

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int [] arr = new int[n];
    //     for(int i=0; i<n; i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int target = sc.nextInt();
    //     int lo=0, hi=n-1;
    //     boolean flag = true;
    //     while(lo<=hi){
    //         int mid = (lo+hi)/2;
    //         if(arr[mid]==target){
    //             System.out.print(mid);
    //             flag = false;
    //             break;
    //         }
    //         else if(arr[mid]>target) hi=mid-1;
    //         else lo=mid+1;
    //     }
    //     if(flag) System.out.print("Target Not Found");

    //     sc.close();
    // }
}
