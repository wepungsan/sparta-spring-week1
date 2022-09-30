public class Main {
    public static void main(String[] args) {
        Bus aBus = new Bus(10);
        Bus bBus = new Bus(20);

        aBus.boardPassenger(2);
        aBus.changeFuel(-50);
        aBus.changeStatus();
        aBus.changeFuel(10);
        aBus.changeStatus();
        aBus.boardPassenger(45);
        aBus.boardPassenger(5);
        aBus.changeFuel(-55);

        Taxi aTaxi = new Taxi(30);
        Taxi bTaxi = new Taxi(40);

        aTaxi.boardPassenger(2, "서울역", 2);
        aTaxi.changeFuel(-80);
        aTaxi.payTheBill();
        aTaxi.boardPassenger(5, "가양역", 5);
        aTaxi.boardPassenger(3, "구로디지털단지역", 12);
        aTaxi.changeFuel(-20);
        aTaxi.payTheBill();
    }
}
