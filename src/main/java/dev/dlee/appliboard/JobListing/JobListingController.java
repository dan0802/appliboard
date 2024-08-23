package dev.dlee.appliboard.JobListing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

/**
 * Implements and handles REST operations; @RestController annotation is crucial for Spring Boot to recognize the
 * class as a Controller
 *
 * @RequestMapping annotation sets where the API endpoint is accessed
 * */
@RestController
@RequestMapping("/api/jobListing")
public class JobListingController {
    // Repository initialization is handled by Spring
    private final JobListingRepository repository;

    @Autowired
    public JobListingController(JobListingRepository repository) {
        this.repository = repository;
    }

    // EFFECTS: Returns all JobListing elements from the repository in a List
    @GetMapping("")
    public List<JobListing> findAll() {
        return repository.findAll();
    }

    // EFFECTS: If id is found, returns JobListing with matching id, else fails
    //  THROWS: ResponseStatusException
    @GetMapping("/{id}")
    public JobListing findById(@PathVariable Integer id) {
        Optional<JobListing> job = repository.findById(id);
        if (job.isEmpty()) {
            throw new JobListingNotFoundException("Job not found!");
        }
        return job.get();
    }

    // EFFECTS: If request body is valid, creates a JobListing and saves it to the repository and returns
    //          http status 201
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody JobListing jobListing) {
        repository.create(jobListing);
    }

    // EFFECTS: If request body and id are valid, replaces JobListing with matching id with the new JobListing in
    //          the request body and returns http status 204
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody JobListing jobListing, @PathVariable Integer id) {
        repository.update(jobListing, id);
    }

    // EFFECTS: If the id is found, deletes the JobListing with matching id from the repository and returns
    //          http status 204
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }

}
