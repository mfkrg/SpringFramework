package com.mfkrg.spring;

import com.mfkrg.spring.database.pool.ConnectionPool;
import com.mfkrg.spring.database.repository.CompanyRepository;
import com.mfkrg.spring.database.repository.UserRepository;
import com.mfkrg.spring.ioc.Container;
import com.mfkrg.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var container = new Container();
        //var connectionPool = new ConnectionPool();
        //var userRepository = new UserRepository(connectionPool);
        //var companyRepository = new CompanyRepository(connectionPool);
        //var userService = new UserService(userRepository, companyRepository);


        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);
        var userService = container.get(UserService.class);

    }
}
