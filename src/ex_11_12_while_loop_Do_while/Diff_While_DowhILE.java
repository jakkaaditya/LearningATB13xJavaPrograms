package ex_11_12_while_loop_Do_while;

public class Diff_While_DowhILE {

    public static void main(String[] args) {
        int a = 0;

      while(a<0){
           System.out.println("while" +a);
            a++;
        }

        do {
            System.out.println("do while" +a);
            a++;

        } while (a < 0);


    }
}

/*
output:-
        do while0*/
