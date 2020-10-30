package carpetPriceCalculator;

import carpetPriceCalculator.configs.AppConfig;
import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.floor.Bedroom;
import carpetPriceCalculator.floor.Kitchen;
import carpetPriceCalculator.floor.LivingRoom;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import carpetPriceCalculator.interfaces.floorTypes.Floor;
import carpetPriceCalculator.services.Calculator;
import carpetPriceCalculator.services.CarpetTX;
import carpetPriceCalculator.services.CarpetVA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

       Calculator carpetCalculator = container.getBean("calculator",Calculator.class);

        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetVA(), City.FAIRFAX, new LivingRoom(12, 15.5)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetVA(), City.ARLINGTON, new Bedroom(12)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetVA(), City.MCLEAN, new Kitchen(10)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetVA(), City.AUSTIN, new LivingRoom(12, 15.5)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetTX(), City.FAIRFAX, new LivingRoom(12, 15.5)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetTX(), City.AUSTIN, new LivingRoom(12, 15.5)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetTX(), City.DALLAS, new Bedroom(12)));
        System.out.println("===========================================================");
        System.out.println( carpetCalculator.calculateCarpetPrice(new CarpetTX(), City.SAN_ANTONIO, new Kitchen(10)));


    }
}
