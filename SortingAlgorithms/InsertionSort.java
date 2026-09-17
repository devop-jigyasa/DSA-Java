package SortingAlgorithms;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
            }
        }
        for(int ele : arr) System.out.print(ele + " ");

        sc.close();
    }
}
