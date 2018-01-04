package com.szpl.serviceImpl;

import com.szpl.dao.ThemeDao;
import com.szpl.pojo.Theme;
import com.szpl.service.ThemeService;
import com.szpl.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by litao on 2017/12/29.
 */
@Service("themeService")
@Transactional
public class ThemeServiceImpl implements ThemeService {
    @Autowired
    private ThemeDao themeDao;

    public ThemeDao getThemeDao() {
        return themeDao;
    }

    public void setThemeDao(ThemeDao themeDao) {
        this.themeDao = themeDao;
    }

    @Override
    public boolean saveTheme(Theme theme) {
        if(theme==null){
            return false;
        }
        try {
            themeDao.save(theme);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Theme findThemeById(String id) {
        if(StrUtil.isNull(id)){
            return null;
        }
        Theme theme = null;
        try {
            theme = themeDao.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return theme;
    }
}
