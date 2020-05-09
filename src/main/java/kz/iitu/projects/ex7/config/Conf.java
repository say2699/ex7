package kz.iitu.projects.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "kz.iitu.projects.ex7")
@PropertySource("application.properties")
public class Conf {
}
