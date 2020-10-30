package carpetPriceCalculator.configs;

import carpetPriceCalculator.services.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }



}
