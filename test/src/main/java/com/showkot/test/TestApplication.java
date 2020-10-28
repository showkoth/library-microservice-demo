package com.showkot.test;

import com.showkot.test.model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(TestApplication.class, args);
//		SpringApplication.run(TestApplication.class, args);
		Car c = ctx.getBean(Car.class); // object creation using dependency injection,
		// requesting built in object
		c.display();
	}

}
