package SortingAlgorithms.BubbleSort;
import java.util.Scanner;
public class DescendingOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            // boolean flag = true;
            // for(int j=0; j<n-1; j++){
            //     if(arr[j]<arr[j+1]){
            //         flag = false;
            //         break;
            //     }
            // }
            // if(flag==true) break;
            int swaps = 0;
            for(int j=n-1; j>i; j--){
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        for(int ele : arr) System.out.print(ele + " ");

        sc.close();
    }
}
