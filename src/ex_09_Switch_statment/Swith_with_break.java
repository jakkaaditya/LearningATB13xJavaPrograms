package ex_09_Switch_statment;
import java.util.Scanner;
public class Swith_with_break {


        public static void main(String[] args) {
            System.out.println("Give the browser you want");
            Scanner scan = new Scanner(System.in);
            String Browser = scan.next().toLowerCase();
            selection(Browser);

        }

        public static void selection(String select)
        {
            switch(select)
            {
                case "chrome":
                    System.out.println("This is for chrome");
                    break;

                case "firefox":
                    System.out.println("This is for firefox");
                    break;

                default :
                    System.out.println("please enter the browser name correctely");


            }

        }
    }

 /*   output1 :
Give the browser you want
        CHROME
This is for chrome*/

/*
output 2 : when any case not match default with run
Give the browser you want
        dsfasfsa
please enter the browser name correctely

=== Code Execution Successful ===
*/
