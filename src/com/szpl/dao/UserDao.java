package com.szpl.dao;

import com.szpl.enum1.UserType;
import com.szpl.pojo.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: lish.
 * @Description:
 * @Date:Created in 12:47  2018/2/26.
 * @Modified by:
 */
@Repository
public interface UserDao extends JpaRepository<User,String> {
    List<User> findByUserName(String userName);
    List<User> findByPhoneNum(String userName);
    @Query("select u from User u where u.userName like %?1% and u.phoneNum like %?2% and u.userType in ?3")
    Page<User> getUserPages(String userName, String phoneNum, UserType[] types, Pageable pageable);
}
