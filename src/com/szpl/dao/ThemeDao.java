package com.szpl.dao;

import com.szpl.pojo.Theme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by litao on 2017/12/29.
 */
@Repository
public interface ThemeDao extends JpaRepository<Theme,String>{
    @Query("select t from com.szpl.pojo.Theme t where t.meetingName like %?1%")
    public Page<Theme> findThemes(String meetName,Pageable pageable);
}
