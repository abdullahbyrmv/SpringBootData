package com.company.JPA;

import com.company.JPA.userDaoImpl.UserRepository;
import com.company.JPA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableCaching
public class JpaApplication {

    // Dependency Injection
    // Inversion of Control - IoC
//    @Autowired
//    @Qualifier("UserDao1")
//    private UserInterface userDao;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }


//    @Bean
//    public CommandLineRunner run() {
//        CommandLineRunner clr = new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                List<User> list = userDao.getAllInfo(null, null, null);
//                User u = list.get(1);
//                u.setName(u.getName().toLowerCase());
//                userDao.updateUser(u);
//            }
//        };
//        return clr;
//    }
//
    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                List<User> list = userRepository.getAllInfo(null,null,null);
                System.out.println(list);
            }
        };
        return clr;
    }
}
