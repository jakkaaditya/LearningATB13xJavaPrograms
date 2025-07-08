package ex_25_Interfaces;

public class Polymorfisiam {
    public static void main(String[] args) {
        Playable pl = new Guitar();
        Playable pl2 = new Piano();

        pl.play();
        pl2.play();

    }
}



interface Playable {
    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Guitar class");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano class");
    }
}