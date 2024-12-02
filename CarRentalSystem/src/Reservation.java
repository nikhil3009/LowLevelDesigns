import Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    Vehicle obj;
    User user;
    Date bookingDate;
    Date bookedFrom;
    Date bookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType type;
    ReservationStatus resStatus;
    Location loc;

    public int createReservation(Vehicle vh, User user){

      return reservationId;
    }

}
