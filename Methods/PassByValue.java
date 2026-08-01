package Methods;
public class PassByValue {
    public static void change(int x){                // Case 1
            x=10;
        }
        public static void main(String[] args){
            int x = 6;
            System.out.println(x);
            change(x);
            System.out.println(x);
        }

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

        // public static int change(int x){            //Case 3
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
}
