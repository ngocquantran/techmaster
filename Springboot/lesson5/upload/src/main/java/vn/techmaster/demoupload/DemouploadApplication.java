package vn.techmaster.demoupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemouploadApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(DemouploadApplication.class, args);
	}

}