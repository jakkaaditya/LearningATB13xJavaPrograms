package Test_Exam;

public class String_compar {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2= "hello";
        String str3 ="Hello";
        boolean result;
        System.out.println(" ==" + str1==str3);
        System.out.println("equals() " + str1.equals(str2));
        System.out.println("Equal ignore " +str1.equalsIgnoreCase(str2));
        System.out.println("compareto() " +str1.compareTo(str2));



    }
}
