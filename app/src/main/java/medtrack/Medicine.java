package medtrack;

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

}
