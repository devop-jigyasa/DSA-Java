package Strings;
import java.util.Scanner;
public class CompareTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int ans = compareTo(a,b);
        System.out.println(ans);

        sc.close();
    }
    public static int compareTo(String a, String b){

        int minLength= Math.min(a.length(), b.length());
        for(int i=0; i<minLength; i++){
            if(a.charAt(i)!=b.charAt(i)) return(a.charAt(i)-b.charAt(i));
        }
        return(a.length()-b.length());
    }
}
