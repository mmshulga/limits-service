package my.mmshulga.limitsservice.controllers;

import my.mmshulga.limitsservice.config.LimitsConfiguration;
import my.mmshulga.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/limits/")
@RestController
public class LimitsConfigurationController {

    private final LimitsConfiguration limitsConfiguration;

    @Autowired
    public LimitsConfigurationController(LimitsConfiguration limitsConfiguration) {
        this.limitsConfiguration = limitsConfiguration;
    }

    @GetMapping
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
    }
}
