package ex_25_Interfaces;


public class Interface_Declar {

    public static void main(String[] args) {
        Document dc = new Document();
        dc.print();
        dc.show();

    }
}

interface Printable {

void show();


}
interface Showable{
    void print();
    void show();
}

class Document implements Printable,Showable{


    @Override
    public void print() {
        System.out.println("print hi");
    }

    @Override
    public void show() {
        System.out.println("print show");
    }
}