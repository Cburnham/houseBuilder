package solvd.builder;

import solvd.company.ConstructionCompany;
import solvd.materials.*;

public class Build {
    public void constructFirstHouse(HouseBuilder builder){
        builder.setCountFlor(2);
        builder.setDoor(new Door(2, 1, Material.WOOD));
        builder.setWindows(new Windows(1, 1, Material.PLASTIC));
        builder.setWalls(new Walls(3, 1, 20, Material.BRICK));
        builder.setRoof(new Roof(3, 10,12, Material.TILING));
        builder.setPoll(false);
        builder.setGarage(true);
        builder.setCompany(new ConstructionCompany("company one","12344 4th street", "1112223333"));

    }

    public void constructSecondHouse(HouseBuilder builder){
        builder.setCountFlor(3);
        builder.setDoor(new Door(2, 1, Material.WOOD));
        builder.setWindows(new Windows(2, 2, Material.PLASTIC));
        builder.setWalls(new Walls(3, 1, 40, Material.BLOCK));
        builder.setRoof(new Roof(4, 16,20, Material.METAL));
        builder.setPoll(true);
        builder.setGarage(true);
    }
}
