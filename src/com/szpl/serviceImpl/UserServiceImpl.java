package com.szpl.serviceImpl;

import com.szpl.dao.UserDao;
import com.szpl.pojo.User;
import com.szpl.service.UserService;
import com.szpl.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lish.
 * @Description:
 * @Date:Created in 12:49  2018/2/26.
 * @Modified by:
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public boolean registerUser(User user){
        if(user==null|| StrUtil.isNull(user.getUserName(),user.getPassword(),user.getName())){
            return false;
        }
        try {
            userDao.save(user);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean validateUserName(String userName){
        if(StrUtil.isNull(userName)){
            return false;
        }
        try {
            List<User> users = userDao.findByUserName(userName);
            if(users.size()!= 0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    public boolean validatePhoneNum(String phoneNum){
        if(StrUtil.isNull(phoneNum)){
            return false;
        }
        try {
            List<User> users = userDao.findByPhoneNum(phoneNum);
            if(users.size()!= 0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
