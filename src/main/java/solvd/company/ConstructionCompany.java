package solvd.company;


import solvd.person.Person;
import solvd.randomentities.Address;

import java.util.List;

public class ConstructionCompany extends Company {


    public ConstructionCompany(String companyName, String address, String phoneNumber) {
        super(companyName, address, phoneNumber);
    }

    @Override
    public String getCompanyName() {
        return null;
    }

    @Override
    public void setCompanyName() {

    }

    @Override
    public Address getAddress() {
        return null;
    }

    @Override
    public void setAddress() {

    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public void setPhoneNumber() {

    }

    @Override
    public List<Person> getEmployeeList() {
        return null;
    }

    @Override
    public void setEmployeeList() {

    }

}
