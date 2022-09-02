package solvd.company;


import solvd.person.Employee;

import java.util.List;

public abstract class Company implements ICompany {
    private String companyName;
    private String address;
    private String phoneNumber;
    private List<Employee> employees;

    public Company(String companyName, String address, String phoneNumber) {
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

}
