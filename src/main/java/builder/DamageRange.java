package builder;

public class DamageRange {
    private int minDamage;
    private int maxDamage;

    public DamageRange(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    @Override
    public String toString() {
        return "DamageRange{" +
                "minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                '}';
    }
}
