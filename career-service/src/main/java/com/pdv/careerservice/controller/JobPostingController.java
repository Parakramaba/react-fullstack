package com.pdv.careerservice.controller;

import com.pdv.careerservice.record.JobPostingRecord;
import com.pdv.careerservice.service.JobPostingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/job-postings")
public class JobPostingController {

    private final JobPostingService jobPostingService;

    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @PostMapping
    public ResponseEntity<?> createJobPosting(@RequestBody JobPostingRecord jobPostingRecord) {
        return jobPostingService.createJobPosting(jobPostingRecord);
    }
}
