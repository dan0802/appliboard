package dev.dlee.appliboard;

import dev.dlee.appliboard.model.JobListing;
import dev.dlee.appliboard.repository.JobListingRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import java.util.Arrays;
import java.util.List;


@SpringBootTest
@AutoConfigureMockMvc
public class AppliboardApplicationTests{

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JobListingRepository jobListingRepository;

    @Test
    public void testFindListingsByTitle() {
        JobListing job1 = new JobListing(1, "Job 1", "asdf");
        JobListing job2 = new JobListing(2, "Job 2", "asdf");
        JobListing job3 = new JobListing(3, "Job 3", "asdf");
        jobListingRepository.saveAll(Arrays.asList(job1, job2, job3));

        List<JobListing> jobs = jobListingRepository.findJobListingsByTitle("Job");
        assertEquals(3, jobs.size());
    }
}

