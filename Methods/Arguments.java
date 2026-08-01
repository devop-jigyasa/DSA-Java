package Methods;
public class Arguments {


    public static void max(int a, int b, int c){         //without return
        if(a>=b && a>=c) System.out.println(a);
        else if(b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
        System.out.println("Jigx");
    } 

    public static int maxx(int a, int b, int c){         // with return
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }


    public static void main(String[] args){
        max(4,5,3);                                 //4,5,3 are arguments
        System.out.println(maxx(4,5,3));
    } 
}
