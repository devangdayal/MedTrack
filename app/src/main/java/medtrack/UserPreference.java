package medtrack;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class UserPreference {
    private boolean soundNotifications;
    private boolean vibrationNotifications;
    private boolean visualNotifications;
    private List<Date> preferredReminderTimes; // To accommodate multiple preferred times

    // Getters
    public boolean isSoundNotificationsEnabled() {
        return soundNotifications;
    }

    public boolean isVibrationNotificationsEnabled() {
        return vibrationNotifications;
    }

    public boolean isVisualNotificationsEnabled() {
        return visualNotifications;
    }

    public List<Date> getPreferredReminderTimes() {
        return Collections.unmodifiableList(preferredReminderTimes); // Prevent direct modification
    }

    // Setters
    public void setSoundNotificationsEnabled(boolean soundNotifications) {
        this.soundNotifications = soundNotifications;
    }

    public void setVibrationNotificationsEnabled(boolean vibrationNotifications) {
        this.vibrationNotifications = vibrationNotifications;
    }

    public void setVisualNotificationsEnabled(boolean visualNotifications) {
        this.visualNotifications = visualNotifications;
    }

    public void setPreferredReminderTimes(List<Date> preferredReminderTimes) {
        this.preferredReminderTimes = new ArrayList<>(preferredReminderTimes); // Create a copy
    }
}
