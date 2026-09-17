package Strings;
import java.util.Scanner;
//import java.util.Arrays;
public class MostFrequentCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int n = s.length();
        int maxfreq = 0;
        char ans = s.charAt(0);

//Method 1 - Brute Force(Nested Loop)
        for(int i=0; i<n; i++){
            int freq = 1;
            char ch = s.charAt(i);
            for(int j=i+1; j<n; j++){
                if(s.charAt(j)==ch) freq++;
            }
            if(freq>maxfreq){
                maxfreq = freq;
                ans = ch;
            }
            else if(freq == maxfreq && ch<ans){
                ans = ch;
            }
        }
        System.out.println(ans + " " + maxfreq);


//Method 2 - Sliding Window

        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // int i=0,j=0;
        // while(j<n){
        //     if(arr[i]==arr[j]) j++;
        //     else{
        //         int freq = j-i;
        //         if(freq>maxfreq){
        //             maxfreq = freq;
        //             ans = arr[i];
        //         }
        //         i=j;
        //     }
        // }

        // int freq = j-i;
        // if(freq>maxfreq){
        //     maxfreq = freq;
        //     ans = arr[i];
        // }
        // System.out.println(ans + " " + maxfreq);


//Method 3 - Frequency Array

        // int[] arr = new int[26];
        // for(int i=0; i<n; i++){
        //     char ch = s.charAt(i);
        //     int idx = ch-97;
        //     arr[idx]++;
        // }
        // for(int i=0; i<26; i++){
        //     if(arr[i]>maxfreq){
        //         maxfreq = arr[i];
        //         ans = (char)(97+i);
        //     }
        // }
        // System.out.println(ans + " " + maxfreq);

        sc.close();
    }
}



