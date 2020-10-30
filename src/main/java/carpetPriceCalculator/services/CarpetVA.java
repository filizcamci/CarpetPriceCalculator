package carpetPriceCalculator.services;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class CarpetVA implements Carpet {

   public static Map<City,Double> unitPriceVA = new HashMap<>();
   public String state;

   static{
       unitPriceVA.put(City.ARLINGTON, 7.75);
       unitPriceVA.put(City.FAIRFAX, 8.99);
       unitPriceVA.put(City.MCLEAN, 9.75);
   }
    public CarpetVA(){
        this.state = "VA";
    }

    public String toString(){
        return "Carpet VA";
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public double getUnitPrice(City city) {
        return (unitPriceVA.get(city) == null) ? 0.00 : unitPriceVA.get(city);
    }
}
