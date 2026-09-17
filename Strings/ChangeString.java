package Strings;
import java.util.Scanner;
public class ChangeString {           //change the case of complete string according to the case of its first letter
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(Character.isLowerCase(a.charAt(0))) System.out.print(a.toLowerCase());
        else System.out.print(a.toUpperCase());

        sc.close();
    }
}
