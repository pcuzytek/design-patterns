package builder;

public class SightRange {
    private int daySightRange;
    private int nightSightRange;

    public SightRange(int daySightRange, int nightSightRange) {
        this.daySightRange = daySightRange;
        this.nightSightRange = nightSightRange;
    }

    public int getDaySightRange() {
        return daySightRange;
    }

    public int getNightSightRange() {
        return nightSightRange;
    }

    @Override
    public String toString() {
        return "SightRange{" +
                "daySightRange=" + daySightRange +
                ", nightSightRange=" + nightSightRange +
                '}';
    }
}
