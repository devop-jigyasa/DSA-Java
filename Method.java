import java.util.Scanner;
public class Method{
        Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float c = sc.nextFloat();
        // System.out.println(Math.pow(a,b));
        
        // float max = Math.max(a,b);
        // System.out.println(max);

        // float min = Math.min(a,b);
        // System.out.println(min);

        // public static void main(String[] args){               //Max of 4
        // int max = Math.max(Math.max(2,3),Math.max(7,9));
        // System.out.println(max);

        // public static void shravan(){
        //     System.out.println("khushi");
        // }
        // public static void main(String[] args){
        //     System.out.println("amit");
        //     riyanshi();
        // }
        // public static void karan(){
        //     System.out.println("yashika");
        // }
        // public static void riyanshi(){
        //     karan();
        //     shravan();
        //     System.out.println("Ajay");
        //     shravan();
        // }

// Arguments

        // public static void max(int a, int b, int c){         //without return
        //     if(a>=b && a>=c) System.out.println(a);
        //     else if(b>=a && b>=c) System.out.println(b);
        //     else System.out.println(c);
        //     System.out.println("Jigx");
        // } 
        // public static void main(String[] args){
        //     max(4,5,3);
        // }

        // public static int max(int a, int b, int c){         // with return
        //     if(a>=b && a>=c) return a;
        //     else if(b>=a && b>=c) return b;
        //     else return c;
        // } 
        // public static void main(String[] args){
        //     System.out.println(max(4,5,3));
        // }

//Return Type
        // public static void prasun(){
        //     System.out.println("jigx");
        // }
        // public static void main(String[] args){
        //     prasun();
        // }

        // public static int prasun(int a){
        //     System.out.println("jigx");
        //     return a;
        //     //System.out.println("Amit");   //Unreachbale statement
        // }
        // public static void main(String[] args){
        //     System.out.println(prasun(6));
        //     int x= prasun(3);
        //     System.out.println(x);
        //     prasun(8);
        //     System.out.println(3+prasun(9));
        // }

//Pass by Value 
        // public static void change(int x){        // Case 1
        //     x=10;
        // }
        // public static void main(String[] args){
        //     int x = 6;
        //     System.out.println(x);
        //     change(x);
        //     System.out.println(x);
        // }

        // public static void change(int x){          //Case 2
        //     x=10;
        //     System.out.println(x);
        // }
        // public static void main(String[] args){
        //     int x = 6;
        //     System.out.println(x);
        //     change(x);
        //     System.out.println(x);
        // }

        // public static int change(int x){        //Case 3
        //     x=10;
        //     System.out.println(x);
        //     return x;
        // }
        // public static void main(String[] args){
        //     int x = 6;
        //     System.out.println(x);
        //     change(x);
        //     System.out.println(change(x));
        //     System.out.println(x);
        // }

        // public static void addFive(int n){
        //     n = n + 5;
        //     System.out.println(n);
        // }
        // public static void main(String[] args) {
        //     int num = 20;
        //     addFive(num);
        //     System.out.println(num);
        // }

// Swaping 
        // public static void swap(int a, int b){
        //     int temp = a;
        //     a=b;
        //     b=temp;
        //     System.out.println(a+ "  " +b);
        // }
        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     System.out.println(a+ " " +b);
        //     swap(a,b);
        // }

//Permutation & Combination 
//By Loops 
        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int r = sc.nextInt();

        //     int nfact = 1;
        //     for(int i=1; i<=n; i++){
        //         nfact *=i;
        //     }
        //     int rfact = 1;
        //     for(int i=1; i<=r; i++){
        //         rfact *=i;
        //     }
        //     int nrfact = 1;
        //     for(int i=1; i<=(n-r); i++){
        //         nrfact *=i;
        //     }

        //     int ncr = nfact/(rfact*nrfact);
        //     int npr= nfact/rfact;

        //     System.out.println("Combination : " +ncr+ "  " + "Permutation : " +npr);
        // }
        
//By Methods 

        // public static int fact(int x){
        //     int f=1;
        //     for(int i=1; i<=x; i++){
        //         f*=i;
        //     }
        //     return f;
        // }
        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter n : ");
        //     int n = sc.nextInt();
        //     System.out.print("Enter r : ");
        //     int r = sc.nextInt();

        //     int ncr = fact(n)/(fact(r)*fact(n-r));
        //     int npr = fact(n)/fact(r);

        //     System.out.println("Combination : " +ncr+ "   " + "Permutation : " +npr);
        // }

        
}



