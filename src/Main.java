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

    }
}