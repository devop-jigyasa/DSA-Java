package BinarySearch;
import java.util.Scanner;
public class MaximumcountPositiveNegativeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int res1 = NegativeCount(arr);
        int res2 = PositiveCount(arr);

        int ans = Math.max(res1,res2);
        System.out.print(ans);

        sc.close();
    } 

    public static int NegativeCount(int[] arr){
        int n = arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=0) hi=mid-1;
            else lo=mid+1;
        }
        int NegativeCount = lo;
        return NegativeCount;
    }
    
    public static int PositiveCount(int[] arr){
        int n = arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<=0) lo=mid+1;
            else hi=mid-1;
        }
        int PositiveCount = n-lo;
        return PositiveCount;
    }
}
