package com.szpl.enum1;

/**
 * Created by litao on 2018/2/26.
 */
public enum UserType {
    COMMON("COMMON"),ADMIN("ADMIN");
    private String value;
    private UserType(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
}
