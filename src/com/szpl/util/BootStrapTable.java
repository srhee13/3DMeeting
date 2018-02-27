package com.szpl.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: lish.
 * @Description:
 * @Date:Created in 10:51  2018/2/27.
 * @Modified by:
 */
@Data
public class BootStrapTable<T> implements Serializable{
        private  Integer page;
        private Integer total;
        private T rows;
}
