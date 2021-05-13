package builder;

import builder.enums.AttackType;
import builder.enums.AttributeType;
import builder.enums.Role;

import java.util.Map;

class Character {

    private final String name;

    // create it as a Health class
    private final double health;
    private final double healthRegen;

    // create it as a Mana class
    private final double mana;
    private final double manaRegen;
    private final AttributeType attributeType;
    private final String description;
    private final String biography;

    // create it as an Attack class
    private final AttackType attackType;
    private final double attackSpeed;
    private final DamageRange damageRange;
    private final int attackRange;

    // create it as a Armour class
    private final double physicalArmour;
    private final double magicArmour;

    // create it as a Motion
    private final int speed;
    private final double rotationSpeed;

    private final SightRange sightRange;

    private final Map<Role, Integer> roles;

    private Character(Builder builder) {
        this.name = builder.name;
        this.health = builder.health;
        this.healthRegen = builder.healthRegen;
        this.mana = builder.mana;
        this.manaRegen = builder.manaRegen;
        this.attributeType = builder.attributeType;
        this.description = builder.description;
        this.biography = builder.biography;
        this.attackType = builder.attackType;
        this.attackSpeed = builder.attackSpeed;
        this.damageRange = builder.damageRange;
        this.attackRange = builder.attackRange;
        this.physicalArmour = builder.physicalArmour;
        this.magicArmour = builder.magicArmour;
        this.speed = builder.speed;
        this.rotationSpeed = builder.rotationSpeed;
        this.sightRange = builder.sightRange;
        this.roles = builder.roles;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", healthRegen=" + healthRegen +
                ", mana=" + mana +
                ", manaRegen=" + manaRegen +
                ", attributeType=" + attributeType +
                ", description='" + description + '\'' +
                ", biography='" + biography + '\'' +
                ", attackType=" + attackType +
                ", attackSpeed=" + attackSpeed +
                ", damageRange=" + damageRange +
                ", attackRange=" + attackRange +
                ", physicalArmour=" + physicalArmour +
                ", magicArmour=" + magicArmour +
                ", speed=" + speed +
                ", rotationSpeed=" + rotationSpeed +
                ", sightRange=" + sightRange +
                ", roles=" + roles +
                '}';
    }

    public static class Builder {

        private String name;
        private double health;
        private double healthRegen;
        private double mana;
        private double manaRegen;
        private AttributeType attributeType;
        private String description;
        private String biography;

        private AttackType attackType;
        private double attackSpeed;
        private DamageRange damageRange;
        private int attackRange;

        private double physicalArmour;
        private double magicArmour;

        private int speed;
        private double rotationSpeed;
        private SightRange sightRange;

        private Map<Role, Integer> roles;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder health(double health) {
            this.health = health;
            return this;
        }

        public Builder healthRegen(double healthRegen) {
            this.healthRegen = healthRegen;
            return this;
        }

        public Builder mana(double mana) {
            this.mana = mana;
            return this;
        }

        public Builder manaRegen(double manaRegen) {
            this.manaRegen = manaRegen;
            return this;
        }

        public Builder attributeType(AttributeType attributeType) {
            this.attributeType = attributeType;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder biography(String biography) {
            this.biography = biography;
            return this;
        }

        public Builder attackType(AttackType attackType) {
            this.attackType = attackType;
            return this;
        }

        public Builder attackSpeed(double attackSpeed) {
            this.attackSpeed = attackSpeed;
            return this;
        }

        public Builder damageRange(DamageRange damageRange) {
            this.damageRange = damageRange;
            return this;
        }

        public Builder attackRange(int attackRange) {
            this.attackRange = attackRange;
            return this;
        }

        public Builder physicalArmour(double physicalArmour) {
            this.physicalArmour = physicalArmour;
            return this;
        }

        public Builder magicArmour(double magicArmour) {
            this.magicArmour = magicArmour;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder rotationSpeed(double rotationSpeed) {
            this.rotationSpeed = rotationSpeed;
            return this;
        }

        public Builder sightRange(SightRange sightRange) {
            this.sightRange = sightRange;
            return this;
        }

        public Builder roles(Map<Role, Integer> roles) {
            this.roles = roles;
            return this;
        }

        public Character build() {
            return new Character(this);
        }

    }
}
