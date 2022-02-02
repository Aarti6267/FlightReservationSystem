package FlightReservation;

public abstract class Ticket {
     String PNR_number;
     String dateOfArrival;
     String timeOfArrival;
    String dateOfDeparture;
    String timeOfDeparture;
    int durationOfJourney;
    int ticketPrice;
    int seatNumber;
    Flight flight;

    public Ticket(String PNR_number, String dateOfArrival, String timeOfArrival, String dateOfDeparture, String timeOfDeparture,
                  int durationOfJourney, int ticketPrice, int seatNumber) {
        this.PNR_number = PNR_number;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.durationOfJourney = durationOfJourney;
        this.ticketPrice = ticketPrice;
        this.seatNumber = seatNumber;
        //this.flight = flight;
    }

    public abstract void printPNR();
    public abstract void printSeatNumber();
    public abstract void printTicketPrice();
    public abstract void printDateOfArrival();
    public abstract void printTimeOfArrival();
    public abstract void printTimeOfDeparture();
    public abstract void printDateOfDeparture();
    public abstract void printDurationOfJourney();

}

