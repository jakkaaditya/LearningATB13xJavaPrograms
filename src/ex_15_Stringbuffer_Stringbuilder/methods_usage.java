package ex_15_Stringbuffer_Stringbuilder;

public class methods_usage {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test");
        sb.append("from");
        sb.append(123);
        System.out.println(sb); //Testfrom123
        // predefiend reverse function to reverse the String
        System.out.println(sb.reverse());  //321morftseT
        sb.insert(3,20);
        System.out.println(sb); //Tes20tfrom123

    }
}
