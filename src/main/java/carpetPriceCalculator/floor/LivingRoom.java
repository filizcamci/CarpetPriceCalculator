package carpetPriceCalculator.floor;

import carpetPriceCalculator.interfaces.floorTypes.Floor;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Floor {
    private double width;
    private double length;
    public double getArea() {
        return width * length;
    }
    public String toString(){
        return "Living room";
    }
    public LivingRoom(double width, double length){
        this.width = width;
        this.length = length;
    }
}
