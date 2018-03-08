package nl.yacht.project.lagodimolveno;

import java.util.Date;

public class Reservation {
    private Guest guest;
    private Date period;
    private int duration;
    private int numberOfPersons;
    private int pizza;
    public Reservation(Guest guest, Date period, int duration, int numberOfPersons) {
        this.guest = guest;
        this.period = period;
        this.duration = duration;
        this.numberOfPersons = numberOfPersons;
    }
}

