package ArrayListPractice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(2,89);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(2,67);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(67));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(100));
        System.out.println(list.contains(89));
        System.out.println(list.isEmpty());
        list.add(2,78);
        list.add(3,67);
        list.add(4,78);
        System.out.println(list);
        System.out.println(list.indexOf(78));
        System.out.println(list.lastIndexOf(78));

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for(int ele : list){
            System.out.print(ele + " ");
        }
        System.out.println();
        list.remove(list.size()-1);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list);
        int i=0 , j=list.size()-1;
        while(i<j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list);

        list.clear();
        System.out.println(list);

        sc.close();
    }
}