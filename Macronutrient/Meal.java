package Macronutrient;

public class Meal {
    private final String carb;
    private final String protein;
    private final String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public void serveMeal() {
        System.out.println("Meal includes: ");
        System.out.println("+ Carbs: " + carb);
        System.out.println("+ Protein: " + protein);
        System.out.println("+ Fat: " + fat);
    }
    
    @Override
    public String toString() {
        return "Carb: " + carb + ", Protein: " + protein + ", Fat: " + fat;
    }
}
