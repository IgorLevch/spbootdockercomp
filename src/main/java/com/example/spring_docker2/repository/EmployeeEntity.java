package com.example.spring_docker2.repository;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String positio;
    @Column
    private Double salary;

    public String getName() {
        return name;
    }
}
