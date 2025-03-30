import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationServiceTest {

    private ReservationService reservationService;

    @BeforeEach
    public void setUp() {
        reservationService = new ReservationService();
    }

    @Test
    public void testAddReservation() {
        Reservation reservation = reservationService.addReservation("Test User", "10.10.2027");

        assertEquals(1, reservation.getId());
        assertEquals("Test User", reservation.getName());
        assertEquals("10.10.2027", reservation.getDate());
    }

    @Test public void testAddMultipleReservations() {

        for (int i = 0; i < 5; i++) {
            reservationService.addReservation("Test User" + i, "10.10.2027");
        }

        List<Reservation> reservations = reservationService.getAllReservations();
        
        for (int i = 0; i < reservations.size(); i++) {
            assertEquals(i + 1, reservations.get(i).getId());
        }
    }

    @Test
    public void testDeleteReservation() {
        Reservation reservation = reservationService.addReservation("Delete User", "10.10.2027");

        reservationService.deleteReservation(reservation.getId());

        assertTrue(reservationService.getAllReservations().isEmpty());
    }

    @Test
    public void testDeleteNonExistingReservation() {
        reservationService.addReservation("Delete User", "10.10.2027");

        reservationService.deleteReservation(99);

        assertEquals(1, reservationService.getAllReservations().size());
    }

    @Test
    public void testGetAllReservations() {
        for (int i = 0; i < 5; i++) {
            reservationService.addReservation("Test User" + i, "10.10.2027");
        }

        List<Reservation> reservations = reservationService.getAllReservations();

        //check size
        assertEquals(5, reservations.size());

    }
}
