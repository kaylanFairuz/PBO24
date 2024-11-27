class EconomyTicket extends Ticket {

    public EconomyTicket(String passengerName, String flightNumber, double baseFare) {
        super(passengerName, flightNumber, baseFare);
    }

    @Override
    public double calculateFare() {
        return getBaseFare() * 0.90;
    }
}