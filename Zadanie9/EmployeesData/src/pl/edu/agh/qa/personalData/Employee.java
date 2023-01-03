package pl.edu.agh.qa.personalData;

public class Employee {
    private String name;
    private String surname;
    private String personalId;

    public Employee(String name, String surname, String personalId) {
        this.name = name;
        this.surname = surname;
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalId() {
        return personalId;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return personalId != null ? personalId.equals(employee.personalId) : employee.personalId == null;
    }
}
