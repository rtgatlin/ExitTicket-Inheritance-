//Parent class Dessert

public class Dessert {
    //Private variable declaration
    private int calories;
    private int servings;
    public Dessert() {
        this.calories = 0;
        this.servings = 0;
    }
    public Dessert(int calories, int servings) {
        this.calories = calories;
        this.servings = servings;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public int getServings() {
        return servings;
    }
    public void setServings(int servings) {
        this.servings = servings;
    }
    public String toString() {
        String caloriesString = String.valueOf(calories);
        String servingsString = String.valueOf(servings);

        return "Calories: " + caloriesString + "\nNumber of Servings: " + servingsString;
    }
}
