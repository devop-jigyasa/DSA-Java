package BinarySearch;
import java.util.Scanner;
public class SingleInDoubles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int ans = SingleinDoubles(arr);
        System.out.print(ans);

        sc.close();
    }
    public static int SingleinDoubles(int[] arr){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            int f=mid, s=mid;
            if (arr[mid]==arr[mid-1]) f=mid-1;
            else s=mid+1;  //(arr[mid]=arr[mid+1])

            int leftcount=f-lo;              //rightcount=hi-s;
            if(leftcount%2==0) lo=s+1;       //rightcount is odd and leftcount is even
            else hi=f-1;                     //leftcount is odd and right count is even 
        }
        return -1;
    }
}
