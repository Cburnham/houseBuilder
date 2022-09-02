package solvd.person;

import java.util.Objects;

public class Employee extends Person {

    private String salary;

    public Employee(String firstName, String lastName, String phoneNumber, String salary) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary='" + salary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getSalary(), employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSalary());
    }
}
