package solvd;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd.builder.Build;
import solvd.builder.HouseBuilder;
import solvd.house.House;

public class Main {
   // public static Logger log = Logger.debug(Main.class.getName());
   private static Logger log = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
        log.debug("Beginning log4jdebugger");
        Build buildOne = new Build();
        HouseBuilder builder = new HouseBuilder();
        buildOne.constructFirstHouse(builder);
        House house1 = builder.getResult();
        System.out.println(house1.getInfo());

        log.debug("Log44J - First house built");
        buildOne.constructSecondHouse(builder);
        House house2 = builder.getResult();
        System.out.println(house2.getInfo());
        log.debug("Log4J - second house built");
    }
}
