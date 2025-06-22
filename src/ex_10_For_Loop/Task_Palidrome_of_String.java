package ex_10_For_Loop;

public class Task_Palidrome_of_String {
    public static void main(String[] args) {
        //Madam --> Reverse string--> Madam
        String input = "Madam";
        String Reverse;
         int string_size= input.length();

        for( int i=0;i<string_size/2;i++)
        {
            if (input.charAt(i) !=input.charAt(string_size--))
            {
                Boolean ispalandrom = false;
                break;
            }
            else if(i<10)
            {

            }

        }


    }
}
