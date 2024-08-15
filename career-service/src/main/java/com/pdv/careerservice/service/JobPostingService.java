package com.pdv.careerservice.service;

import com.pdv.careerservice.entity.JobPosting;
import com.pdv.careerservice.entity.Company;
import com.pdv.careerservice.exception.ResourceNotFoundException;
import com.pdv.careerservice.record.JobPostingRecord;
import com.pdv.careerservice.repository.JobPostingRepository;
import com.pdv.careerservice.repository.CompanyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("JobPostingService")
public class JobPostingService {

    private final JobPostingRepository jobPostingRepository;

    private final CompanyRepository companyRepository;

    public JobPostingService(JobPostingRepository jobPostingRepository, CompanyRepository companyRepository) {
        this.jobPostingRepository = jobPostingRepository;
        this.companyRepository = companyRepository;
    }

    /**
     *
     * @param jobPostingRecord
     * @return
     * @throws ResourceNotFoundException
     */
    public ResponseEntity<?> createJobPosting(JobPostingRecord jobPostingRecord) throws ResourceNotFoundException {

        Company company = companyRepository.findById(jobPostingRecord.companyId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no such company in our system"));

        JobPosting jobPosting = JobPosting.builder()
                .title(jobPostingRecord.title())
                .type(jobPostingRecord.type())
                .description(jobPostingRecord.description())
                .location(jobPostingRecord.location())
                .salary(jobPostingRecord.salary())
                .company(company)
                .build();

        jobPostingRepository.save(jobPosting);
        return new ResponseEntity<>("Job posting created successfully", HttpStatus.CREATED);
    }

}
