package dev.dlee.appliboard.controller;

import dev.dlee.appliboard.model.JobListing;
import dev.dlee.appliboard.repository.JobListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/jobListing")
public class JobListingController {
    private final JobListingRepository repository;

    @Autowired
    public JobListingController(JobListingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<JobListing> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public JobListing findById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody JobListing jobListing) {
        repository.save(jobListing);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody JobListing jobListing, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            // Replace with ContentNotFoundException to allow custom error handling
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "JobListing Not Found!");
        }
        repository.save(jobListing);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
