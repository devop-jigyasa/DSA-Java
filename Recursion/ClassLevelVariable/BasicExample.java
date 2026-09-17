package Recursion.ClassLevelVariable;

public class BasicExample {
    static int x = 100;
    public static void main(String[] args){
        fun();
        System.out.println(x);
        x=90;
        fun();
        int x = 12;
        x=3;
        fun();
        System.out.println(x);
        funn();
    }
    static void fun(){
        System.out.println(x);
    }
    static void funn(){
        x+=79;
        System.out.println(x);
    }
}
