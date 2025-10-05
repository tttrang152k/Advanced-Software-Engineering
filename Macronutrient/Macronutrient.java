package Macronutrient;

public class Macronutrient {
    public static MacronutrientFactory assignFactory(String nutrientType){
        switch (nutrientType) {
            case "Carbs":
                return CarbsFactory.getInstance();
            case "Protein":
                return ProteinFactory.getInstance();
            case "Fat":
                return FatFactory.getInstance();
            default:
                throw new IllegalArgumentException("Unknown nutrient type: " + nutrientType);
        }
    };
}
