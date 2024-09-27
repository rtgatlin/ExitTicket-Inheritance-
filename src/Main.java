import java.util.ArrayList;

public class Main extends Dessert{
    public static void main(String[] args) {
        ArrayList<Dessert> desserts = new ArrayList<>();
        IceCream oneChoc= new IceCream(150, 1, "Chocolate", 1);
        IceCream fiveChoc= new IceCream(750, 5, "Chocolate", 5);
        IceCream cookies = new IceCream(450, 3, "Cookies n Cream", 3);
        Cake yellow = new Cake (200, 1, "Yellow", "Vanilla", "Circle");
        Cake redVelvet = new Cake(800, 4, "Red Velvet", "Cream Cheese", "Square");

        desserts.add(oneChoc);
        desserts.add(redVelvet);
        desserts.add(cookies);
        desserts.add(fiveChoc);
        desserts.add(yellow);

        for(Dessert item : desserts)
        {
            System.out.println(item.toString());
        }
    }
}