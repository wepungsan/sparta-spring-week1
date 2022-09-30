public class Bus {
    private int max_passenger;
    private int now_passenger;
    private int fare;
    private int bus_no;
    private int fuel;
    private int now_speed;
    private String status;

    public Bus(int bus_no) {
        this.bus_no = bus_no;
        this.status = "운행";
        this.max_passenger = 50;
        this.now_passenger = 0;
        this.fare = 500;
        this.fuel = 100;
        this.now_speed = 30;
    }

    public void run() {
        this.status = "운행";
    }

    public void checkFuel() {
        if(this.fuel < 10) {
            System.out.println("주유가 필요하다.");
        } else if(this.fuel == 0) {
            this.status = "차고지행";
        }
    }

    public void stopRunning() {
        this.status = "차고지행";
    }

    public void passengersBoard(int num) {
        if(num < this.max_passenger && this.status.equals("운행")) {
            this.now_passenger += num;
        } else {
            System.out.println("최대 승객수를 초과했습니다.");
        }
    }

    public void changeSpeed(int speed) {
        if(this.fuel >= 10) {
            this.now_speed += speed;
        } else {
            System.out.println("주유량을 확인해주세요");
        }
    }
}
