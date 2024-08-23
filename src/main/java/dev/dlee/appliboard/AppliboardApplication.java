package dev.dlee.appliboard;

import dev.dlee.appliboard.JobListing.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;


@SpringBootApplication
@ComponentScan(basePackages = {"dev.dlee.appliboard"})
public class AppliboardApplication {
	private static final Logger log = LoggerFactory.getLogger(AppliboardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppliboardApplication.class, args);
	}

}
