package Macronutrient;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class FatFactory extends MacronutrientFactory {
    private static MacronutrientFactory instance;

    private FatFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public List<String> getAvailableFats(String dietPlan) {
        List<String> allFats = List.of(
            Fat.Type.AVOCADO.name(),
            Fat.Type.SOUR_CREAM.name(),
            Fat.Type.TUNA.name(),
            Fat.Type.PEANUTS.name()
        );

        List<String> allowed = new ArrayList<>(allFats);

        switch (dietPlan) {
            case "No Restriction":
                break;
            case "Paleo":
                allowed.remove(Fat.Type.SOUR_CREAM.name());
                break;
            case "Vegan":
                allowed.remove(Fat.Type.TUNA.name());
                allowed.remove(Fat.Type.SOUR_CREAM.name());
                break;
            case "Nut Allergy":
                allowed.remove(Fat.Type.PEANUTS.name());
                break;
            default:
                throw new IllegalArgumentException("Diet plan is not valid: " + dietPlan);
        }
        return allowed;
    }

    @Override
    public String getMacronutrient(String dietPlan) {
        List<String> fats = getAvailableFats(dietPlan);
        if (fats.isEmpty()) {
            return "No allowed fats for this diet plan";
        }
        return fats.get(new Random().nextInt(fats.size()));
    }
}
