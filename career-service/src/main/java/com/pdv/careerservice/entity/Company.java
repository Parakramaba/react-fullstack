package com.pdv.careerservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "company")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

}
