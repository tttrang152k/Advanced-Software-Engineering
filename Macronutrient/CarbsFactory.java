package Macronutrient;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CarbsFactory extends MacronutrientFactory {
    private static MacronutrientFactory instance;

    private CarbsFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }

    public List<String> getAvailableCarbs(String dietPlan) {
        // All available carb options
        List<String> allCarbs = List.of(
            Carb.Type.CHEESE.name(),
            Carb.Type.BREAD.name(),
            Carb.Type.LENTILS.name(),
            Carb.Type.PISTACHIOS.name()
        );

        // Make a modifiable list to filter
        List<String> allowed = new ArrayList<>(allCarbs);

        switch (dietPlan) {
            case "No Restriction":
                // All carbs allowed
                break;
            case "Paleo":
                allowed.clear();
                allowed.add(Carb.Type.PISTACHIOS.name());
                break;
            case "Vegan":
                allowed.remove(Carb.Type.CHEESE.name());
                break;
            case "Nut Allergy":
                allowed.remove(Carb.Type.PISTACHIOS.name());
                break;
            default:
                throw new IllegalArgumentException("Diet plan is not valid: " + dietPlan);
        }
        return allowed;
    }

    @Override
    public String getMacronutrient(String dietPlan) {
        List<String> carbs = getAvailableCarbs(dietPlan);
        if (carbs.isEmpty()) {
            return "No allowed carbs for this diet plan";
        }
        return carbs.get(new Random().nextInt(carbs.size()));
    }
    
}
