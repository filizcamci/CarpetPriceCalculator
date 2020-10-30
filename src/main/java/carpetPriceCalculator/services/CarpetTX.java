package carpetPriceCalculator.services;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetTX implements Carpet {

    public String state;
    @Value("${city}")
    public String cityName;
    public City city;
    public static Map<City,Double> unitPriceTX = new HashMap<>();

    public CarpetTX(City city){
        this.state = "TX";
        this.city = city;
    }
    public String toString(){
        return "Carpet TX";
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public City getCity() {
        return city;
    }

    public double getUnitPrice(City city) {
        unitPriceTX.put(City.AUSTIN, 9.90);
        unitPriceTX.put(City.DALLAS, 8.80);
        unitPriceTX.put(City.SAN_ANTONIO, 7.50);
        if(unitPriceTX.get(city) == null){
            return 0.00;
        }else
             return unitPriceTX.get(city);
    }
}
