import javax.swing.plaf.synth.SynthListUI;

public class Room {
    private int roomNumber;
    private String roomType;
    private String guestName;
    private int numberOfNights;

    public Room() {
        this.roomNumber = 0;
        this.roomType = "";
        this.guestName = "";
        this.numberOfNights = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Room(int roomNumber, String roomType, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;

    }
    public void displayRoomDetails() {
        System.out.println("Room Number: " + this.roomNumber);
        System.out.println("Guest Name: " + this.guestName);
        System.out.println("Room Type: " + this.roomType);
        System.out.println("Number of Nights: " + this.numberOfNights);
        System.out.println("Total Cost: "+calculateRoomCost());
    }
    public double calculateRoomCost(){
        return 150 * getNumberOfNights();

    }
    public double calculateRoomCost(double discount){
        return calculateRoomCost()-(calculateRoomCost() * discount / 100) ;
    }







}
