package Recursion.RecursionOnArrays;
import  java.util.Scanner;
public class SearchElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(searchele(arr,0, 34));
        System.out.println(searchelement(arr,34,0,n-1));

        sc.close();
    }

//Method 1 Normal Searching 
    static boolean searchele(int[] arr, int idx, int target){
        int n = arr.length;
        if(idx == n)return false;
        if(arr[idx]==target){
            System.out.println(idx);
            return true;
        }
        return searchele(arr,idx+1, target);
    }

//Methood 2 Binary Searching
    static int searchelement(int[] arr, int target, int lo, int hi){
        if(lo>hi)return -1;
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target)return searchelement(arr,target,lo, mid-1);
        else return searchelement(arr,target,mid+1,hi);
    }

}
