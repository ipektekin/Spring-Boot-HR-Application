package com.kodgemisi.interview.hrapp.controller;

import com.kodgemisi.interview.hrapp.exception.RecordNotFoundException;
import com.kodgemisi.interview.hrapp.persistence.model.ApplicationForm;
import com.kodgemisi.interview.hrapp.persistence.model.JobListing;
import com.kodgemisi.interview.hrapp.service.ApplicationService;
import com.kodgemisi.interview.hrapp.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class JobListingController {
    @Value("${spring.application.name}")
    String appName;

    @Autowired
    JobListingService jobListingService;

    @Autowired
    ApplicationService applicationService;
    
    @GetMapping("/")
    public String homePage(Model model) {
        List<JobListing> list = jobListingService.findAll();

        model.addAttribute("jobs", list);
        return "list-jobs";
    }
    
    @GetMapping("/applyPage")
    public String ListPage(Model model) {
        List<JobListing> list = jobListingService.findAll();

        model.addAttribute("jobs", list);
        return "applyPage";
    }
    
    @GetMapping("/applicationForm")
    public String ApplicationForm(Model model) {
        ApplicationForm applicationForm = new ApplicationForm();

        model.addAttribute("applicationForm", applicationForm);
        return "applicationForm";
    }
   
    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException
    {
        if (id.isPresent()) {
            JobListing entity = jobListingService.findJobWith(id.get());
            model.addAttribute("job", entity);
        } else {
            model.addAttribute("job", new JobListing());
        }
        return "add-edit-job";
    }

    @PostMapping("/applyJob")
    public String addUser(@Valid ApplicationForm applicationForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "applyPage";
        }

        applicationService.save(applicationForm);
        List<ApplicationForm> list = applicationService.findAll();
        model.addAttribute("applicationForms", list);
        return "applicationListPage";
    }

    

    @RequestMapping(path = "/createJob", method = RequestMethod.POST)
    public String createOrUpdateJob(JobListing job)
    {
        jobListingService.save(job);
        return "redirect:/";
    }
}
