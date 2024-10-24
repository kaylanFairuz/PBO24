import java.util.Scanner;

/**
 * Main adalah kelas tempat mengoperasikan
 * ParkingTicketMachine
 */
public class Main
{
    
    
    public static void main(String[] args) {
        ParkingTicketMachine park = new ParkingTicketMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Parking Ticket Machine the current price rate is:");
        System.out.println(park.getTicketPrice() + " rupiah/hour");
        System.out.println("");
        System.out.println("Balance: " + park.getBalance());
        System.out.println("Options: ");
        System.out.println("1. Insert money");
        System.out.println("2. Print tickets");
        System.out.println("3. Quit");

        while(true) {
            System.out.print("Enter your number option: ");
            int pilihan = scanner.nextInt();
                
            if (pilihan == 1) {
                System.out.println("Enter the amount you want to insert: ");
                int jumlah = scanner.nextInt();
                park.insertMoney(jumlah);
            } else if (pilihan == 2) {
                park.issueTicket();
            } else if (pilihan == 3) {
                System.out.println("Thank you. Goodbye");
                break;
            }
        }

        scanner.close();
    }
}
