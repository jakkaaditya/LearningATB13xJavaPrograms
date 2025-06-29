package ex_15_Stringbuffer_Stringbuilder;

public class Convert_buffer_String {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("Its not a String");
        System.out.println(sb);
        System.out.println("buffer: " + sb.length());


        // Converted to String. Nothing will change in vaule but cannot use string buffer as String
        String st = sb.toString();
        System.out.println("String: " + st.length());
        System.out.println(st);


    }
}
