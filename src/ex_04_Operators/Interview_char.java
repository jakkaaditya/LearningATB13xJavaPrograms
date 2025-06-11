package ex_04_Operators;

public class Interview_char {
    public static void main (String[] args)
    {
        char a = 'A'; //ASCII - 65
        char b = 'B'; //66
        int c = 10;
        System.out.println(a+c);
        System.out.println(a+b);
        System.out.println(a);
        System.out.print(b);
        System.out.println('A' == 65);
        System.out.println(a+a);
    }

}

/*
When character will combine it will act as a interger.
When only char is printed then it will print as a character

output:-
        75
        131
        A
        B
        true
        130
        */
