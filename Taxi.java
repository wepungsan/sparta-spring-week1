public class Taxi extends PublicTranfer {
    private String destination;
    private int distanceToDestination;
    private int distance;
    private int fare;
    private int farePerDistance;
    private String status;
    private int nowPassenger;
    private int maxPassenger;
    private int totalFare;
    private int cumulativeFare = 0;

    public Taxi(int no) {
        this.no = no;
        this.fare = 3000;
        this.farePerDistance = 1000;
        this.distance = 1;
        this.fuel = 100;
        this.status = "일반";
        this.speed = 0;
        this.maxPassenger = 3;
        this.totalFare = 0;

        System.out.println("no = " + this.no);
        System.out.println("주유량 = " + this.fuel);
        System.out.println("상태 = " + this.status);
    }

    public void run() {
        // 미구현
    }

    public void changeSpeed(int speed) {
        this.speed += speed;
    }

    public void changeStatus() {
        // 미구현
    }

    public void boardPassenger(int passengerNum) {
        // 미구현
    }

    public void boardPassenger(int passengerNum, String destination, int distanceToDestination) {
        if(this.fuel >= 10 && this.status.equals("일반") && this.maxPassenger >= passengerNum) {
            this.nowPassenger = passengerNum;
            this.destination = destination;
            this.distanceToDestination = distanceToDestination;

            System.out.println("탑승 승객 수 = " + this.nowPassenger);
            System.out.println("잔여 승객 수 = " + (this.maxPassenger - this.nowPassenger));
            System.out.println("기본 요금 확인 = " + this.fare);
            System.out.println("목적지 = " + this.destination);
            System.out.println("목적지까지 거리 = " + distanceToDestination + "km");

            if(this.distance < this.distanceToDestination) {
                totalFare = this.fare + (this.farePerDistance * (this.distanceToDestination - 1));

                System.out.println("지불할 요금 = " + this.totalFare);
            } else {
                totalFare = this.fare;

                System.out.println("지불할 요금 = " + this.totalFare);
            }

            this.status = "운행중";

            System.out.println("상태 = " + this.status);
        } else if(this.fuel < 10) {
            this.status = "운행불가";

            System.out.println("주유량 10 미만");
            System.out.println("운행 불가");
        } else if(this.maxPassenger < passengerNum) {
            System.out.println("최대 승객 수 초과");
        } else{
            System.out.println("탑승 불가");
        }
    }

    public void changeFuel(int fuel) {
        this.fuel += fuel;
    }

    public void payTheBill() {
        this.cumulativeFare += this.totalFare;
        this.status = "일반";

        if(this.fuel == 0) {
            System.out.println("주유량 = " + this.fuel);

            this.status = "운행불가";
            System.out.println("상태 = " + this.status);

            System.out.println("누적 요금 " + this.cumulativeFare);

            System.out.println("주유 필요");
        } else {
            System.out.println("주유량 = " + this.fuel);
            System.out.println("누적 요금 = " + this.cumulativeFare);
        }
    }

    public void changeFarePerDistance(int fare) {
        this.farePerDistance += fare;
    }
}
