package Methods;
import java.util.Scanner;
public class BasicOfMethods {

    public static void shravan(){
        System.out.println("khushi");
    }
    public static void karan(){
        System.out.println("yashika");
    }
    public static void riyanshi(){
        karan();
        shravan();
        System.out.println("Ajay");
        shravan();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(Math.pow(a,b));     //pow(a,b) is in built method of Math class
        
        float max = Math.max(a,b);            //max(a,b) is in built method of Math class
        System.out.println(max);

        float min = Math.min(a,b);           //min(a,b) is in built method of Math class
        System.out.println(min);

//Max of 4
        int maxx = Math.max(Math.max(2,3),Math.max(7,9));
        System.out.println(maxx);

        System.out.println("amit");
        riyanshi();                    //Method calling

        sc.close();
    }
}
