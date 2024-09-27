

public class IceCream extends Dessert {
    //Private variable declaration
    private String flavor;
    private int scoops;
    private boolean cupOrBowl; //if true, cup; if false, bowl
    public IceCream(int calories, int servings, String flavor, int scoops, boolean cupOrBowl) {
        this.setCalories(calories);
        this.setServings(servings);
        this.flavor = flavor;
        this.scoops = scoops;
        this.cupOrBowl = cupOrBowl;
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
    public boolean isCupOrBowl() {
        return cupOrBowl;
    }
    public void setCupOrBowl(boolean cupOrBowl) {
        this.cupOrBowl = cupOrBowl;
    }
}
