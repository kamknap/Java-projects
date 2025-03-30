import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReservationService reservationService = new ReservationService();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add reservation");
            System.out.println("2. Show all reservations");
            System.out.println("3. Delete reservation");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter the name of the reservation");
                    String name = scanner.nextLine();
                    System.out.println("Enter the date of the reservation");
                    String date = scanner.nextLine();
                    reservationService.addReservation(name, date);
                    System.out.println("Reservation added");
                    break;
                case 2:
                    for (Reservation r : reservationService.getAllReservations()) {
                        System.out.println("id: " + r.getId() + " name: " + r.getName() + " date: " + r.getDate());
                    }
                    break;
                case 3:
                    System.out.println("Enter the id of the reservation");
                    int id = scanner.nextInt();
                    reservationService.deleteReservation(id);
                    System.out.println("Reservation deleted");
                    break;
                case 4:
                    System.out.println("Quitting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}