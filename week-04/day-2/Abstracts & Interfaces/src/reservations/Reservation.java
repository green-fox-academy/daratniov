package reservations;

public class Reservation implements Reservationy {
  private String reservationCode;
  private String dow;

  public Reservation() {
    reservationCode = createReservationCode();
    dow = createDow();
  }

  private String createReservationCode() {
    String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String code = "";
    for (int i = 0; i < 8; i++) {
      code += characters.charAt((int) (Math.random() * characters.length()));
    }
    return code;
  }

  private String createDow() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return days[(int) (Math.random() * 7)];
  }

  @Override
  public String getDowBooking() {
    return dow;
  }

  @Override
  public String getCodeBooking() {
    return reservationCode;
  }
}
