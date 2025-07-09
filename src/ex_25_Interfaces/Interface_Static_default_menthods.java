package ex_25_Interfaces;

public class Interface_Static_default_menthods implements Vehicles,speedlimit{

    public static void main(String[] args) {

        Interface_Static_default_menthods cr = new Interface_Static_default_menthods();
        cr.start();
        Vehicles.fuelType();  // can call directely using the Interface name as its a static method
        System.out.println(speedlimit.MAX_SPEED);
    }
}


interface Vehicles{

    // Method implementaion can be done in interfaces only if we declar it as default or Static
    default void start()
    {
        System.out.println("Vehicle started");
    }

    static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }

}

interface speedlimit{

    public static final int MAX_SPEED = 120; // Creating a constanct Varable
}

