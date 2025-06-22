package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Count_vowels_consonants {
    public static void main(String[] args) {
        // Need to find number of Ovels and constancs in String
        System.out.println("Enter any sting in small letters");
        Scanner name = new Scanner(System.in);
        String text = name.next();
        String input= text.toLowerCase();
        int Ovels =0;
        int constancts=0;
        int _test;
        int variable2;

       //     What will be the output? for (int i = 1; i <= 3; i++) { if (i == 2) continue; System.out.print(i); }



        for( int i =0;i<input.length();i++)
        {
           // System.out.println(input.charAt(i));

            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
            {
                Ovels ++;
                            }
            else{
                constancts ++;

            }

        }
        System.out.println("Number of Ovels:" +Ovels + "\n Number of constans: " +constancts);

    }
}
