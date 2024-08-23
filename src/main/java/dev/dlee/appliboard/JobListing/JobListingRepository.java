package dev.dlee.appliboard.JobListing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Repository
public class JobListingRepository {
    private static final Logger log = LoggerFactory.getLogger(JobListingRepository.class);
    private final JdbcClient jdbcClient;

    public JobListingRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<JobListing> findAll() {
        return jdbcClient.sql("SELECT * FROM Job")
                .query(JobListing.class)
                .list();
    }

    public Optional<JobListing> findById(Integer id) {
        return jdbcClient.sql("SELECT id,title,description,salary,type,industry,status,work_style,date_added FROM Job WHERE id = :id")
                .param("id", id)
                .query(JobListing.class)
                .optional();
    }

    public void create(JobListing j) {
        var updated = jdbcClient.sql("INSERT INTO Job(id,title,description,salary,type,industry,status,work_style,date_added) VALUES (?,?,?,?,?,?,?,?,?)")
                .params(List.of(j.id(),j.title(),j.description(),j.salary(),j.type().toString(),j.industry().toString(),j.status().toString(),j.workStyle().toString(),j.dateAdded().toString()))
                .update();
        Assert.state(updated == 1, "Failed to create " + j.title());
    }

    public void update(JobListing j, Integer id) {
        var updated = jdbcClient.sql("UPDATE Job SET title = ?, description = ?, salary = ?, type = ?, industry = ?, status = ?, work_style = ?, date_added = ? WHERE id = ?")
                .params(List.of(j.title(),j.description(),j.salary(),j.type().toString(),j.industry().toString(),j.status().toString(),j.workStyle().toString(),j.dateAdded().toString(), id))
                .update();
        Assert.state(updated == 1, "Failed to update " + j.title());
    }

    public void delete(Integer id) {
        var updated = jdbcClient.sql("DELETE FROM Job WHERE id = :id")
                .param("id", id)
                .update();
        Assert.state(updated == 1, "Failed to delete " + id);
    }
}
