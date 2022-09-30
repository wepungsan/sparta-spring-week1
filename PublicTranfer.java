abstract public class PublicTranfer {
    protected int no;
    protected int fuel;
    protected int speed;
    protected int changeSpeed;
    protected int maxPassenger;

    public PublicTranfer() {

    }

    public PublicTranfer(int no) {
        this.no = no;
        this.fuel = 100;
        this.speed = 0;
    }

    abstract public void run();

    abstract public void changeSpeed(int speed);

    abstract public void changeStatus();

    abstract public void boardPassenger(int passengerNum);
}
