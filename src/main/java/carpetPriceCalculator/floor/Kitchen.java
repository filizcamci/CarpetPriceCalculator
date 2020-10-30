package carpetPriceCalculator.floor;

import carpetPriceCalculator.interfaces.floorTypes.Floor;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {
    private double radius;
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public String toString(){
        return "Kitchen";
    }
    public Kitchen(double radius){
        this.radius = radius;
    }


}
