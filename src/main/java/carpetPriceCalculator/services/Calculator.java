package carpetPriceCalculator.services;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import carpetPriceCalculator.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Carpet carpet;
    private Floor floor;

    @Autowired
    public Calculator(Carpet c, Floor f) {
        this.carpet = c;
        this.floor = f;
    }

    public Object calculateCarpetPrice() {

        if (this.carpet.getUnitPrice(carpet.getCity()) != 0.0) {
            System.out.println("State : " + this.carpet.getState());
            System.out.println("City : " + this.carpet.getCity());
            System.out.println("Unit price : $ " + this.carpet.getUnitPrice(carpet.getCity()));
            System.out.println("Room : " + this.floor.toString());
            System.out.println("Area : " + this.floor.getArea());
            return "Total price : $ " + this.carpet.getUnitPrice(carpet.getCity()) * this.floor.getArea();
//
        } else {
            return "Invalid city name!...";
        }

    }
}
