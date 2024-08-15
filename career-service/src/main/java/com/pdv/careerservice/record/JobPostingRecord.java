package com.pdv.careerservice.record;

// TODO: validate data
public record JobPostingRecord(String title,
                               String type,
                               String description,
                               String location,
                               String salary,
                               Long companyId) {
}
