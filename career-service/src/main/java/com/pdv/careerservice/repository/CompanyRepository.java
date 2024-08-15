package com.pdv.careerservice.repository;

import com.pdv.careerservice.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
