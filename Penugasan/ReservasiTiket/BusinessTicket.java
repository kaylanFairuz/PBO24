class BusinessTicket extends Ticket {

    public BusinessTicket(String passengerName, String flightNumber, double baseFare) {
        super(passengerName, flightNumber, baseFare);
    }

    @Override
    public double calculateFare() {
        return getBaseFare() * 1.25;
    }
}