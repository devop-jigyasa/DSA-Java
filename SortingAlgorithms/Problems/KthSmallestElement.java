package SortingAlgorithms.Problems;
import java.util.Scanner;
// import java.util.ArrayList;
public class KthSmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//TC = O(k*n)
        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindx];
            arr[mindx] = temp;
        }
        System.out.print(arr[k-1]);

//If Array has repeated elements
//TC = O(n*n)
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     int min = Integer.MAX_VALUE;
        //     int mindx = -1;
        //     for(int j = i; j<n; j++){
        //         if(arr[j]<min){
        //             min = arr[j];
        //             mindx=j;
        //         }
        //     }
        //     int temp = arr[i];             // yaha hum array mein bhi elements swap krte rahenge selection sort se kyuki ye unsorted array part se eke ek element km krta jaega to pure array ko sort krne k liye km no. of comparisions krne pdenge 
        //     arr[i]=arr[mindx];
        //     arr[mindx] = temp;

        //     if(list.size()==0 || list.get(list.size()-1) != arr[i]) list.add(arr[i]);      // ye arraylist elements ko ek hi bar store kregi repeat hua to store nhi kregi
        // }
        // System.out.print(list.get(k-1));


        sc.close();
    }
}
