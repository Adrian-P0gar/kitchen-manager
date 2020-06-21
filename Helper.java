import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Helper extends Employee {


      Map<String, Integer> ingredients = new HashMap<>();
    Helper(String name, Date birthDate, double salary){
        super(name, birthDate, salary);

        ingredients.put("carrot", getRandom());
        ingredients.put("potato", getRandom());
        ingredients.put("meat", getRandom());
    }

    public void yell(){
        System.out.println("We are all out!");
    }

    private int getRandom(){
        return new Random().nextInt(3 + 1);
    };

    public int changeQuantii(String ingredient){

        if(ingredients.containsKey(ingredient) && ingredients.get(ingredient) >= 1){
            ingredients.replace(ingredient, (ingredients.get(ingredient)-1));
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Helper{" +
                ", name='" + getName() +
                 ", salary='" +   getSalary() +
                ", birth day='" + getBirthDate() +
                ", ingredients=" + ingredients.get("carrot") + ingredients.get("meat") + ingredients.get("potato") +
                '\'' +
                '}';
    }
}
