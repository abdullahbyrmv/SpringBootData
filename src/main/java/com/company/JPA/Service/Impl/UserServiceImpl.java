package com.company.JPA.Service.Impl;


import com.company.JPA.AbstractDao.abstractDao;
import com.company.JPA.userDaoImpl.UserRepositoryCustom;
import com.company.JPA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends abstractDao implements UserRepositoryCustom {

    @Autowired
    @Qualifier("userDao1")
    private UserRepositoryCustom userDao;

    @Override
    public List<User> getAllInfo(String name, String surname, Integer nationalityId) throws SQLException {
        return userDao.getAllInfo(name, surname, nationalityId);
    }

    @Override
//    @Transactional
    public boolean updateUser(User u) {
        return userDao.updateUser(u);
    }

    @Override
    public boolean removeUser(int id) {
        return userDao.removeUser(id);
    }

    public User getByID(int userId) {
        return userDao.getByID(userId);

    }

    public boolean addUser(User u) {
        return userDao.addUser(u);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return userDao.findByEmailAndPassword(email, password);
    }


    // Criteria Builder
//    @Override
//    public User findByEmail(String email) {
//
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<User> q1 = cb.createQuery(User.class);
//        Root<User> postRoot = q1.from(User.class);
//        CriteriaQuery<User> q2 = q1.where(cb.equal(postRoot.get("email"), email));
//
//        Query query = em.createQuery(q2);
//        query.setParameter(1, email);
//        List<User> list = query.getResultList();
//        if (list.size() == 1) {
//            return list.get(0);
//        }


    // JPQL
//        @Override
//        public User findByEmail(String email){
//            Query query = em.createQuery("select u from User u where u.email = :e", User.class);
//        query.setParameter("e", email);
//
//        List<User> list = query.getResultList();
//
//        if (list.size() == 1) {
//            return list.get(0);
//        }
//        return null;
//    }


    // Named Query
//    @Override
//    public User findByEmail(String email) {
//
//        Query query = em.createNamedQuery("User.findByEmail",User.class);
//
//        query.setParameter("email", email);
//
//        List<User> list = query.getResultList();
//        if (list.size() == 1) {
//            return list.get(0);
//        }
//        return null;
//    }


    // Native SQL
    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public static void main(String[] args) {

    }
}
