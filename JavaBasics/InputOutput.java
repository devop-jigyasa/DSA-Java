package JavaBasics;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
// Sum of 3 numbers by taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.print("Sum of numbers is : " + (a+b+c));

// Calculating Simple Intrest 
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double I = (p*r*t)/100;
        System.out.println("Simple Intrest is : " + I ); 
        
        sc.close();
    }
}
