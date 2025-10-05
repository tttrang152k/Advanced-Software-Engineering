package Macronutrient;

public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public void setDietPlan(String dietPlan) {
        this.dietPlan = dietPlan; 
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    @Override
    public String toString() {
        return "Customer: '" + name + "' with diet plan: { " + dietPlan + " }";

    }
}
