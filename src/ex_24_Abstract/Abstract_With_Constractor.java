package ex_24_Abstract;

public class Abstract_With_Constractor{
    public static void main(String[] args) {
        usage ct = new usage();

      //  ct.constr_usage();
        ct.normal();
       //  constr_usage cr = new constr_usage(); can not create it directely bcz implemtion method should create

        usage ug =new usage();// Create a new obj again to call the Constractor automaticaly
        ug.absrt();
    }

}

abstract class constr_usage
{

   abstract void absrt();

      constr_usage()  // constractor can not be declared as a ABSTRACT & it should not have any return type not even void
              // if we give it will be consider as a normal method
    {
        System.out.println("Hi calling you from constractor");
    }

    void normal() {
        System.out.println(" this normal method withou abstract");
    }


}

class usage extends constr_usage
{
    @Override
    void absrt()
    {
        System.out.println("test");
    }

}

/*
Output :-
Hi calling you from constractor
 this normal method withou abstract
Hi calling you from constractor
test
*/
