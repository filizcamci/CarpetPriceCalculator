package carpetPriceCalculator.floor;

import carpetPriceCalculator.interfaces.floorTypes.Floor;
import org.springframework.stereotype.Component;


public class Kitchen implements Floor {
    private double radius;
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Kitchen";
    }
    public Kitchen(double radius){
        this.radius = radius;
    }


}
