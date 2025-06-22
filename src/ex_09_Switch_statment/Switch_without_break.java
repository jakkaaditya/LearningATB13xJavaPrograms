package ex_09_Switch_statment;
import java.util.Scanner;

public class Switch_without_break {
    public static void main(String[] args) {
        String Browser;
        System.out.println("Enter the browser name");

        Scanner scan = new Scanner(System.in);
        Browser = scan.next().toLowerCase();
       // Browser.equalsIgnoreCase();

         switch (Browser)
         {
             case "chrome":
                 System.out.println("This is for chrome");
             case "firefox":
                 System.out.println("This is for firefox");
         }
    }

}
/*
We are getting 2 cases executed eventhought 1 case is matching becasuse we are not using break statment;

input and out

        CHROME
This is for chrome
This is for firefox*/
