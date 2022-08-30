package day2.BusReservation;


public class Bus {
    private int capacity = 5;
    private Destination d;
    Passenger[] passengersList = new Passenger[10];

    public void setD(Destination d) {
        this.d = d;
    }

    public Destination getD() {
        return d;
    }

    public void insertPassengers(Passenger p) {
        if (d != p.d) {
            System.out.println("Destinations do not match");
        } else if (capacity > 0) {
            passengersList[(5 - capacity)] = p;
            System.out.println("Passenger inserted");
            capacity--;
        } else {
            System.out.println("Bus is full");
        }
    }

}
