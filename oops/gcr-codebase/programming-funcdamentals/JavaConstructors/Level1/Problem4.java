class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName,
                 String roomType,
                 int nights) {

        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println(
                guestName + " " +
                roomType + " " +
                nights
        );
    }
}

public class Problem4 {
    public static void main(String[] args) {

        HotelBooking h1 =
                new HotelBooking("Ishu",
                        "Deluxe", 3);

        HotelBooking h2 =
                new HotelBooking(h1);

        h2.display();
    }
}