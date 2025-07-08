package ex_16_Arrarys;

import java.util.Arrays;

public class hightnumber_using_sort_function {

    public static void main(String[] args) {
        int [] ary = {2,1,7,5,6};
        Arrays.sort(ary);

     //  int lengh = ary.length;

        System.out.println("Highest number in Array " +(ary[ary.length-1]));
        System.out.println("Second hight number" +(ary[ary.length-2]));
    }

}
