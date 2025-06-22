package ex_01_Java_Basic;

public class Multiple_mainmethods {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        main();
        main(10,20);
    }

    static void main()
    {
        System.out.println("Testing");
    }

    static void main(int i, int j)
    {
        System.out.println("with paramaers");
    }
}

/*
output:-
Try programiz.pro
        Testing
with paramaers*/
