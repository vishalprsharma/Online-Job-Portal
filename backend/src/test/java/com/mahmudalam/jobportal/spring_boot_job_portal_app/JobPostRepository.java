package com.mahmudalam.jobportal.spring_boot_job_portal_app.interfaces;

import com.mahmudalam.jobportal.spring_boot_job_portal_app.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface JobPostRepository extends MongoRepository<Post, String> {

    /**
     * This method is automatically implemented by Spring Data MongoDB.
     * It allows searching for job posts where the 'profile' field contains
     * the given text, ignoring case. This is perfect for a search bar.
     */
    List<Post> findByProfileContainingIgnoreCase(String text);

}

