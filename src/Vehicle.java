public class Vehicle {
    private int max_passenger;
    private int number;
    private int refuel;
    private int speed;
    private String state;

    Vehicle(){
        this.refuel = 100;
        this.speed = 0;
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
        state = state.equals("운행") ? "차고지행" : "운행";
        System.out.println("상태 = " + state);
    }

    void boarding(){
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
