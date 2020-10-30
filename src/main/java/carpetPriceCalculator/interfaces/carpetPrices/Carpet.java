package carpetPriceCalculator.interfaces.carpetPrices;

import carpetPriceCalculator.enums.City;

public interface Carpet {
     String getState();
     double getUnitPrice(City city);
}
