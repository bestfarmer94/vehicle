class Bus extends Vehicle {
    private int now_passenger;
    private int max_passenger;
    private int cost;

    Bus() {
        super.setState("운행");
        max_passenger = 30;
        now_passenger = 0;
        cost = 1000;
        System.out.println(super.getNumber() + "번 버스객체 만들어짐!");
    }

    void boarding(int number) {
        int after_passenger = now_passenger + number;

        if (super.getState().equals("운행")) {
            if(number > max_passenger){
                System.out.println("최대 승객 수를 초과했습니다.");
            }else{
                now_passenger = after_passenger;
                System.out.println("탑승 승객 수 = " + number);
                System.out.println("잔여 승객 수 = " + (max_passenger - now_passenger));
                System.out.println("요금 확인 = " + cost * number);
            }
        }
    }

    void change_state() {
        super.setState(super.getState().equals("운행") ? "차고지행" : "운행");
        System.out.println("상태 = " + super.getState());
    }
}
