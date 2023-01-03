package pl.edu.agh.qa;

import pl.edu.agh.qa.personalData.Employee;
import pl.edu.agh.qa.personalData.EmployeeImproved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeData {
    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();
        Set<Employee> employeesSet = new HashSet<>();
        Employee employee01 = new Employee("Pawel", "Kowalski", "23037600100");
        Employee employee02 = new Employee("Pawel", "Skobel", "23037600120");
        Employee employee03 = new Employee("Maria", "Kowalska", "01038600320");
        Employee employee04 = new Employee("Maria", "Kowalska", "01038600320"); //Inny obiekt ale z takimi samymi wartościami pól

        employeesList.add(employee01);
        employeesList.add(employee02);
        employeesList.add(employee03);
        employeesList.add(employee04);
        System.out.println("Ilosc LIST: " + employeesList.size());

        employeesSet.add(employee01);
        employeesSet.add(employee02);
        employeesSet.add(employee03);
        employeesSet.add(employee04);
        System.out.println("Ilosc SET: ".to + employeesSet.size());

        EmployeeImproved employeeImp01 = new EmployeeImproved("Pawel", "Kowalski", "23037600100");
        EmployeeImproved employeeImp02 = new EmployeeImproved("Pawel", "Skobel", "23037600120");
        EmployeeImproved employeeImp03 = new EmployeeImproved("Maria", "Kowalska", "01038600320");
        EmployeeImproved employeeImp04 = new EmployeeImproved("Maria", "Kowalska", "01038600320"); //Inny obiekt ale z takimi samymi wartościami pól

        Set<EmployeeImproved> employeesImprovedSet = new HashSet<>();
        employeesImprovedSet.add(employeeImp01);
        employeesImprovedSet.add(employeeImp02);
        employeesImprovedSet.add(employeeImp03);
        employeesImprovedSet.add(employeeImp04);
        System.out.println("Ilosc SET+HASH_SET: " + employeesImprovedSet.size());
    }
}