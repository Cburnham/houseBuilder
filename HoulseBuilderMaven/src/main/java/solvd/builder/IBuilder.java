package solvd.builder;


import solvd.company.Company;
import solvd.materials.Door;
import solvd.materials.Roof;
import solvd.materials.Walls;
import solvd.materials.Windows;
import solvd.person.Customer;

public interface IBuilder {


    void setWalls(Walls walls);
        void setRoof(Roof roof);
        void setWindows(Windows windows);
        void setDoor(Door door);
        void setGarage(boolean garage);
        void setPoll(boolean pool);
        void setCountFlor(int countFlor);
        void setCustomer(Customer customer);
        void setCompany(Company company);

}
