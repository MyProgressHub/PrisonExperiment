import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cell {

    boolean  bulb = false; // no access modifier, why there is getter and setter if i can use is field directly from everywhere?

    public boolean getBulb() {
        return bulb;
    }

    public void setBulb(boolean bulb) {
        this.bulb = bulb;
    }

}
