package com.pdv.careerservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    private long id;
    private String name;
    private String description;
    private String email;
    private String phone;

}
