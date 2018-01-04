package com.szpl.dao;

import com.szpl.pojo.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by litao on 2017/12/29.
 */
@Repository
public interface ThemeDao extends JpaRepository<Theme,String>{

}
