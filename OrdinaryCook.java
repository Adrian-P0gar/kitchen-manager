import java.util.Date;


public class OrdinaryCook extends Employee implements  Cook{

    boolean knife;


    public OrdinaryCook(String name, Date birthDate, double salary) {
        super(name, birthDate, salary);
        knife = false;
    }



    @Override
    public void cook() {
        System.out.println("The job is done");
    }

    @Override
    public void getKnife() {
        knife = true;
    }
}
