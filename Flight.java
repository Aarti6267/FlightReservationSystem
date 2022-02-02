package FlightReservation;

public class Flight {
    private long flightNumber;
    private  String airlineOfFlight;
    private  int numberOfSeat;
    private  boolean availabilityOfSeats;

    public Flight(long flightNumber, String airlineOfFlight, int numberOfSeat, boolean availabilityOfSeats) {
        this.flightNumber = flightNumber;
        this.airlineOfFlight = airlineOfFlight;
        this.numberOfSeat = numberOfSeat;
        this.availabilityOfSeats = availabilityOfSeats;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineOfFlight() {
        return airlineOfFlight;
    }

    public void setAirlineOfFlight(String airlineOfFlight) {
        this.airlineOfFlight = airlineOfFlight;
    }

    public int getNumberOfseat() {
        return numberOfSeat ;
    }

    public void setNumberOfseat(int numberOfseat) {
        this.numberOfSeat = numberOfseat;
    }

    public boolean isAvailabilityOfSeats() {
        return availabilityOfSeats;
    }

    public void setAvailabilityOfSeats(boolean availabilityOfSeats) {
        this.availabilityOfSeats = availabilityOfSeats;
    }
}

