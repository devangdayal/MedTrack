package medtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import types.Frequency;

public class Medicine {
    private String name;
    private float dose;
    private List<Date> timings; // To accommodate multiple timings
    private Frequency frequency; // Options: "regular", "alternate", "unique"
    private int stockLevel;
    private boolean refillReminderStatus;
    private Date lastTakenTime;
    private Date lastReminderTime; // Additional field for tracking reminder frequency
    private int refillThreshold; // Additional field for refill reminder logic
    private List<Date> intakeHistory; // Additional field for tracking intake history

    public Medicine() {
        System.out.print("Medicine Started");
    }

    public Medicine(String name,
            float dose,
            List<Date> timings,
            Frequency frequency,
            int stockLevel,
            boolean refillReminderStatus,
            Date lastTakenTime,
            Date lastReminderTime,
            int refillThreshold) {

                this.name = name;
                this.dose = dose;
                this.timings = timings;
                this.frequency = frequency;
                this.stockLevel = stockLevel;
                this.refillReminderStatus = refillReminderStatus;
                this.lastTakenTime = lastTakenTime;
                this.lastReminderTime = lastReminderTime;
                this.refillThreshold = refillThreshold;

    }

    public String getName() {
        return name;
    }

    public float getDose() {
        return dose;
    }

    public List<Date> getTimings() {
        return Collections.unmodifiableList(timings); // Prevent direct modification
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public boolean isRefillReminderStatus() {
        return refillReminderStatus;
    }

    public Date getLastTakenTime() {
        return lastTakenTime;
    }

    public Date getLastReminderTime() {
        return lastReminderTime;
    }

    public int getRefillThreshold() {
        return refillThreshold;
    }

    public List<Date> getIntakeHistory() {
        return Collections.unmodifiableList(intakeHistory);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDose(float dose) {
        this.dose = dose;
    }

    public void setTimings(List<Date> timings) {
        this.timings = new ArrayList<>(timings); // Create a copy to avoid external modifications
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public void setRefillReminderStatus(boolean refillReminderStatus) {
        this.refillReminderStatus = refillReminderStatus;
    }

    public void setLastTakenTime(Date lastTakenTime) {
        this.lastTakenTime = lastTakenTime;
    }

    public void setLastReminderTime(Date lastReminderTime) {
        this.lastReminderTime = lastReminderTime;
    }

    public void setRefillThreshold(int refillThreshold) {
        this.refillThreshold = refillThreshold;
    }

    public void addIntakeHistory(Date intakeTime) {
        intakeHistory.add(intakeTime);
    }



}
