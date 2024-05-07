package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		List <String> Users=new ArrayList<>;
		Users.add("Mahadhevan");
		Users.add("Kavi");
		Users.add("Ajay");
	}

}
