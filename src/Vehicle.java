public class Vehicle {
    private int max_passenger;
    private int number;
    private int refuel;
    private int speed;
    private String state;

    Vehicle(){
        number = (int)(Math.random()*10000);
        refuel = 100;
        speed = 0;
    }

    public int getRefuel() {
        return refuel;
    }

    public int getNumber() {
        return number;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    void drive(){
        if(refuel < 10){
            System.out.println("주유량을 확인해 주세요.");
            return;
        }
        state = "운행";
    }

    void change_speed(int change){
        this.speed += change;
    }

    void change_state(){
    }

    void boarding(int number){
    }

    void change_refuel(int change){
        refuel += change;
        refuel = refuel < 0 ? 0 : refuel;
        System.out.println(refuel);

        if(refuel < 10){
            System.out.println("주유가 필요합니다.");
            change_state();
        }
    }
}
