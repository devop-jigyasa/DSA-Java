package JavaBasics.ForLoop.Problems;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r = sc.nextInt();

            int nfact = 1;
            for(int i=1; i<=n; i++){
                nfact *=i;
            }
            int rfact = 1;
            for(int i=1; i<=r; i++){
                rfact *=i;
            }
            int nrfact = 1;
            for(int i=1; i<=(n-r); i++){
                nrfact *=i;
            }

            int ncr = nfact/(rfact*nrfact);
            int npr= nfact/rfact;

            System.out.println("Combination : " +ncr+ "  " + "Permutation : " +npr);

            sc.close();
    }
}
