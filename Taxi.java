public class Taxi {
    private int taxi_no;
    private int fuel;
    private int now_speed;
    private String destination;
    private int distance;
    private int distanceToDestination;
    private int fare;
    private int farePerDistance;
    private int totalFare;
    private String status;

    public Taxi(int taxi_no) {
        this.taxi_no = taxi_no;
        this.distance = 30;
        this.fare = 10;
        this.farePerDistance = 5;
        this.totalFare = 0;
    }

    public void run() {
        if(this.fuel >= 10) {
            this.status = "운행";
        }
    }

    public void passengersBoard(int num) {
        if(this.status.equals("일반")) {
            this.status = "운행";
        } else {
            System.out.println("탑승 불가");
        }
    }

    public void changeSpeed(int speed) {
        this.now_speed += speed;
    }

    public void FarePerDistance(int distanceToDestination) {
        if(this.distance < distanceToDestination) {
            this.totalFare = this.fare + this.farePerDistance;
        } else {
            this.totalFare = this.fare;
        }
    }

    public void showPayment() {
        System.out.println(this.totalFare);
    }
}
