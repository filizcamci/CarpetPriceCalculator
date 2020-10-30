package carpetPriceCalculator.services;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import carpetPriceCalculator.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public Object calculateCarpetPrice(Carpet carpet, City city, Floor floor) {


        if (carpet.getUnitPrice(city) != 0.0) {
            System.out.println("State : " + carpet.getState());
            System.out.println("City : " + city);
            System.out.println("Unit price : $ " + carpet.getUnitPrice(city));
            System.out.println("Room : " + floor.toString());
            System.out.println("Area : " + floor.getArea());
            return "Total price : $ " + carpet.getUnitPrice(city) * floor.getArea();
        } else {
            System.out.println("State : " + carpet.getState());
            System.out.println("City : " + city);
            return city + " is not in " + carpet.getState() + ". Please enter one of " + carpet.getState() + " cities";
        }

    }
}
