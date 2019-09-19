package com.kodgemisi.interview.hrapp.persistence.model;

import javax.persistence.*;

@Entity
public class ApplicationForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable =false)
	private String name;
	
	@Column(nullable =false)
	private String email;
	
	@Column(nullable =false)
	private String phoneNumber;
	
	@Column(nullable =false)
	private String address;
	
	@Column(nullable =false)
	private String thoughtsOnJob;
	
	 public  ApplicationForm() {
	        super();
	    }
	
	 public ApplicationForm(long id, String name, String email, String phoneNumber,String address, String thoughtsOnJob)
	 {
		 this.id = id;
		 this.name = name;
		 this.email = email;
		 this.phoneNumber = phoneNumber;
		 this.address= address;
		 this.thoughtsOnJob = thoughtsOnJob;
		 
		 
	 }
	 
	 public long getId() {
	        return id;
	 }

	 public void setId(long id) {
	        this.id = id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name= name;
	 }
	 
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email=email;
	 }
	 
	 public String getPhoneNumber() {
		 return phoneNumber;
	 }
	 
	 public void setPhoneNumber(String phoneNumber) {
		 this.phoneNumber = phoneNumber;
	 }
	 
	 public String getAddress() {
		 return address;
	 }
	 
	 public void setaddress(String address) {
		 this.address= address;
	 }
	 
	 public String getThoughtsOnJob() {
		 return thoughtsOnJob;
	 }
	 
	 public void setThoughtsOnJob(String ThouhgtsOnJob) {
		 this.thoughtsOnJob = ThouhgtsOnJob;
	 }
	 
	 @Override
	 public String toString() {
		 return "ApplicationForm{" +
				 "id=" + id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", phoneNumber=" + phoneNumber +
	                ", address=" + address +
	                ", ThouhgtsOnJob=" + thoughtsOnJob +
	                '}'; 

	 }
}
