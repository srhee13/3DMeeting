package com.szpl.util;

/**
 * Created by litao on 2018/1/3.
 */
public class StrUtil {
    public static boolean isNull(String... strs){
        for(String str:strs){
            if (str==null||str.trim().length()==0){
                return true;
            }
        }
        return false;
    }
}
