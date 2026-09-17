package SortingAlgorithms.Problems;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {                               //By Sorting and 2 pointer approach
    public static boolean Twosum(int[] a, int t){
        int n = a.length;
        int i=0, j=n-1;
        Arrays.sort(a);
        while(i<j){
            if(a[i]+a[j]==t) return true;
            else if(a[i]+a[j]<t) i++;
            else j--;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Twosum(a,8));
        sc.close();
    }
}
