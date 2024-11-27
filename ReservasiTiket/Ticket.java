abstract class Ticket {
    private String passengerName;
    private String flightNumber;
    private double baseFare;

    public Ticket(String passengerName, String flightNumber, double baseFare) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.baseFare = baseFare;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public abstract double calculateFare();

    @Override
    public String toString() {
        return "Passenger: " + passengerName +
               ", Flight: " + flightNumber +
               ", Fare: " + calculateFare();
    }
}