package com.szpl.dao;

import com.szpl.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @Author: lish.
 * @Description:
 * @Date:Created in 12:47  2018/2/26.
 * @Modified by:
 */
@Repository
public interface UserDao extends JpaRepository<User,String> {
    @Query("select u from User u where u.userName =:userName")
    public List<User> findByUserName(@Param("userName")String userName);

    public List<User> findByPhoneNum(@Param("userName")String userName);
}
