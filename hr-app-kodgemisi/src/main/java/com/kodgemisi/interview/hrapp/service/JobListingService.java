package com.kodgemisi.interview.hrapp.service;

import com.kodgemisi.interview.hrapp.persistence.model.JobListing;
import com.kodgemisi.interview.hrapp.persistence.repo.JobListingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobListingService {
    private final JobListingRepository jobListingRepository;

    public JobListingService(JobListingRepository jobListingRepository) {
        this.jobListingRepository = jobListingRepository;
    }

    public List<JobListing> findAll(){
        List<JobListing>jobs =new ArrayList<>();
        for(JobListing job :jobListingRepository.findAll() ){
            jobs.add(job);
        }

        return jobs;
    }
    public JobListing findJobWith(Long id){
        return jobListingRepository.findById(id).get();
    }

    public void save(JobListing job){

        jobListingRepository.save(job);

    }
    public void delete(Long id){

        jobListingRepository.deleteById(id);
    }
}
