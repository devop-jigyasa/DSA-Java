package SortingAlgorithms.SelectionSort;
import java.util.Scanner;
public class DescendingOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1; i>0; i--){
            int max = Integer.MIN_VALUE;
            int maxIndx = -1;
            for(int j =0; j<=i; j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxIndx=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = temp;
        }
        for(int ele : arr) System.out.print(ele + " ");

        sc.close();
    }
}
