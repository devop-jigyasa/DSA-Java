package Strings;
import java.util.Scanner;
public class TotalSubstrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sub = s.substring(i, j+1);
                System.out.print(sub + " ");
                sum += Integer.parseInt(sub);  

            }
            System.out.println();
        }
        System.out.println(sum);

        sc.close();
    }
}
