package ex_07_Incremental_decmetal_Operator;

public class inc_dec_operator {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);


    }
}

/*
Output:
x=9
y=28
explanation: y=  (5+7)+(7+9)=28
*/
