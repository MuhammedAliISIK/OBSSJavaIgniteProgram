package day2.BusReservation;

public class main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        bus1.setD(Destination.ISTANBUL);
        bus2.setD(Destination.ANKARA);
        bus3.setD(Destination.ADANA);

        bus3.insertPassengers(new Passenger("Ali", Destination.ADANA));
        bus2.insertPassengers(new Passenger("Veli", Destination.ANKARA));
        bus1.insertPassengers(new Passenger("Mehmet", Destination.ISTANBUL));
        bus1.insertPassengers(new Passenger("Mahmut", Destination.ISTANBUL));
        bus1.insertPassengers(new Passenger("Ayşe", Destination.ISTANBUL));
        bus1.insertPassengers(new Passenger("Fatma", Destination.ISTANBUL));
        bus1.insertPassengers(new Passenger("Hayriye", Destination.ISTANBUL));
        bus1.insertPassengers(new Passenger("Şeyma", Destination.ISTANBUL));

    }
}
