package com.pdv.careerservice.service;

import com.pdv.careerservice.entity.Company;
import com.pdv.careerservice.record.CompanyDetailsRecord;
import com.pdv.careerservice.repository.CompanyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("CompanyService")
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    /**
     *
     * @param companyDetailsRecord
     * @return
     */
    public ResponseEntity<?> create(CompanyDetailsRecord companyDetailsRecord) {
        Company company = Company.builder()
                .name(companyDetailsRecord.name())
                .description(companyDetailsRecord.description())
                .email(companyDetailsRecord.email())
                .phone(companyDetailsRecord.phone())
                .build();

        companyRepository.save(company);
        return new ResponseEntity<>("Company details saved successfully", HttpStatus.CREATED);
    }

}
