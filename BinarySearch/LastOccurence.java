package BinarySearch;
import java.util.Scanner;
public class LastOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int lo=0, hi=n-1, idx = -1;
        boolean flag = true;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                idx = mid;
                lo=mid+1;
                flag = false;
            }
            else if(arr[mid]>target)hi=mid-1;
            else lo=mid+1;
        }
        if(!flag) System.out.print(idx);
        else System.out.print("Target Not Found");

        sc.close();
    }
}
