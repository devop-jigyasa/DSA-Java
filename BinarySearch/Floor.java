package BinarySearch;
import java.util.Scanner;
public class Floor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int lo=0, hi=n-1, idx=-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]<=target){
                idx = mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        System.out.print(idx);
        sc.close();
    }
}
