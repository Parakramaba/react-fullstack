package com.pdv.careerservice.controller;

import com.pdv.careerservice.record.CompanyDetailsRecord;
import com.pdv.careerservice.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompanyDetailsRecord companyDetailsRecord) {
        return companyService.create(companyDetailsRecord);
    }
}
