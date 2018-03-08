package nl.yacht.project.lagodimolveno;

import java.util.Date;

public class Guest {

    private String name;
    private Sex sex;
    private String phoneNumber;

    public Guest(String name, Sex sex, String phoneNumber){
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    public void makeReservation(int numberOfGuests, Date period, int duration, String name){
        String test = "";
    }

    public void cancelReservation(String reason){

    }

}
