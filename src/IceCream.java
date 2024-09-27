

public class IceCream extends Dessert {
    //Private variable declaration
    private String flavor;
    private int scoops;
    private boolean cupOrBowl; //if true, cup; if false, bowl
    public IceCream(int calories, int servings, String flavor, int scoops) {
        this.setCalories(calories);
        this.setServings(servings);
        setFlavor(flavor);
        setScoops(scoops);
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public int getScoops() {
        return scoops;
    }
    public void setScoops(int scoops) {
        this.scoops = scoops;
    }
    public String toString() {
        String flavorStr = "Flavor: " + getFlavor() + ", ";
        String scoopStr = "Scoops: " + getScoops() + ", ";
        String calorieStr = "Calories: " + this.getCalories() + "\n\n ";
        String servingStr = "Servings: " + this.getServings() + ",";

        return "Your Ice Cream: \n" + flavorStr + scoopStr + servingStr + calorieStr;
    }
}
