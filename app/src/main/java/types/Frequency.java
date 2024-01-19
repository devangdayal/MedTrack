package types;

public class Frequency {
    public enum FrequencyType {
        Once, // Once a Day
        Twice, // Twice a Day
        Thrice, // Thrice a day
        Custom // User-defined custom frequency
    }

    private FrequencyType frequencyType;
    private int customHourInterval;

    // Constructors
    public Frequency(FrequencyType frequencyType) {
        this.frequencyType = frequencyType;
    }

    public Frequency(FrequencyType frequencyType, int customHourInterval) {
        this.frequencyType = frequencyType;
        this.customHourInterval = customHourInterval;
    }

    // Getter methods
    public FrequencyType getFrequencyType() {
        return frequencyType;
    }

    public int getCustomHourInterval() {
        return customHourInterval;
    }

    // Calculate the expected daily usage based on the medication's dose and
    // frequency
    public float calculateAverageDailyUsage(float dose) {
        float dailyUsage = 0;

        switch (frequencyType) {
            case Once:
                dailyUsage = calculateOnceUsage(dose);
                break;
            case Twice:
                dailyUsage = calculateTwiceUsage(dose);
                break;
            case Thrice:
                dailyUsage = calculateThriceUsage(dose);
                break;
            case Custom:
                dailyUsage = calculateCustomUsage(dose, customHourInterval);
                break;
            default:
                System.out.println("Frequency Class Error");
                break;
        }

        return dailyUsage;
    }

    // Calculating daily usage for each frequency type
    private float calculateOnceUsage(float dose) {
        return dose * 1; // Once a day
    }

    private float calculateTwiceUsage(float dose) {
        return dose * 2; // Twice a day
    }

    private float calculateThriceUsage(float dose) {
        return dose * 3; // Three times a day
    }

    private float calculateCustomUsage(float dose, int customHourInterval) {
        return dose * (24 / customHourInterval);
    }
}
