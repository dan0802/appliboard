package dev.dlee.appliboard.JobListing;

import java.time.LocalDateTime;


public record JobListing (
        Integer id,
        String title,
        String description,
        Integer salary,
        Industry industry,
        Status status,
        WorkStyle workstyle,
        LocalDateTime dateAdded
) {}