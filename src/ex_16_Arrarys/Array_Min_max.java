package ex_16_Arrarys;
import java.util.Scanner;

public class Array_Min_max {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sr = new Scanner(System.in);
        int Arraysize = sr.nextInt();

        int[] ar1 = new  int[Arraysize];
        // entering the vaules from user
        for(int i= 0;i<ar1.length;i++)
        {
            System.out.printf("Enter the %d number",i);
            ar1[i] = sr.nextInt();
        }

        //finding the max in the array
          int max = ar1[0];
        for(int i = 0; i<ar1.length;i++)
        {

            if(ar1[i]>max)
            {
               max =ar1[i] ;
            }

        }
        System.out.println("higest number" + max);

         //  finding the min number
        int min = ar1[0];
        for(int i=0;i<ar1.length;i++)
        {
            if(ar1[i]<min)
            {
                min = ar1[i];
            }

        }
        System.out.println("min number" + min);

    }

}
