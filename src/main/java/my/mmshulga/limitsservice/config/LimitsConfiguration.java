package my.mmshulga.limitsservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LimitsConfiguration {
    @Value("${limits-service.minimum}")
    private int minimum;

    @Value("${limits-service.maximum}")
    private int maximum;

    @Bean
    public int getMinimum() {
        return minimum;
    }

    @Bean
    public int getMaximum() {
        return maximum;
    }
}
