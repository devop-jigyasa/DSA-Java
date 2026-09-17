package Strings;
public class StringgBuilder {
    public static void main(String[] args){

        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.length() + " " + s1.capacity());

        StringBuilder s2 = new StringBuilder("Hello");
        System.out.println(s2.length() + " " + s2.capacity());

//basic stringbuilder operations

        s1.append("JigyasaBishnoi");
        System.out.println(s1);
        s1.insert(2,"ax");
        System.out.println(s1);
        s1.delete(3,6);
        System.out.println(s1);
        s1.deleteCharAt(7);
        System.out.println(s1);
        s1.setCharAt(5, 'p');
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);

        String s = s1.toString();         //stringbuilder to string
        System.out.println(s);
        
        String ss = "babygurllll";                   //string to stringbuilder
        StringBuilder sb = new StringBuilder(ss);
        System.out.println(sb);
    }
}
