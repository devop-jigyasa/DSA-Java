package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem8{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int nn = sc.nextInt();                        //Printing all the factors of a number 
      for(int i=1; i<=Math.sqrt(nn); i++){
        if(nn%i==0){
          System.out.print(i+" ");
          if(i!=(nn/i)) System.out.print((nn/i)+" ");
        }
      }
 
      System.out.print("Enter Number : ");         // Print all  factors in series, count them, also tell the type of number 
      int n = sc.nextInt();
      int count = 0;                        
      for(int i=1; i<=Math.sqrt(n); i++){
        if(n%i==0){
          System.out.print(i+" ");
          count++;
        }
      }
      for(int i=(int)Math.sqrt(n); i>=1; i--){
        if(n%i==0 && i!=n/i){
          System.out.print((n/i)+" ");
          count++;
        }
      }
      System.out.println();
      System.out.println("Total Factors : "+count);
      if(n==1) System.out.print("Neither Prime nor Composite");
      else if(count==2) System.out.print("Prime Number");
      else System.out.print("Composite Number");

      sc.close();
    }
}