package SortingAlgorithms.BubbleSort;
import java.util.Scanner;
import java.util.ArrayList;
public class MoveAllZerosToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//Method 1(By swaping - Bubble Sort)
        for(int i=0; i<n-1; i++){
            int swap=0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]==0){
                    arr[j] = arr[j+1];
                    arr[j+1] = 0;
                    swap++;
                }
            }
            if(swap==0)break;
        }
        for(int ele:arr) System.out.print(ele + " ");

//Method 2 (By creating new ArrayList)
        int nn = sc.nextInt();
        int[] arrr = new int[nn];
        for(int i = 0; i<nn; i++){
            arrr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i<nn; i++){
            if(arrr[i]!=0){
                list.add(arrr[i]);
            }
            else count++;
        }
        for(int i=0; i<count; i++){
            list.add(0);
        }
        System.out.println(list);
        for(int i=0; i<nn; i++){
            System.out.print(list.get(i)  + " ");
        }

        sc.close();
    }
}
