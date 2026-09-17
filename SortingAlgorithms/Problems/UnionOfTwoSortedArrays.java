package SortingAlgorithms.Problems;
import java.util.ArrayList;
import java.util.Scanner;
public class UnionOfTwoSortedArrays {                               
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> list= new ArrayList<>();

        int i = 0, j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(list.size() ==0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    i++;
                }else i++;
            }else{ //arr1[i]>arr2[j]
                if(list.size() ==0 || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }else j++; 
            } 
        }
        while(i<n){
            if(list.size() ==0 || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    i++;
                }else i++;
        }
        while(j<m){
            if(list.size() ==0 || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    j++;
                }else j++;
        }
        System.out.print(list);
        sc.close();
    }
}
