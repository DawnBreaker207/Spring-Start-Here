package sq_c2_ex2.src.main.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import test.Parrot;
import test.Person;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
    @Bean
    @Primary
    Parrot parrot() {
	var p = new Parrot();
	p.setName("Koko");
	return p;
    }

    @Bean
    Parrot parrot2() {
	var p = new Parrot();
	p.setName("Miki");
	return p;
    }

    @Bean
    Parrot parrot3() {
	var p = new Parrot();
	p.setName("Riki");
	return p;
    }

//    @Bean
//    String hello() {
//	return "Hello";
//    }
//
//    @Bean
//    Integer ten() {
//	return 10;
//    }

//    @Bean
//    public Person person(Parrot parrot) {
//	Person p = new Person();
//	p.setName("Ella");
//	p.setParot(parrot);
//	return p;
//    }
    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot) {
	Person p = new Person(parrot);
	p.setName("Ella");
	return p;
    }
}
