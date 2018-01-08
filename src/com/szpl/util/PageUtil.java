package com.szpl.util;

import org.springframework.data.domain.Page;

/**
 * Created by lish on 18/1/6.
 */
public class PageUtil {
    public static <T> QueryPage<T> toQueryPage(Page<T> page){
        QueryPage<T> queryPage = new QueryPage<>(page.getSize(),
                page.getTotalPages(), page.getNumber(),
                page.getTotalElements(), page.getContent());
        return queryPage;
     }
}
