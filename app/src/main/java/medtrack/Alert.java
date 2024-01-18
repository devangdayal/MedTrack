package medtrack;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Alert {

    public enum AlertType {
        MISSED_DOSE, REFILL_REMINDER, STOCK_LEVEL_TRIGGER, EXPIRATION
    }

    private final AlertType type;
    private final Medicine medicine;
    private final LocalDateTime time; // Time when the alert should be triggered

    public Alert(AlertType type, Medicine medicine, LocalDateTime time) {
        this.type = type;
        this.medicine = medicine;
        this.time = time;
    }

    // Getter
    public AlertType getType() {
        return type;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public static List<Alert> generateAlerts(List<Medicine> medicines, LocalDateTime currentTime) {
        List<Alert> alerts = new ArrayList<>();

        for (Medicine medicine : medicines) {
            // Check for missed doses
            if (medicine.getLastTakenTime() == null || currentTime.isAfter(medicine.getTimings().get(0))) {
                alerts.add(new Alert(AlertType.MISSED_DOSE, medicine, currentTime));
            }

            // Check for refill reminders
            if (medicine.isRefillReminderStatus() && medicine.getStockLevel() <= medicine.getRefillThreshold()) {
                alerts.add(new Alert(AlertType.REFILL_REMINDER, medicine, currentTime));
            }

            // Check for stock level triggers
            if (medicine.getStockLevel() <= 5) { // Customizable threshold
                alerts.add(new Alert(AlertType.STOCK_LEVEL_TRIGGER, medicine, currentTime));
            }

            // Check for expiration
            if (medicine.getExpirationDate() != null && medicine.getExpirationDate().isBefore(currentTime)) {
                alerts.add(new Alert(AlertType.EXPIRATION, medicine, currentTime));
            }
        }

        return alerts;
    }

    public String toString() {
        return String.format("[Alert: type=%s, medicine=%s, time=%s]", type, medicine.getName(), time);
    }
}
