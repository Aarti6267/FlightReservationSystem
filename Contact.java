package FlightReservation;

public class Contact {
    private long mobile_number;
    private int telephone_number;

    public Contact(long mobile_number, int telephone_number) {
        this.mobile_number = mobile_number;
        this.telephone_number = telephone_number;
    }

    public void getMobile_number() {
        System.out.println("Mobile Number "+mobile_number);
    }

    public void getTelephone_number() {
        System.out.println("Tlephone Number "+telephone_number);
    }
}



