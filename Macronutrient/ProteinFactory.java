package Macronutrient;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ProteinFactory extends MacronutrientFactory {
    private static MacronutrientFactory instance;

    private ProteinFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public List<String> getAvailableProteins(String dietPlan) {
        // All available proteins
        List<String> allProteins = List.of(
            Protein.Type.FISH.name(),
            Protein.Type.CHICKEN.name(),
            Protein.Type.BEEF.name(),
            Protein.Type.TOFU.name()
        );

        List<String> allowed = new ArrayList<>(allProteins);

        switch (dietPlan) {
            case "No Restriction":
                break;
            case "Paleo":
                allowed.remove(Protein.Type.TOFU.name());
                break;
            case "Vegan":
                allowed.remove(Protein.Type.FISH.name());
                allowed.remove(Protein.Type.CHICKEN.name());
                allowed.remove(Protein.Type.BEEF.name());
                break;
            case "Nut Allergy":
                break;

            default: 
                throw new IllegalArgumentException("Diet plan is not valid: " + dietPlan);
        }
        return allowed;
    }

    @Override
    public String getMacronutrient(String dietPlan) {
        List<String> proteins = getAvailableProteins(dietPlan);
        if (proteins.isEmpty()) {
            return "No allowed proteins for this diet plan";
        }
        return proteins.get(new Random().nextInt(proteins.size()));
    }
}
