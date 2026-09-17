package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean ans = Anagramm(s1,s2);
        System.out.println(ans);

        sc.close();

    }
    public static boolean Anagramm(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]) return false ;
        }
        return true;
    }
}
