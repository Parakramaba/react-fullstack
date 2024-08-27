package com.pdv.careerservice.controller;

import com.pdv.careerservice.record.JobPostingRecord;
import com.pdv.careerservice.service.JobPostingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/job-postings")
public class JobPostingController {

    private final JobPostingService jobPostingService;

    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody JobPostingRecord jobPostingRecord) {
        return jobPostingService.create(jobPostingRecord);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return jobPostingService.getAll();
    }

}
