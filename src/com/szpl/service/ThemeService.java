package com.szpl.service;

import com.szpl.pojo.Theme;

/**
 * Created by litao on 2017/12/29.
 */
public interface ThemeService {
    boolean saveTheme(Theme theme);
    Theme findThemeById(String id);
}
