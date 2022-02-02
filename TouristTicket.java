package FlightReservation;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private  String location;

    public TouristTicket(String PNR_number, String dateOfArrival, String timeOfArrival, String dateOfDeparture, String timeOfDeparture,
                         int durationOfJourney, int ticketPrice, int seatNumber, String hotelAddress, String location) {
        super(PNR_number, dateOfArrival, timeOfArrival, dateOfDeparture, timeOfDeparture, durationOfJourney, ticketPrice, seatNumber);
        this.hotelAddress = hotelAddress;
        this.location = location;
    }

    @Override
    public void printPNR() {
        System.out.println("Printing details from Tourist Ticket");
        System.out.println("PNR number "+ PNR_number);
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
    }

    @Override
    public void printDateOfDeparture() {
        System.out.println("Date of departure "+dateOfDeparture);
    }

    @Override
    public void printDurationOfJourney() {
        System.out.println("Duration of Journey "+durationOfJourney);
    }

    public void getHotelAddress() {
        System.out.println("Hotel Address "+hotelAddress);
    }

    public void getLocation() {
        System.out.println("Location "+location);
    }
}
