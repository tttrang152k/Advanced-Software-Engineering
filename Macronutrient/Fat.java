package Macronutrient;

public class Fat {
    public enum Type {
        AVOCADO, SOUR_CREAM, TUNA, PEANUTS
    }

    private Type type;

    public Fat(Type type) {
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
