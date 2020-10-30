package carpetPriceCalculator.configs;

import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.floor.Bedroom;
import carpetPriceCalculator.floor.Kitchen;
import carpetPriceCalculator.floor.LivingRoom;
import carpetPriceCalculator.interfaces.floorTypes.Floor;
import carpetPriceCalculator.services.Calculator;
import carpetPriceCalculator.services.CarpetTX;
import carpetPriceCalculator.services.CarpetVA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public CarpetTX CarpetTX() {
        return new CarpetTX(City());
    }
    @Bean
    public CarpetVA CarpetVA() {
        return new CarpetVA(City());
    }


    @Bean
    public Calculator calculator(){
        return new Calculator(CarpetVA(),Floor());
    }
    @Bean
    public Floor Floor(){
      //  return new Kitchen(15);
        return new Kitchen(15);
    }

    @Bean
    public City City(){
        return City.FAIRFAX;
    }



}
