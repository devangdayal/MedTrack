package medtrack;

import java.sql.Time;
import java.util.Date;

public class Schedule {
    private Medicine medicine;
    private Date date;
    private Time time;
    private boolean takenStatus;

    public Schedule() {
        System.out.println("Schedule Started");
    }

    public Schedule(Medicine medicine, Date date, Time time, boolean takenStatus){
        this.medicine = medicine;
        this.date =  date;
        this.time = time;
        this.takenStatus = takenStatus;
    }

    // Retrieve a reference to the Medicine object, preventing direct modification
    public Medicine getMedicine() {
        return medicine;
    }

    // Retrieve an unmodifiable Date object to avoid external changes
    public Date getDate() {
        return (Date) date.clone();
    }

    // Retrieve a copy of the Time object for similar reasons
    public Time getTime() {
        return (Time) time.clone();
    }

    // Retrieve the boolean value indicating if the medicine was taken
    public boolean isTakenStatus() {
        return takenStatus;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public void setDate(Date date) {
        this.date = (Date) date.clone();
    }

    public void setTime(Time time) {
        this.time = (Time) time.clone();
    }

    public void setTakenStatus(boolean takenStatus) {
        this.takenStatus = takenStatus;
    }

}
