import java.util.Date;

public abstract class  Employee {
    private String name;
    private Date birthDate;
    private final double salary;

    public Employee(String name, Date birthDate, double salary){
        this.name = name;
        this.birthDate= birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void printTaxReport(){
        double tax = salary *99 / 100;
        System.out.println(tax);
    };


}
