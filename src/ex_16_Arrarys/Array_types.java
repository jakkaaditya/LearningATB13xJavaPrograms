package ex_16_Arrarys;

import java.util.Scanner;

public class Array_types {
    public static void main(String[] args) {


        System.out.println("Enter the lenght");
        // Takeing the array length from input
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();

        boolean[] bl = new boolean[2];
             bl[0] = true;
             bl[1] = false;

        String[] str = new String[input];

        System.out.printf("Enter the String %d times",input);

        for (int i = 0; i < str.length; i++) {

            String vaules = scr.next();

            str[i]=vaules;

        }


    }
}
