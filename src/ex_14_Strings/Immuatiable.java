package ex_14_Strings;

public class Immuatiable {

        public static void main(String[] args) {
            String name = "Pramod";// SCP
            String name2 = "Aditya";
            // It will not print in cap as we didnot assigned back to variaable
            name.toUpperCase();
            System.out.println(name);
            // It will print in upper case and new vaule is stored in SCP(String constant poll).
            // Thats why string are immuatible, It will not overwrite
             name2 = name2.toUpperCase(); // PRAMOD
            System.out.println(name2);


        }
    }

    /*Output:
     Pramod
        ADITYA*/