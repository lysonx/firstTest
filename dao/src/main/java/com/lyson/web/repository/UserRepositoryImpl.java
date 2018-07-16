package com.lyson.web.repository;

import com.lyson.web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class UserRepositoryImpl {
    @PersistenceContext
    private EntityManager em;

    public User findUserById(Integer id){
        String dataStr = "select * from user u where 1= 1";
        if(id > 0){
            dataStr += " and id = " + id;
        }else {
            return null;
        }
        Query dataQuery = em.createNativeQuery(dataStr,User.class);
//        dataQuery.unwrap(SQLQuery.class).setResultTransformer(Transformers.aliasToBean(User.class));

        User user = (User) dataQuery.getSingleResult();
        return user;
    }
}
