package ArrayListPractice;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class OneAddProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int carry = 0;
        for(int i=n-1; i>=0; i--){
            if(i==n-1) sum = list.get(i)+carry+1;
            else sum = list.get(i)+carry;
            if(sum>9){
                carry = 1;
                sum = 0;
                res.add(sum);
            }else res.add(sum);
        }
        if(carry==1) res.add(carry);

        Collections.reverse(res);
        System.out.print(res);

        sc.close();
    }
    
}
