package com.company.JPA.userDaoImpl;

import com.company.JPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom {
    User findByName(String name);

    User findByNameAndSurname(String name, String surname);

    @Query(value = "select * from User where email=?", nativeQuery = true)
    User findByEmail(String email);
}
