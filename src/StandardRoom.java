public class StandardRoom extends Room {
    private boolean wifiIncluded;

    public StandardRoom() {
        super();
        this.wifiIncluded = false;

    }
    public StandardRoom(int roomNumber, String guestName, int numberOfNights ){
        super(roomNumber, "Standard Room", guestName, numberOfNights);
        this.wifiIncluded = isWifiIncluded();

    }

    public double calculateRoomCost(){
        return 100 * getNumberOfNights();
    }

    public boolean isWifiIncluded() {
        return true;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public void displayRoomDetails(){
        super.displayRoomDetails();
        System.out.println("WiFi Included : "+ isWifiIncluded());

    }

}
