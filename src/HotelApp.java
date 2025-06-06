public class HotelApp {
    public static void main(String[] args) {

        StandardRoom standardRoom = new StandardRoom();
        LuxurySuite luxurySuite = new LuxurySuite(21,"Kumar Sanga",3);

        standardRoom.isWifiIncluded();
        standardRoom.displayRoomDetails();
        System.out.println("Room Cost With Discount: "+standardRoom.calculateRoomCost(10));
        System.out.println();

        luxurySuite.isFoodAndPickup();
        luxurySuite.displayRoomDetails();
        System.out.println("Room Cost With Discount: "+luxurySuite.calculateRoomCost(10));


    }
}
