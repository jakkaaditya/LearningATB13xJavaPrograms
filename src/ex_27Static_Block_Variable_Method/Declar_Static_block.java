package ex_27Static_Block_Variable_Method;

public class Declar_Static_block {
    public static void main(String[] args) {
        hello h = new hello();
        hello h2 = new hello();

        h.a= 20;

        h.b=30;
        System.out.println(hello.a); // Can call this variable with class name directely as its static
        System.out.println("Calling with 1st obj" + h.a);
        System.out.println("Calling with 1st obj" +h.b);

    }

}


class hello
{
  static int a =10;
  int b =10;
    // This is static block.
    // This is called whenever a class a loaded.
    static {

        System.out.println("This is a static block");
    }

    {
        System.out.println("This is IIB");
    }
}