

public class Cake extends Dessert {
    //Private variable declaration
    private String cakeFlavor;
    private String frostingFlavor;
    private String cakeShape;
    public Cake(int calories, int servings, String cakeFlavor, String frostingFlavor, String cakeShape) {
        this.setCalories(calories);
        this.setServings(servings);
        this.cakeFlavor = cakeFlavor;
        this.frostingFlavor = frostingFlavor;
        this.cakeShape = cakeShape;
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
}
