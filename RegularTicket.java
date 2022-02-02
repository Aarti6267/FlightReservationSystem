package FlightReservation;

public class RegularTicket extends Ticket{
    //Ticket ticket;
    String food;
    boolean water;
    String snacks;


    public RegularTicket(String PNR_number, String dateOfArrival, String timeOfArrival, String dateOfDeparture, String timeOfDeparture, int durationOfJourney,
                         int ticketPrice, int seatNumber, String food, boolean water, String snacks) {
        super(PNR_number, dateOfArrival, timeOfArrival, dateOfDeparture, timeOfDeparture, durationOfJourney, ticketPrice, seatNumber);
       // this.ticket = ticket;
        this.food = food;
        this.water = water;
        this.snacks = snacks;
    }

    @Override
    public void printPNR() {
        System.out.println("Printing details from Regular Ticket");
        System.out.println("PNR number "+  PNR_number);
    }

    @Override
    public void printSeatNumber() {
        System.out.println("Seat number "+seatNumber);
    }

    @Override
    public void printTicketPrice() {
        System.out.println("Ticket price "+ticketPrice);
    }

    @Override
    public void printDateOfArrival() {
        System.out.println("Date of arrival "+dateOfArrival);
    }

    @Override
    public void printTimeOfArrival() {
        System.out.println("Time of arrival "+timeOfArrival);

    }



        @Override
        public void printTimeOfDeparture() {
        System.out.println("Time of departure "+timeOfDeparture);
            System.out.println();
            System.out.println();
    }

    @Override
    public void printDateOfDeparture() {
        System.out.println("Date of departure "+dateOfDeparture);
    }

    @Override
    public void printDurationOfJourney() {
        System.out.println("Duration of Journey "+durationOfJourney);

    }
}
