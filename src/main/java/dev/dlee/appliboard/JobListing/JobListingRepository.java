package dev.dlee.appliboard.JobListing;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobListingRepository extends ListCrudRepository<JobListing, Integer> {
    List<JobListing> findJobListingsByTitle(String title);
}
