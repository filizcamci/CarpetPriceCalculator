package carpetPriceCalculator;

import carpetPriceCalculator.configs.AppConfig;
import carpetPriceCalculator.enums.City;
import carpetPriceCalculator.interfaces.carpetPrices.Carpet;
import carpetPriceCalculator.services.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

       Calculator carpetCalculator = container.getBean("calculator",Calculator.class);

        System.out.println( carpetCalculator.calculateCarpetPrice());
    }
}
