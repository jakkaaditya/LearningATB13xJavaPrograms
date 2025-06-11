package ex_04_Operators;

public class Operators_Unary_operators {
    public static void main(String[] ar)
    {  // Unary Operator
        int a = +10;
         // int a =10;  + is optional here
        int b = -2;
       int result = a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);

        int a1 = -1;
        int b1 = a1+5;

        System.out.println(a1);
        System.out.println(b1);
    }
}

   /* Output:-
        10
        -2
        8
        -1
        4*/