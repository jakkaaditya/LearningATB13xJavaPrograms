package ex_16_Arrarys;



public class declar {
    public static void main(String[] args) {
     // 1 way with predefined way
        int[] nbr = {1,2,3,4};
        System.out.println("Firat method lenght: " +nbr.length);
        System.out.println("method1: " +nbr[0]);
        System.out.println("method1: " +nbr[1]);
        System.out.println("method1: " +nbr[2]);
        // 2rd way of declaring
        int[] ar = new int[3];
// to insert values into array we need to pass with index number starting from 0
        ar[0] = 2;
        ar[1]=3;
        ar[2]=4;
       // ar[3]=5;  can not enter this as array size is 3 only.
                    // Array index will start from 0 and length will start from 1

        System.out.println("Second method lenght: " +ar.length);
        System.out.println("method2: " +ar[0]);
        System.out.println("method2: " +ar[1]);
        System.out.println("method2: " +ar[2]);

    }
}

/*
Output :
Firat method lenght: 4
method1: 1
method1: 2
method1: 3
Second method lenght: 3
method2: 2
method2: 3
method2: 4*/
