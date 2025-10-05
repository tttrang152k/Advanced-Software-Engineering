package Macronutrient;

public class Carb {
    public enum Type {
        CHEESE, BREAD, LENTILS, PISTACHIOS
    }

    private Type type;

    public Carb(Type type) {
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
