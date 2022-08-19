package com.mfkrg.spring.service;

import com.mfkrg.spring.database.repository.CompanyRepository;
import com.mfkrg.spring.database.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository){
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }

}
