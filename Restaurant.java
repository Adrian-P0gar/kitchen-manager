import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Restaurant {


    List<Employee> employeesWithKnife;
    List<Helper> helpers;
    List<OrdinaryCook> ordinaryCooks;
    Chef chef;
    public Restaurant() {
        this.helpers = new ArrayList<>();
        this.employeesWithKnife = new ArrayList<>();
        this.ordinaryCooks = new ArrayList<>();

    }

    public void addHelpers(Helper helper){
        helpers.add(helper);
    }

    public void addCookWithKnife(OrdinaryCook cook){
        cook.getKnife();
        employeesWithKnife.add(cook);
        ordinaryCooks.add(cook);
    }

    public void addChef(Chef chef){
        chef.getKnife();
        employeesWithKnife.add(chef);
        this.chef = chef;
    }

    public void makeRecipe1() {
        int timer = 0;
        while (timer < 30) {
            chef.cook();
            if (chef.isYellWithIngredients()) {
                int helpersResponseCount = 0;
                int helperResponse;
                for (Helper helper : helpers) {
                  System.out.println("!!!!!" + helper.ingredients + " " + helper.getName());

                    if(chef.isYellWithIngredients()){
                        helperResponse = helper.changeQuantii(chef.getNeededIngredients());
                        helpersResponseCount += helperResponse;
                        if(helperResponse == 0){
                            chef.setYellWithIngredients(false);
                        }

                    }

                }
//                System.out.println("!!!! response" + helpersResponseCount);
                if (helpersResponseCount == helpers.size()) {
                    for (Helper helper : helpers) {
                        helper.yell();
                    }
                }
                chef.setYellWithIngredients(false);

            }
            timer++;
        }
        for(OrdinaryCook cook: ordinaryCooks){
            cook.cook();
        }
    }


}