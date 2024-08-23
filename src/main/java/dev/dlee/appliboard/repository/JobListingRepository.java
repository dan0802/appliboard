package dev.dlee.appliboard.repository;

import dev.dlee.appliboard.model.JobListing;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface JobListingRepository extends ListCrudRepository<JobListing, Integer> {
    List<JobListing> findJobListingsByTitle(String title);
}
