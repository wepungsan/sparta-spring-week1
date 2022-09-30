public class Bus extends PublicTranfer {
    private int nowPassenger;
    private int fare;
    private String status;

    public Bus(int no) {
        this.no = no;
        this.nowPassenger = 0;
        this.maxPassenger = 30;
        this.status = "운행";
        this.fare = 1000;
        this.fuel = 100;

        System.out.println("버스 no = " + this.no);
    }

    public void run() {

    }

    public void changeFuel(int fuel) {
        this.fuel += fuel;

        if(this.fuel <= 10) {
            this.status = "차고지행";
        }

        if(this.status.equals("운행")) {
            System.out.println("주유량 = " + this.fuel);
        } else {
            System.out.println("상태 = " + this.status);
            System.out.println("주유량 = " + this.fuel);

            if(this.fuel <= 10) {
                System.out.println("주유 필요");
            }
        }
    }

    public void changeSpeed(int speed) {
        if(this.fuel <= 10) {
            System.out.println("주유량을 확인해 주세요");
        } else {
            this.speed += speed;
        }
    }

    public void changeStatus() {
        if(this.status.equals("운행")) {
            this.status = "차고지행";
            this.nowPassenger = 0;
        } else {
            this.status = "운행";
        }
    }

    public void boardPassenger(int passengerNum) {
        if(this.status.equals("운행") && this.nowPassenger <= this.maxPassenger) {
            this.nowPassenger += passengerNum;
        } else {
            System.out.println("최대 승객 수 초과");
        }

        System.out.println("탑승 승객 수 = " + this.nowPassenger);
        System.out.println("잔여 승객 수 = " + (this.maxPassenger - this.nowPassenger));
        System.out.println("요금 확인 = " + (this.nowPassenger*this.fare));
    }
}
