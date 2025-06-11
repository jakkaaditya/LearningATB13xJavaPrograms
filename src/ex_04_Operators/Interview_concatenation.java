package ex_04_Operators;

import java.sql.SQLOutput;

public class Interview_concatenation {
    public static void main (String[] args)
    {
        // concatination
        String firsname,Lastname;
        int a,b;
        System.out.println("aditya" + "Kumar");
         firsname = "Aditya";
         Lastname = "Kumar";

          a= 10;
          b= 10;
// it will add int values and concatination string values here
        System.out.println(a+b+firsname+Lastname );
// it will concatinate all the values considering int values also as a string
        System.out.println(firsname+Lastname+a+b);
// BODMAS - Bracket of Div, mul, add, sub
        System.out.println(firsname+Lastname+(a+b));



    }
}

/*
Output:-

       adityaKumar
       20AdityaKumar
       AdityaKumar1010
       AdityaKumar20
*/

