package Strings;
import java.util.Scanner;
import java.util.Arrays;
public class NonRepeatingChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

//Original order of string 

        for(int i=0; i<n; i++){
            boolean ans = false;
            for(int j=0; j<n; j++){
                if(i!=j && s.charAt(j)==s.charAt(i)){
                    ans = true;
                    break;
                }
            }
            if(!ans) {
                System.out.print(s.charAt(i));
                return;
            }
        }


//Lexographically singly occuring character
//Method - 1
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            arr[idx]++;
        }
        for(int i=0; i<26; i++){
            if(arr[i]==1){
               System.out.print((char)(i+97));
               break;
            }
        }

//Method 2
        char[] arrr = s.toCharArray();
        Arrays.sort(arrr);
        int i=0,j=0;
        while(j<n){
            if (arrr[i] == arrr[j]) j++;
            else {
                if (j-i==1) {
                    System.out.println(arrr[i]);
                    return;
                }
                i = j;
            }
        }
        if (j - i == 1) {         // Check the last group
            System.out.println(arrr[i]);
        }
        sc.close();
    }
}
