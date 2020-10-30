package carpetPriceCalculator.services;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class CarpetTX implements Carpet {

    public String state;
    public static Map<City, Double> unitPriceTX = new HashMap<>();

    static {
        unitPriceTX.put(City.AUSTIN, 9.90);
        unitPriceTX.put(City.DALLAS, 8.80);
        unitPriceTX.put(City.SAN_ANTONIO, 7.50);
    }

    public CarpetTX() {
        this.state = "TX";
    }

    public String toString() {
        return "Carpet TX";
    }

    @Override
    public String getState() {
        return this.state;
    }

    public double getUnitPrice(City city) {

        return (unitPriceTX.get(city) == null) ? 0.00 : unitPriceTX.get(city);

    }
}
