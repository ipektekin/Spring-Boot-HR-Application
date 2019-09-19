package com.kodgemisi.interview.hrapp.service;

import com.kodgemisi.interview.hrapp.persistence.model.ApplicationForm;
import com.kodgemisi.interview.hrapp.persistence.repo.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<ApplicationForm> findAll(){
        List<ApplicationForm> applications =new ArrayList<>();
        for(ApplicationForm app :applicationRepository.findAll() ){
            applications.add(app);
        }

        return applications;
    }
    public ApplicationForm findApplicationWith(Long id){
        return applicationRepository.findById(id).get();
    }

    public void save(ApplicationForm applicationForm){

        applicationRepository.save(applicationForm);

    }
    public void delete(Long id){

        applicationRepository.deleteById(id);
    }
}
