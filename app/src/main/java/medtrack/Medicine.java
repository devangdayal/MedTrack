package medtrack;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import types.Frequency;

public class Medicine {
    private String name;
    private float dose;
    private List<LocalDateTime> timings; // To accommoLocalDateTime multiple timings
    private Frequency frequency; // Options: "regular", "alternate", "unique"
    private int stockLevel;
    private boolean refillReminderStatus;
    private LocalDateTime lastTakenTime;
    private LocalDateTime lastReminderTime; // Additional field for tracking reminder frequency
    private int refillThreshold; // Additional field for refill reminder logic
    private List<LocalDateTime> intakeHistory; // Additional field for tracking intake history
    private LocalDateTime expirationDate;
    private String notes;

    public Medicine() {
        System.out.print("Medicine Started");
    }

    public Medicine(String name,
            float dose,
            List<LocalDateTime> timings,
            Frequency frequency,
            int stockLevel,
            boolean refillReminderStatus,
            LocalDateTime lastTakenTime,
            LocalDateTime lastReminderTime,
            int refillThreshold,
            LocalDateTime expirationDate,
            String notes) {

        this.name = name;
        this.dose = dose;
        this.timings = timings;
        this.frequency = frequency;
        this.stockLevel = stockLevel;
        this.refillReminderStatus = refillReminderStatus;
        this.lastTakenTime = lastTakenTime;
        this.lastReminderTime = lastReminderTime;
        this.refillThreshold = refillThreshold;
        this.expirationDate = expirationDate;
        this.notes = notes;

    }

    // Getters
    // Here all the getters method of the Medicine Class

    public String getName() {
        return name;
    }

    public float getDose() {
        return dose;
    }

    public List<LocalDateTime> getTimings() {
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

    public LocalDateTime getLastTakenTime() {
        return lastTakenTime;
    }

    public LocalDateTime getLastReminderTime() {
        return lastReminderTime;
    }

    public int getRefillThreshold() {
        return refillThreshold;
    }

    public List<LocalDateTime> getIntakeHistory() {
        return Collections.unmodifiableList(intakeHistory);
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public String getNotes() {
        return notes;
    }

    // Setters
    // Here all the setters method of the Medicine Class
    public void setName(String name) {
        this.name = name;
    }

    public void setDose(float dose) {
        this.dose = dose;
    }

    public void setTimings(List<LocalDateTime> timings) {
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

    public void setLastTakenTime(LocalDateTime lastTakenTime) {
        this.lastTakenTime = lastTakenTime;
    }

    public void setLastReminderTime(LocalDateTime lastReminderTime) {
        this.lastReminderTime = lastReminderTime;
    }

    public void setRefillThreshold(int refillThreshold) {
        this.refillThreshold = refillThreshold;
    }

    public void addIntakeHistory(LocalDateTime intakeTime) {
        this.intakeHistory.add(intakeTime);
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Functional Method of the Medicine Class

    // TODO:
    // To estimate the next refill LocalDateTime based on stock level and usage
    // patterns.
    public LocalDateTime calculateRefillDate(LocalDateTime today) {

        LocalDateTime refillDate = LocalDateTime.now();

        return refillDate;

    }

    // TODO:
    // To create a comprehensive report with intake history, reminders, and other
    // relevant information.

    // TODO:
    // To export medication data in a CSV format for sharing or backup.

    // TODO:
    // Raise

}
