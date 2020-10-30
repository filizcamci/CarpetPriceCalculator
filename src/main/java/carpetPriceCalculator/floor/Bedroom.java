package carpetPriceCalculator.floor;

import carpetPriceCalculator.interfaces.floorTypes.Floor;
import org.springframework.stereotype.Component;


public class Bedroom implements Floor {
    private double side;
    public double getArea() {
        return side * side;
    }
    public String toString(){
        return "Bedroom";
    }
    public Bedroom(double side){
        this.side = side;
    }
}
