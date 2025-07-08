package ex_16_Arrarys;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        System.out.println("Enter the array");

        int[] ary = {1,2,4,5,6};

        for (int i = ary.length-1; i <= 0 ; i--) {

            System.out.println(ary[i]);

        }
        Arrays.sort(ary); // this method is used to sort the array in dec order

    }
}
