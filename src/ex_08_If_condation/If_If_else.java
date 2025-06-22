package ex_08_If_condation;

import java.util.Scanner;

class Main {

    static int i;

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();

        ifelse_method();
    }
 /*Declared this metode as static because we need to call this method in main function.
  Main method is a static method. Static method can call only static methods   */
    public static void ifelse_method()
    {

        if(i<10)
        {
            System.out.print("given number is less then 10");
        }
        else if(i == 10)
        {
            System.out.println ("given number is 10");
        }
        else
        {
            System.out.println("Given number is not 10");
        }

    }
}