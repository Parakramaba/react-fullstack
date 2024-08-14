package com.pdv.careerservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "career")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Career implements Serializable {

    private Long id;
    private String title;
    // TODO: enum or entity?
    private String type;
    private String description;
    private String location;
    private String salary;
    private Company company;

}
