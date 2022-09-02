package solvd.builder;


import solvd.company.Company;
import solvd.house.House;
import solvd.materials.Door;
import solvd.materials.Roof;
import solvd.materials.Walls;
import solvd.materials.Windows;
import solvd.person.Customer;

import java.util.Objects;

public class HouseBuilder implements IBuilder {
    private Walls walls;
    private Roof roof;
    private Windows windows;
    private Door door;
    private boolean garage;
    private boolean pool;
    private int countFlor;
    private Company company;
    private Customer customer;


    public House getResult() {
        return new House(walls, roof, windows, door, garage, pool, countFlor, company, customer);
    }

    public Walls getWalls() {
        return walls;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public void setPoll(boolean pool) {
        this.pool = pool;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public int getCountFlor() {
        return countFlor;
    }

    public void setCountFlor(int countFlor) {
        this.countFlor = countFlor;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "HouseBuilder{" +
                "walls=" + walls +
                ", roof=" + roof +
                ", windows=" + windows +
                ", door=" + door +
                ", garage=" + garage +
                ", pool=" + pool +
                ", countFlor=" + countFlor +
                ", company=" + company +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HouseBuilder)) return false;
        HouseBuilder that = (HouseBuilder) o;
        return isGarage() == that.isGarage() && isPool() == that.isPool() && getCountFlor() == that.getCountFlor() && Objects.equals(getWalls(), that.getWalls()) && Objects.equals(getRoof(), that.getRoof()) && Objects.equals(getWindows(), that.getWindows()) && Objects.equals(getDoor(), that.getDoor()) && Objects.equals(getCompany(), that.getCompany()) && Objects.equals(getCustomer(), that.getCustomer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWalls(), getRoof(), getWindows(), getDoor(), isGarage(), isPool(), getCountFlor(), getCompany(), getCustomer());
    }
}
