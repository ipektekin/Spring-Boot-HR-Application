package com.kodgemisi.interview.hrapp.persistence.repo;

import com.kodgemisi.interview.hrapp.persistence.model.JobListing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobListingRepository extends CrudRepository<JobListing, Long> {
    List<JobListing> findByJobTitle(String jobTitle);
}
