package BinarySearch;
import java.util.Scanner;
public class ArrangingCoins {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int res1 = arrangecoins(n);         // ByMethod 1
        System.out.println(res1);
        
        int res2 = arrangecoin(n);         // By Method 2
        System.out.print(res2); 

        sc.close();
    }

//Method 1 
    public static int arrangecoins(int n){
        long m = (long)n;
        return(sqrt(8*m+1)-1)/2;
    }
    public static int sqrt(long num){
        if(num==0) return 0;
        long lo=0, hi=num;
        while(lo<=hi){
            long mid = (lo+hi)/2;
            if(mid==num/mid) return (int)mid;
            else if(mid>num/mid) hi=mid-1;
            else lo = mid+1;                //or we can store the mid value in ans and then change lo and then return that ans value at the end
        }
        return (int)hi;
    }

//Method 2
    public static int arrangecoin(int n){
        int lo=0, hi=n, ans=0;
        while(lo<=hi){
            int k= (lo+hi)/2;
            long m = k*(k+1)/2;
            if(m==n) return k;
            else if(m>n) hi=k-1;
            else{
                ans=k;
                lo=k+1;
            }
        }
        return ans;
    }
}


 
