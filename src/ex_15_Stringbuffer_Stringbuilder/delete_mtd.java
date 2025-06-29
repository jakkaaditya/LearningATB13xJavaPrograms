package ex_15_Stringbuffer_Stringbuilder;

public class delete_mtd {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("hello world");
        // this is to delete the substring
        sb.delete(2,4);

        // This are the examples of non immutabuble
        System.out.println(sb); // heo world
        sb.deleteCharAt(4); //heo orld
        System.out.println(sb);
         //replace method
        sb.replace(2,4,"llo w");
        System.out.println(sb);   //hello World


    }
}
