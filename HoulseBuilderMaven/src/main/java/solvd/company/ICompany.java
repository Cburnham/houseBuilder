package solvd.company;


import solvd.person.Person;
import solvd.randomentities.Address;

import java.util.List;

public interface ICompany {

    public String getCompanyName();

    public void setCompanyName();

    public Address getAddress();

    public void setAddress();
    public String getPhoneNumber();

    public void setPhoneNumber();

    public List<Person> getEmployeeList();

    public void setEmployeeList();
}
