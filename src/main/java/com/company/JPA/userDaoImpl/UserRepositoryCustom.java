package com.company.JPA.userDaoImpl;


import com.company.JPA.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepositoryCustom {

    public User getByID(int id);
    public List<User> getAllInfo(String name, String surname, Integer nationalityId) throws SQLException;

    public boolean updateUser(User u);

    public boolean removeUser(int id);

    public boolean addUser(User u);

    public User findByEmailAndPassword(String email, String password);

    public User findByEmail(String email);
}
