public class LuxurySuite extends Room {
    private boolean foodAndPickup;

    public LuxurySuite() {
        super();
        this.foodAndPickup = false;

    }

    public boolean isFoodAndPickup() {
        return true;
    }

    public void setFoodAndPickup(boolean foodAndPickup) {
        this.foodAndPickup = foodAndPickup;
    }

    public LuxurySuite(int roomNumber, String guestName, int numberOfNights ){
        super(roomNumber, "Luxary Suite", guestName, numberOfNights);
        this.foodAndPickup = isFoodAndPickup();

    }

    @Override
    public double calculateRoomCost() {
        double serviceFee = 0;
        if(isFoodAndPickup()){
            serviceFee = 75;
        }
        return 200 * getNumberOfNights() + serviceFee;
    }

    @Override
    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Food and pickup: " + isFoodAndPickup());
    }
}
