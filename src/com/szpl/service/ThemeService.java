package com.szpl.service;

import com.szpl.pojo.Theme;
import com.szpl.util.QueryPage;

/**
 * Created by litao on 2017/12/29.
 */
public interface ThemeService {
    boolean saveTheme(Theme theme);
    Theme findThemeById(String id);
    QueryPage<Theme> findThemes(String meetName, String pageNum,String pageSize);
}
