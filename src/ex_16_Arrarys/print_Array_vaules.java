package ex_16_Arrarys;

import java.util.Scanner;

public class print_Array_vaules {

    public static void main(String[] args) {

        System.out.println("Enter the 3 characters");
        Scanner scr = new Scanner(System.in);
        char[]  charray = new char[3];

        for (int i = 0; i < 3; i++) {
            String input = scr.next(); // read as string

            charray[i] = input.charAt(0); // extract first char

        }

        System.out.println("Entered vaules in Arrya");
        for (int i = 0; i < 3; i++) {

            System.out.println(charray[i]);
        }


    }
}

/*
Output:-
        aditya
        kumar
        jakka
Entered vaules in Arrya
        a
        k
        j*/
