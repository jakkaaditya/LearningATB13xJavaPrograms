package Test_Exam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Manipulation_Basics {
    public static void main(String[] args) {
        System.out.println("Enter the String ");

        Scanner scr = new Scanner(System.in);

        String input = scr.nextLine();
        String nospace= input.trim();
        System.out.println("Lenght of the String " + nospace.length());
        System.out.println("First char "+nospace.charAt(0));
       // System.out.println(nospace);

        if(nospace.length()>=5) {
            System.out.println("Give sub string " + nospace.substring(5, nospace.length()));
        }
        else
        {
            System.out.println("give sub string " +nospace);
        }


    }
}
