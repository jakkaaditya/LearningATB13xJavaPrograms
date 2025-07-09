package ex_29_Wrapper;

public class Converstions {

    public static void main(String[] args) {
        int a =10;
        Integer b =a; // This Boxing -> automatically JVM will store the value
// Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());

        Integer cb = 43;
        int ab = cb; // Unboxing -> wrapper is removed, attribute, behaviour is lost
        System.out.println("Interger value" + ab);
    }
}
