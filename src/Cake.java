

public class Cake extends Dessert {
    //Private variable declaration
    private String cakeFlavor;
    private String frostingFlavor;
    private String cakeShape;
    public Cake(int calories, int servings, String cakeFlavor, String frostingFlavor, String cakeShape) {
        this.setCalories(calories);
        this.setServings(servings);
        setCakeFlavor(cakeFlavor);
        setFrostingFlavor(frostingFlavor);
        setCakeShape(cakeShape);
    }
    public String getCakeFlavor() {
        return cakeFlavor;
    }
    public void setCakeFlavor(String cakeFlavor) {
        this.cakeFlavor = cakeFlavor;
    }
    public String getFrostingFlavor() {
        return frostingFlavor;
    }
    public void setFrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }
    public String getCakeShape() {
        return cakeShape;
    }
    public void setCakeShape(String cakeShape) {
        this.cakeShape = cakeShape;
    }
    public String toString() {
        String cakeFlavStr = "Cake Flavor: " + getCakeFlavor() + ", ";
        String frostingFlavsStr = "Frosting Flavor: " + getFrostingFlavor() + ", ";
        String cakeShapeStr = "Cake Shape: " + getCakeShape() + ", ";
        String servingStr = "Servings: " + this.getServings() + ", ";
        String caloriesStr = "Calories: " + this.getCalories() + "\n\n";

        return "Your Cake:\n" + cakeFlavStr + frostingFlavsStr + cakeShapeStr + servingStr + caloriesStr;
    }
}
