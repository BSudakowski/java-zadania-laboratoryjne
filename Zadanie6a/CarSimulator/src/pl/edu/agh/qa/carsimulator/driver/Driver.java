package pl.edu.agh.qa.carsimulator.driver;

public class Driver {
    private String firstName;
    private String lastName;
    private int age;

    public Driver(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
