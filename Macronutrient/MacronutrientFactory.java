package Macronutrient;

public abstract class MacronutrientFactory {
    private static MacronutrientFactory instance;
    public static MacronutrientFactory getInstance() {
        return instance;
    }

    public abstract String getMacronutrient(String dietPlan);

}
