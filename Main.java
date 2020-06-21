import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Helper helper = new Helper("Gheorghe", new Date(1995, 10, 6),201.0);
        Helper helper1 = new Helper("Ion", new Date(1997, 9, 9),201.0);
        Helper helper2 = new Helper("Andrei", new Date(1993, 5, 22),201.0);
        OrdinaryCook cook = new OrdinaryCook("1" , new Date(1985,12,13), 800.0);
        OrdinaryCook cook1 = new OrdinaryCook("2" , new Date(1983,3,30), 800.0);
        Chef chef = Chef.getInstance();
        restaurant.addHelpers(helper);
        restaurant.addHelpers(helper1);
        restaurant.addHelpers(helper2);
        restaurant.addChef(chef);
        restaurant.addCookWithKnife(cook);
        restaurant.addCookWithKnife(cook1);
        System.out.println(helper);
        restaurant.makeRecipe1();
    }
}
