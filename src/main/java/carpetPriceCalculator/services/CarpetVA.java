package carpetPriceCalculator.services;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetVA implements Carpet {

   public static Map<City,Double> unitPriceVA = new HashMap<>();
   public String state;
   @Value("${city}")
   public String cityName;
   public City city;

   public CarpetVA(City city){
       this.state = "VA";
       this.city = city;
   }

    public String toString(){
        return "Carpet VA";
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public City getCity() {
        return city;
    }

    @Override
    public double getUnitPrice(City city) {
        unitPriceVA.put(City.ARLINGTON, 7.75);
        unitPriceVA.put(City.FAIRFAX, 8.99);
        unitPriceVA.put(City.MCLEAN, 9.75);
        if(unitPriceVA.get(city) == null){
            return 0.00;
        }else
            return unitPriceVA.get(city);
    }
}
