package dev.dlee.appliboard.JobListing;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface JobListingRepository extends ListCrudRepository<JobListing, Integer> {
    List<JobListing> findJobListingsByTitle(String title);
}
