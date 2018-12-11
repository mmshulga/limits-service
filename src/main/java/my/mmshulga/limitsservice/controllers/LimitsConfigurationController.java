package my.mmshulga.limitsservice.controllers;

import my.mmshulga.limitsservice.model.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/limits/")
@RestController
public class LimitsConfigurationController {
    @GetMapping
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(1, 1000);
    }
}
