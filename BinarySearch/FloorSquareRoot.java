package BinarySearch;
import java.util.Scanner;
public class FloorSquareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root=0;

//Method 1
        // for(int i=0; i<=n; i++){
        //     if(i*i>n) break;
        //     root = i;
        // }

//Method 2
        int lo=1, hi=n;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(mid*mid<=n) {
                root = mid;
                lo = mid +1;
            }    
            else hi = mid -1;      //if(mid*mid>n)
        }
        System.out.print(root);
        sc.close();
    }
}

