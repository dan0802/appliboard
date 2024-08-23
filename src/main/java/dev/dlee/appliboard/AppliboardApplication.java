package dev.dlee.appliboard;

import dev.dlee.appliboard.model.Industry;
import dev.dlee.appliboard.model.JobListing;
import dev.dlee.appliboard.model.Status;
import dev.dlee.appliboard.model.WorkStyle;
import dev.dlee.appliboard.repository.JobListingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class AppliboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppliboardApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(JobListingRepository jobListingRepository) {
//		return args -> {
//			JobListing j = new JobListing(
//					1,
//					"A job",
//					"Lorem ipsum",
//					"Coquitlam",
//					"Canada",
//					WorkStyle.REMOTE,
//					70000,
//					Industry.EDUCATION,
//					Status.NOTHING,
//					LocalDateTime.now(),
//					LocalDateTime.now(),
//					"google.com"
//			);
//			jobListingRepository.save(j);
//		};
//	}
}
