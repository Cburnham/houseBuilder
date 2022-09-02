package solvd.house;


import solvd.company.Company;
import solvd.materials.Door;
import solvd.materials.Roof;
import solvd.materials.Walls;
import solvd.materials.Windows;
import solvd.person.Customer;

public class House {

    private Walls walls;
    private Roof roof;
    private Windows windows;
    private Door door;
    private boolean garage;
    private boolean pool;
    private int countFlor;
    private Company company;
    private Customer customer;

    public House(Walls walls, Roof roof, Windows windows, Door door, boolean garage, boolean pool, int countFlor, Company company, Customer customer) {
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
        this.door = door;
        this.garage = garage;
        this.pool = pool;
        this.countFlor = countFlor;
        this.company = company;
        this.customer = customer;
    }

    public House(Walls walls, Roof roof, Windows windows, Door door, boolean garage, boolean pool, int countFlor){
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
        this.door = door;
        this.garage = garage;
        this.pool = pool;
        this.countFlor = countFlor;
    }

    public String getInfo(){
        String info = "";
        info += "\nHouse: this house has " + countFlor + " floors\n";
        info += walls.getInfo() + roof.getInfo() + windows.getInfo() + door.getInfo();
        if(garage){
            info += "This house has a garage \n";
        } else {
            info += "No garage \n";
        }
        if(pool){
            info += "This house has a pool \n";
        }else {
            info += "No pool \n";
        }
        return info;
    }
}
