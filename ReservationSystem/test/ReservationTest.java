import org.junit.Test;
import static org.junit.Assert.*;

public class ReservationTest {
    @Test
    public void testReservationConstructor() {
        Reservation reservation = new Reservation(1, "Test User", "10.10.2027");

        assertEquals(1, reservation.getId());
        assertEquals("Test User", reservation.getName());
        assertEquals("10.10.2027", reservation.getDate());
    }
}
