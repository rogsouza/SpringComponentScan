package com.example.SpringComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.SpringComponent.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.SpringComponent.service", "com.example.SpringComponent.controller"})
public class SpringComponentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringComponentApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}
