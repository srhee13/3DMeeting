package com.szpl.service;

import com.szpl.pojo.User;

/**
 * @Author: lish.
 * @Description:
 * @Date:Created in 12:49  2018/2/26.
 * @Modified by:
 */
public interface UserService {
    /**
     * 注册新用户
     * @param user
     * @return
     */
    public boolean registerUser(User user);

    /**
     * 验证用户名是否唯一
     * @param userName
     * @return
     */
    public boolean validateUserName(String userName);

    /**
     * 验证手机号码是否唯一
     * @param phoneNum
     * @return
     */
    public boolean validatePhoneNum(String phoneNum);
}
