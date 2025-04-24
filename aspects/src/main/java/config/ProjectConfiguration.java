package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import utils.LoggingAspect;
import utils.SecurityAspect;

@Configuration
@ComponentScan(basePackages = { "services" })
@EnableAspectJAutoProxy
public class ProjectConfiguration {
    @Bean
    public LoggingAspect aspect() {
	return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
	return new SecurityAspect();
    }
}
