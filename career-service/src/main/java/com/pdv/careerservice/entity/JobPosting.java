package com.pdv.careerservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "jobPosting")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class JobPosting implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String title;

    // TODO: enum or entity?
    private String type;

    @Column(nullable = false)
    private String description;

    private String location;

    @Column(nullable = false)
    private String salary;

    @ManyToOne(optional = false)
    @JoinColumn(name = "companyId", referencedColumnName = "id")
    private Company company;

}
