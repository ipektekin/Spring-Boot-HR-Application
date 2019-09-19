package com.kodgemisi.interview.hrapp.persistence.repo;

import com.kodgemisi.interview.hrapp.persistence.model.ApplicationForm;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<ApplicationForm, Long> {
}
