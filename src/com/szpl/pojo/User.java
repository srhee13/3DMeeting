package com.szpl.pojo;

import com.szpl.enum1.UserType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by litao on 2018/2/26.
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id",strategy="uuid2")
    private String id;
    /**
     * 用户名
     */
    @Column(unique = true,nullable = false,length = 50)
    private String userName;
    /**
     * 用户密码
     */
    @Column(unique = true,nullable = false,length = 50)
    private String password;
    /**
     * 姓名
     */
    @Column(nullable = false,length = 20)
    private String name;
    /**
     * 电话
     */
    @Column(unique = true,nullable = false,length = 20)
    private String phoneNum;
    /**
     * 创建日期
     */
    @Temporal(TemporalType.DATE)
    private Date registerDate;
    /**
     * 用户类型，当前是枚举，ADMIN是管理员，common是普通用户
     */
    @Enumerated(EnumType.STRING)
    private UserType userType = UserType.COMMON;
    /**
     * 用户是否被锁住，管理员通过后才能释放用户登录权限
     */
    @Column
    private boolean locked = Boolean.TRUE;
}
