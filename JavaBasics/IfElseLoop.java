package JavaBasics;
import java.util.Scanner;
public class IfElseLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

// Even Odd Number 
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n%5 == 0) System.out.print("Even No");
        else System.out.print("Odd Number");

// Modulus of Nmber 
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        if(a<0) a = -a;
        System.out.print(a);

// Real number check if interger or not
        System.out.print("Enter Number : ");
        double b = sc.nextDouble();
        int z = (int)b;
        if(z==b) System.out.print("Integer"); // if(n-x ==0) System.out.print("Integer");
        else System.out.print("Not Integer");

//Profit and Loss 
        System.out.print("Enter CP : ");
        int cp = sc.nextInt();
        System.out.print("Enter SP :");
        int sp = sc.nextInt();
        if(sp>cp){
          System.out.println("Profit is :" + (sp-cp));
          double x = (sp-cp)*100.0/cp;
          System.out.println("Profit % :" +x);
        }
        if(sp<cp){
          System.out.println("Loss is :" + (cp-sp));
          double x = (cp-sp)*100.0/cp;
          System.out.println("Loss % :" +x);
        }
        if(sp==cp) System.out.println("No Profit No Loss");
        
// Check if a positive integer is 4 digit or not 
        int c = sc.nextInt();
        if (c>0) {
          if (c>999 && c<10000) System.out.println("Number is 4 digit");
          else System.out.println("Number is not 4 digit ");
        }else System.out.println("Enter Valid input");

// Take interger input and tell if its magnitude is smaller than 69 or not
        int d = sc.nextInt();
        if(d>0){
          if(n>69) System.out.println("Greater than 69");
          else System.out.println("Not Greater than 69");
        }else{
          d= -(d);
          if(d>69) System.out.println("Greater than 69");
          else System.out.println("Not Greater than 69");
        }

// Divisiblity Check
        System.out.print("Enter Number :");
        int e = sc.nextInt();
        if (e%5 == 0) System.out.println("Divisible by 5");
        if (e%3 == 0) System.out.println("Divisible by 3");
        if (e%5 == 0 && e%3 ==0) System.out.println("Divisible by both 5 and 3");
        if (e%5 == 0 || e%3 == 0) System.out.println("Divisible by 5 or 3");

// Validity of Triangle 
      System.out.print("Enter First Side : ");
      int f = sc.nextInt();
      System.out.print("Enter Second Side : ");
      int g = sc.nextInt();
      System.out.print("Enter Third Side : ");
      int h = sc.nextInt();
      if(f+g>h && f+h>g && g+h>f)System.out.println("Valid Triangle");
      else System.out.print("Invalid Triangle");

// Checking points on 2d plane 
      System.out.print("Enter x : ");
      int j = sc.nextInt();
      System.out.print("Enter y : ");
      int k = sc.nextInt();
      if(j==0 && k==0) System.out.println("Origin");
      else if(j==0) System.out.println("Y axis");
      else if(k==0) System.out.println("X axis");
      else if(j>0 && k>0) System.out.println("Ist Quadrant");
      else if(j<0 && k>0) System.out.println("IInd Quadrant");
      else if(j<0 && k<0) System.out.println("IIIrd Quadrant");
      else System.out.println("IVth Quadrant");

// Greatest of 3 numbers
  //Method 1
      System.out.print("Enter First No. : ");
      int u = sc.nextInt();
      System.out.print("Enter Second No. : ");
      int v = sc.nextInt();
      System.out.print("Enter Third No. : ");
      int w = sc.nextInt();
      if(u>=v && u>=w) System.out.println(u);
      else if (v>=u && v>=w) System.out.println(v);
      else System.out.println(w);
  // Method 2 
      if(u>v){
        if(u>w) System.out.println(u);
        else System.out.println(w);
      }else{
        if(v>w) System.out.println(v);
        else System.out.println(w);
      }
    }
}
