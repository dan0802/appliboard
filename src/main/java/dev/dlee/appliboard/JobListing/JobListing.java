package dev.dlee.appliboard.JobListing;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record JobListing (
        Integer id,
        @NotEmpty
        String title,
        String description,
        Integer salary,
        Type type,
        Industry industry,
        Status status,
        WorkStyle workstyle,
        LocalDateTime dateAdded
) {}