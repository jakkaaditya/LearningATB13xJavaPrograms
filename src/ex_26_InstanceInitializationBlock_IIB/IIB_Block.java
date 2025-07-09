package ex_26_InstanceInitializationBlock_IIB;

public class IIB_Block {

    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```

    {
        System.out.println("This is the Instance block ");
    }

    public static void main(String[] args) {
        IIB_Block ib = new IIB_Block(); // IIB will call once
        IIB_Block ib2 = new IIB_Block(); // IIB will call again an new obj is created

    }
}

/*OUTPUT:-
This is the Instance block
This is the Instance block */


