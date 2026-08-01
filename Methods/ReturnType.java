package Methods;
public class ReturnType {


       public static int prasun(int a){
            System.out.println("jigx");
            return a;
            //System.out.println("Amit");   //Unreachbale statement
        }
        public static void main(String[] args){
            System.out.println(prasun(6));
            int x= prasun(3);
            System.out.println(x);
            prasun(8);
            System.out.println(3+prasun(9));
        }
}
