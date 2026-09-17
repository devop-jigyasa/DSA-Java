package JavaBasics;
import java.util.Scanner;
public class VariableAndAO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int a = 356;
       char ch = (char)a;
       System.out.print(ch);

        char chh = 'f';
        System.out.print(chh+0);

        int x = 5;
        System.out.println(x);
        System.out.println(x-10);
        x = x + 7;
        System.out.println(x+10);
        System.out.println(x*4);
        x = x-2;
        System.out.println(x);
        System.out.println(x/3);

// Division operator 
        double c = 5, d = 2;
        System.out.print(c/d);

        double p = 5/2;
        System.out.print(p);

// Ternary Operator 
      int n = sc.nextInt();                     // Find Even Odd 
      String s = (n%2==0) ? "Even" : "Odd";
      System.out.print(s);

      int u = sc.nextInt();                          // Find max of three numbers
      int v = sc.nextInt();
      int w = sc.nextInt();

      int max = (u>v) ? ((u>w) ? u : w) : ((v>w) ? v : w);
      System.out.print(max);

//Volume of Sphere
        double r = 5.69;
        double vol = 1.3333*3.14*r*r*r;
        System.out.println(vol);

// TSA of Cuboid
        int l=4, b=6, h=9;
        int tsa = 2*(l*b+b*h+h*l);
        System.out.println(tsa);

        sc.close();
    }
}
