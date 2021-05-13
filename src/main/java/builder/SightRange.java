package builder;

public record SightRange(int daySightRange, int nightSightRange) {

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
