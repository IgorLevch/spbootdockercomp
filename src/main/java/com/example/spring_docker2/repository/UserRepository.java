package com.example.spring_docker2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EmployeeEntity, Long> {


    EmployeeEntity getFirstById(Long id);
}
