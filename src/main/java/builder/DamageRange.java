package builder;

public record DamageRange(int minDamage, int maxDamage) {

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
