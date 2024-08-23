package dev.dlee.appliboard;

import dev.dlee.appliboard.JobListing.Industry;
import dev.dlee.appliboard.JobListing.JobListing;
import dev.dlee.appliboard.JobListing.Status;
import dev.dlee.appliboard.JobListing.WorkStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@SpringBootApplication
public class AppliboardApplication {
	private static final Logger log = LoggerFactory.getLogger(AppliboardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppliboardApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			JobListing j = new JobListing(
					1,
					"Test job",
					"Lorem ipsum",
					100000,
					Industry.EDUCATION,
					Status.NOTHING,
					WorkStyle.HYBRID,
					LocalDateTime.now()
			);
			log.info("Jobs:" + j);
		};
	}

}
