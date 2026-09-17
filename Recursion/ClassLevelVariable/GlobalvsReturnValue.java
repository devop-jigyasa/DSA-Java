package Recursion.ClassLevelVariable;
import java.util.Scanner;
public class GlobalvsReturnValue {
    static int sum = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        calculatee(arr,0);
        System.out.println(sum);

        System.out.println(calculate(arr,0));

        sc.close();
    }

    static void calculatee(int[] arr, int i){
        if(i==arr.length) return;
        sum+= arr[i];
        calculatee(arr, i+1);
    }

    static int calculate(int[] arr, int i){
        if(i==arr.length) return 0;
        return arr[i] + calculate(arr, i+1);
    }
}
