package SortingAlgorithms.Problems;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class CommonElements {                        //Intersection of 2 sorted Arrays
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++; j++;
            }
            else if (a[i]<b[j]) i++;
            else j++;
        }
        System.out.print(ans);

        sc.close();
    }
}
