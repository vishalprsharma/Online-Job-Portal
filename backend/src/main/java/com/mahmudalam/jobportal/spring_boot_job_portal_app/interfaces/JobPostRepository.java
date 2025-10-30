package com.mahmudalam.jobportal.spring_boot_job_portal_app.interfaces;

import com.mahmudalam.jobportal.spring_boot_job_portal_app.model.JobPostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepository extends MongoRepository<JobPostModel, String> {
}
