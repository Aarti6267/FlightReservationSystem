import FlightReservation.*;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        long regular,tourist;
        System.out.println("______Flight Reservation System________");
        System.out.println("Press 1 for Regular Ticket:");
        System.out.println("Press 2 for Tourist Ticket");
        int choice = sc.nextInt();



        switch (choice) {
            case 1:
            { System.out.println("First Create Your Profile, By giving Basic Details ");
                Scanner s =  new Scanner(System.in);
                System.out.println("Enter your name");
                String name = s.nextLine();
                System.out.println("Enter your email:");
                String email = s.nextLine();
                System.out.println("Enter your gender:");
                String gender = s.nextLine();
                Passenger passenger = new Passenger(0123,name,email,gender);
                System.out.println("Address Details:");
                System.out.println("Enter street:");
                String street = s.nextLine();
                System.out.println("Enter city:");
                String city = s.nextLine();
                System.out.println("Enter state:");
                String state = s.next();
                System.out.println("Enter Postal Code:");
                int postalCode = s.nextInt();
                System.out.println("Enter Country name");
                String country = s.next();

                Address address = new Address(street,city,state,postalCode,country);

                System.out.println("Enter mobile Number:");
                long mobile = s.nextLong();
                System.out.println("Enter Telephone Number:");
                int telephone = s.nextInt();
                Contact contact = new Contact(mobile,telephone);



                    //System.out.println("PNR number for Regular Ticket");
                    String abc = createPNR();
                    RegularTicket ticket = new RegularTicket(abc,"22 feb","4:00 AM","22 feb",
                        "5:00",6,5000,21,"Vef Thali",true,"Pasta");

                    printTicketDetails(ticket);
                    printPassengerDetails(passenger);
                    printAddressDetails(address);
                    printContactDetails(contact);
                    break;
            }
            case 2:
            {   System.out.println("First Create Your Profile, By giving Basic Details ");
                Scanner s =  new Scanner(System.in);
                System.out.println("Enter your name");
                String name = s.nextLine();
                System.out.println("Enter your email:");
                String email = s.nextLine();
                System.out.println("Enter your gender:");
                String gender = s.nextLine();
                Passenger passenger = new Passenger(0123,name,email,gender);
                System.out.println("Address Details:");
                System.out.println("Enter street:");
                String street = s.nextLine();
                System.out.println("Enter city:");
                String city = s.nextLine();
                System.out.println("Enter state:");
                String state = s.next();
                System.out.println("Enter Postal Code:");
                int postalCode = s.nextInt();
                System.out.println("Enter Country name");
                String country = s.next();

                Address address = new Address(street,city,state,postalCode,country);

                System.out.println("Enter mobile Number:");
                long mobile = s.nextLong();
                System.out.println("Enter Telephone number:");
                int telephone = s.nextInt();

                Contact contact = new Contact(mobile,telephone);



                 System.out.println("PNR number for Tourist Ticket");
                String abc = createPNR();
                TouristTicket touristticket = new TouristTicket(abc,"23 feb","4:00 AM","23 feb","5:00 AM",
                        6,10000,12,"Napier Town","Jabalpur");
                printTicketDetails(touristticket);
                printPassengerDetails(passenger);
                printAddressDetails(address);
                printContactDetails(contact);
                break;

            }

            default:
            { System.out.println("Invalid Choice-----------");
               break;
            }
        }



    }

    public static void printTicketDetails(RegularTicket ticket){

        ticket.printPNR();
        ticket.printSeatNumber();
        ticket.printTicketPrice();
        ticket.printDateOfArrival();
        ticket.printTimeOfArrival();
        ticket.printDurationOfJourney();
        ticket.printDateOfDeparture();
        ticket.printTimeOfDeparture();


    }
    public static void printTicketDetails(TouristTicket ticket){

        ticket.printPNR();
        ticket.printSeatNumber();
        ticket.printTicketPrice();
        ticket.printDateOfArrival();
        ticket.printTimeOfArrival();
        ticket.printDurationOfJourney();
        ticket.printDateOfDeparture();
        ticket.printTimeOfDeparture();
        ticket.getHotelAddress();
        ticket.getLocation();

    }
    public static void printPassengerDetails(Passenger passenger){
        System.out.println("Passenger Basic Details:");
        passenger.getName();
        passenger.getGender();
        passenger.getGender();
    }
    public static void printAddressDetails(Address address){
        address.getCountry();
        address.getState();
        address.getPostalCode();
        address.getCity();
        address.getStreet();
    }
    public static void  printContactDetails(Contact contact){
        contact.getMobile_number();
        contact.getTelephone_number();
    }
    public static String createPNR(){
        String pnr = "";
        Random rand = new Random();
        for(int index = 0; index<6;index++){
            int randomNumber  = rand.nextInt(9);
            String number = String.valueOf(randomNumber);
            pnr = pnr+number;
        }
        return  pnr;
    }
}
