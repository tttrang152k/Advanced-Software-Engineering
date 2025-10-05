package Macronutrient;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create customers with different diet plans
        List<Customer> customers = List.of(
            new Customer("Thi Trang", "No Restriction"),
            new Customer("Wang", "Paleo"),
            new Customer("Skyler", "Vegan"),
            new Customer("Jubel", "Nut Allergy"),
            new Customer("Pepsi", "Vegan"), 
            new Customer("Coca", "No Restriction")
        );

        for (Customer customer : customers) {
            String dietPlan = customer.getDietPlan();
            System.out.println("Customer: " + customer.getName() + ", Diet Plan: " + dietPlan);

            MacronutrientFactory carbFactory = Macronutrient.assignFactory("Carbs");
            String carb = carbFactory.getMacronutrient(dietPlan);
            MacronutrientFactory proteinFactory = Macronutrient.assignFactory("Protein");
            String protein = proteinFactory.getMacronutrient(dietPlan);
            MacronutrientFactory fatFactory = Macronutrient.assignFactory("Fat");
            String fat = fatFactory.getMacronutrient(dietPlan);
            Meal meal = new Meal(carb, protein, fat);
            meal.serveMeal();
            System.out.println();
        }
    }
}
