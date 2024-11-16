package com.example.spring_docker2.service;

import com.example.spring_docker2.repository.EmployeeEntity;
import com.example.spring_docker2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserNameById(Long id){
        EmployeeEntity employee = userRepository.getFirstById(id);
        return employee.getName();

    }


}
