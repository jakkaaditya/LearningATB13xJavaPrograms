package ex_06_Ternary_Operator;

public class Max_of_2 {

    public static void main(String[] args) {

        int a,b;
        a =60;
        b=30;

       // System.out.println(Math.max(a,b));  This is a Predefined method to find max of 2 numbers

        String maxnumber = a>b ? "Big vaule"+a :"Big Vaule"+b;

        System.out.println(maxnumber);


    }
}

/*
Output :-

Big Vaule60*/
