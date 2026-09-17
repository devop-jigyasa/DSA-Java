package BinarySearch;
import java.util.Scanner;
import java.util.ArrayList;
public class FirstLastOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int lo=0, hi=n-1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                idx = mid;
                hi=mid-1;
            }
            else if(arr[mid]>target)hi=mid-1;
            else lo=mid+1;
        }
        if(idx==-1){
            System.out.print("Target Not Found");
            sc.close();
            return;
        }
        else list.add(idx);

        lo=0; 
        hi=n-1;
        idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                idx = mid;
                lo=mid+1;
            }
            else if(arr[mid]>target)hi=mid-1;
            else lo=mid+1;
        }
        list.add(idx);
        System.out.print(list);

        sc.close();
    }
}

