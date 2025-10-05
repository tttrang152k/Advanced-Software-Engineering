package Macronutrient;

public class Protein {
    public enum Type {
        FISH, CHICKEN, BEEF, TOFU
    }

    private Type type;

    public Protein(Type type) {
        this.type = type;
    }

    public String getType() {
        return type.name();
    }

    @Override
    public String toString() {
        return type.name();
    }
}
