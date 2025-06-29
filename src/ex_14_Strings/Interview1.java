package ex_14_Strings;

public class Interview1 {
    public class Lab135_String_Immutable {
        public static void main(String[] args) {
            String s1 ="test";
            String s2 = "test";
            String s3 = "Adi";

            String ob1 = new String("Adi");
            String ob2 = new String ("adi");
            String ob3  = new String("Adi");

            System.out.println(s1==s2); //\\true
            System.out.println(s1==s3); //\\false
            System.out.println(s1==ob1); //\\false
            System.out.println(ob1==ob3); //\\false

            System.out.println(s1.equals(s2)); //\\true
            System.out.println(s1.equals(s3));  //\\false
            System.out.println(s3.equals(ob1));  //\\true
            System.out.println(ob1.equalsIgnoreCase(ob2)); //\\true


            //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
            //  == - check for the ref
            // = assignment the value


        }
    }
}
