public class AirlineReservationSystem {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyTicket("John Doe", "FL123", 100.0);
        Ticket businessTicket = new BusinessTicket("Jane Smith", "FL456", 200.0);
        Ticket firstClassTicket = new FirstClassTicket("Alice Johnson", "FL789", 300.0);

        System.out.println(economyTicket);
        System.out.println(businessTicket);
        System.out.println(firstClassTicket);
    }
}