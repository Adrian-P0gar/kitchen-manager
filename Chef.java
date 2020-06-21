import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public final class Chef extends Employee implements Cook {

    List <String> ingredients = new ArrayList<>();

    boolean knife = false;
    private static Chef instance = null;
    boolean yellWithIngredients;
    String neededIngredients;
    private Chef(String name, Date birthDate, double salary) {
        super(name, birthDate, salary);
        ingredients.add("carrot");
        ingredients.add("potato");
        ingredients.add("meat");
    }

    public  static Chef getInstance(){
        if (instance == null){
            instance = new Chef("Bontea", new Date(1987, 11, 4), 2000);
        }
        return instance;
    }

    public String getRandomIngredients(){
        Random generator = new Random();
        int randomIndex = generator.nextInt(ingredients.size());
        return ingredients.get(randomIndex);
    }

    public boolean isYellWithIngredients() {
        return yellWithIngredients;
    }

    public void setYellWithIngredients(boolean yellWithIngredients) {
        this.yellWithIngredients = yellWithIngredients;
    }

    public String getNeededIngredients() {
        return neededIngredients;
    }

    public void setNeededIngredients(String neededIngredients) {
        this.neededIngredients = neededIngredients;
    }

    @Override
    public void cook() {
        int random = new Random().nextInt(1+1);;

        if (random == 0){
            System.out.println("YELL!!");
        }
        if (random == 1){

            yellWithIngredients = true;
            neededIngredients = getRandomIngredients();
            System.out.println("Give me " + neededIngredients + " !!!!");
        }
    }

    @Override
    public void getKnife() {
        knife = true;
    }
}
