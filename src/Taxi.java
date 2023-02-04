public class Taxi extends Vehicle{
    private int number;
    private String destination;
    private int distance_base;
    private int distance;
    private int rate_base;
    private int rate_distance;
    private int max_passenger;
    private int now_passenger;
    private int charge;
    private int today_profit;
    private String state;

    Taxi(){
        max_passenger = 4;
        rate_base = 3000;
        rate_distance = 1000;
        distance_base = 1;
        state = "일반";
        System.out.println(super.getNumber() + "번 택시 생성");
        System.out.println("주유량 = " + super.getRefuel());
        System.out.println("상태 = " + state);
    }

    void boarding(int number){
        if(number > max_passenger){
            System.out.println("최대 승객 수를 초과했습니다.");
        }
    }

    void boarding(int now_passenger, String destination, int distance){
        if(!state.equals("일반")){
            System.out.println("탑승불가");
            return;
        }

        this.now_passenger = now_passenger;
        this.destination = destination;
        this.distance = distance;

        System.out.println("탑승 승객 수 = " + now_passenger);
        System.out.println("잔여 승객 수 = " + (max_passenger - now_passenger));
        System.out.println("기본 요금 확인 = " + rate_base);
        System.out.println("목적지 = " + destination);
        System.out.println("목적지까지 거리 = " + distance);

        calculate_charge(distance - distance_base);
        state = "운행중";
        System.out.println("상태 = " + state);
    }

    void calculate_charge(int difference){
        charge = difference * rate_distance + rate_base;
        System.out.println("지불할 요금 = " + charge);
    }

    void pay(){
        today_profit += charge;
        System.out.println("누적 요금 = " + today_profit);
        state = "일반";
    }

    void change_state(){
        state = "운행불가";
        System.out.println("상태 = " + state);
    }
}
