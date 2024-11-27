class FirstClassTicket extends Ticket {

    public FirstClassTicket(String passengerName, String flightNumber, double baseFare) {
        super(passengerName, flightNumber, baseFare);
    }

    @Override
    public double calculateFare() {
        return getBaseFare() * 1.50;
    }
}