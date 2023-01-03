package pl.edu.agh.qa.personalData;

public class EmployeeImproved extends Employee {
    public EmployeeImproved(String name, String surname, String personalId) {
        super(name, surname, personalId);
    }

    public int hashCode() {
        return Integer.parseInt(getPersonalId().substring(0, 6));
    }
}
