package day2.BusReservation;

public class Passenger {
    String name;
    Destination d;

    public Passenger(String name, Destination d) {
        this.name = name;
        this.d = d;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(Destination d) {
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public Destination getDestination() {
        return d;
    }
}
