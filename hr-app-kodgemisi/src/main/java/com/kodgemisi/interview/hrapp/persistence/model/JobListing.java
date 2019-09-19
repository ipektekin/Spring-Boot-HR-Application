package com.kodgemisi.interview.hrapp.persistence.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;

@Entity
public class JobListing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String jobTitle;

    @Column(nullable = false)
    private String jobDescription;

    @Column(nullable = false)
    private Integer numberOfPeopleToHire;

    @Column(nullable = true)
    private Long lastApplicationEpoch;

    public JobListing() {
        super();
    }

    public JobListing(long id, String jobTitle, String jobDescription, Integer numberOfPeopleToHire, Long lastApplicationEpoch) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.numberOfPeopleToHire = numberOfPeopleToHire;
        this.lastApplicationEpoch = lastApplicationEpoch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Integer getNumberOfPeopleToHire() {
        return numberOfPeopleToHire;
    }

    public void setNumberOfPeopleToHire(Integer numberOfPeopleToHire) {
        this.numberOfPeopleToHire = numberOfPeopleToHire;
    }

    public Long getLastApplicationEpoch() {
        return lastApplicationEpoch;
    }

    public void setLastApplicationEpoch(Long lastApplicationEpoch) {
        this.lastApplicationEpoch = lastApplicationEpoch;
    }

    @Override
    public String toString() {
        return "JobListing{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", numberOfPeopleToHire=" + numberOfPeopleToHire +
                ", lastApplicationEpoch=" + lastApplicationEpoch +
                '}';
    }
}
