import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private final ArrayList<Reservation> reservations = new ArrayList<>();
    private int nextInt = 1;

    public Reservation addReservation(String name, String date) {
        Reservation reservation = new Reservation(nextInt++, name, date);
        reservations.add(reservation);
        return reservation;
    }

    public List<Reservation> getAllReservations(){
        return reservations;
    }

    public void deleteReservation(int id) {
        reservations.removeIf(reservation -> reservation.getId() == id);
    }
}
