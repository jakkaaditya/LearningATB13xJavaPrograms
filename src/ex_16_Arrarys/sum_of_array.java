package ex_16_Arrarys;

public class sum_of_array {

    public static void main(String[] args) {

        int [] sum = new int[4];

        sum [0] = 1;
        sum[1] = 2;
        sum[2] =6;
        sum[3] = 6;
        int total =0;

        for (int i =0;i<sum.length;i++)
        {
            total = total +sum[i];
        }

        System.out.println("sum " +total);

    }
}
