package Strings;
public class StringBasics {
    public static void main(String[] args){

//String Built In Methods

        String s1 = "Hello World";
        String s2 = "hello";
        String s3="Hello";
        String s4 = "   hello   ";
        String s5 = "I am a good girl.";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.substring(2,7));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s4.toUpperCase());
        System.out.println(s1.contains("Worl"));
        System.out.println(s4.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s3.replace('l', 'p'));
        System.out.println(s4.trim());
        String[] arr1 = s5.split(" ");
        for (String ele : arr1){
            System.out.println(ele);
        }
        String[] arr2 = s5.split("o");
        for (String ele : arr2){
            System.out.println(ele);
        }
        char[] arr3 = s5.toCharArray();
        for(char ele : arr3){
            System.out.println(ele);
        }

//Lexographical comparision of strings

        String a="harsh";
        String b="harshit";
        String c="Raghav";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));


//Concatenation of strings by concat()

        String s = "bhakti";
        String r = " is shakti";
        s = s.concat(r);          //direct  s.concat(r) does not give output 
        System.out.println(s);

//Concatenation of strings by + operator
        s= s+r;
        System.out.println(s);
        s= 10+s;
        s=s+"shakti";
        s=s+"\n";
        s=s+"n";
        System.out.println(s);

//Immutabilityof string
        
        String t ="Raghav";
        System.out.println(t);
        String u ="Raghav";
        System.out.println(u);
        u="Harsh";
        System.out.println(u);
        String v = new String("Raghav");
        System.out.println(v);
        u+="Singh";
        System.out.println(u);
        v= v.substring(0,2) + "s" + v.substring(3);
        System.out.println(v); 

//Equality of Strings by == and equals

        String u1 = "Ram";
        String u2 = "Ram";
        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        
        String u3 = new String("Ram");
        String u4 = new String("Ram");
        System.out.println(u3==u4);
        System.out.println(u3.equals(u4));


//parseInt Method

        String o = "576838379";
        int n = Integer.parseInt(o);
        System.out.println(n);


//Character Built In Methods
        char ch1 = 'a';
        char ch2 = 'P';
        char ch4 = '7';
        char ch = ' ';
        Character.isLetter(ch1);
        Character.isDigit(ch4);
        Character.isLetterOrDigit(ch1);
        Character.isUpperCase(ch2);
        Character.isLowerCase(ch2);
        Character.isWhitespace(ch);
    }
}
