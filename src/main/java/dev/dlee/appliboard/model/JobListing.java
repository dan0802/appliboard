package dev.dlee.appliboard.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="JobListing")
public record JobListing(
        @Id
        Integer id,
        @NotBlank
        String title,
        @Column(value= "description")
        String desc
//        @NotBlank
//        String city,
//        @NotBlank
//        String country,
//        WorkStyle workStyle,
//        @NotNull
//        Integer salary,
//        Industry industry,
//        Status status,
//        LocalDateTime dateListed,
//        LocalDateTime dateAdded,
//        String url
) {

}