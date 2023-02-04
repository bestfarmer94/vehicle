public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.boarding(2);

        bus1.change_refuel(-50);

        bus1.change_state();
        bus1.change_refuel(10);

        bus1.change_state();
        bus1.boarding(45);
        bus1.boarding(5);

        bus1.change_refuel(-55);
        System.out.println();
        System.out.println("--------------------------------------");

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        taxi1.boarding(2, "서울역", 2);
        taxi1.change_refuel(-80);
        taxi1.pay();

        taxi1.boarding(5);
        taxi1.boarding(3, "구로디지털단지역", 12);
        taxi1.change_refuel(-20);
        taxi1.pay();
    }
}