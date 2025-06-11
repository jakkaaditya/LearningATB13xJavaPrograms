package ex_04_Operators;

public class Logical_operators {
    public static void main (String[] arg)
    {
        /* **Logical Operators ->  (Digital Electronics)**
            - `&&`  (AND)
            - `||`  (OR)
            - `!`  (NOT)*/

        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false;

        System.out.println(c);

        boolean c1= true && false;
        System.out.println(c1);

    }
}

/*
Output:-

        false
        true
        true
        false*/
