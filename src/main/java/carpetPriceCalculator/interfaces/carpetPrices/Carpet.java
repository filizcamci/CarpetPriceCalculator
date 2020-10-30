package carpetPriceCalculator.interfaces.carpetPrices;

import carpetPriceCalculator.enums.City;

public interface Carpet {
     String getState();
     City getCity();
     double getUnitPrice(City city);
}
