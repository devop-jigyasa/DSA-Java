package BinarySearch;
import java.util.Scanner;
public class SearchElementInSortedRotatedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int tar = sc.nextInt();
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            if(arr[mid]==tar){
                 System.out.print(mid);
                 break;
            }
            else if (arr[lo]<=arr[mid]){
                if(arr[lo]<=tar && arr[mid]>tar) hi=mid-1;
                else lo=mid+1;
            }
            else if (arr[mid]<=arr[hi]){
                if(arr[mid]<tar && arr[hi]>=tar) lo=mid+1;
                else hi=mid-1;
            }
        }
        sc.close();
    }
}
