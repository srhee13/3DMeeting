package com.szpl.util;

import java.util.List;

/**
 * Created by lish on 18/1/6.
 */
public class QueryPage<T> {
    private int pageSize;
    private int pageCount;
    private int pageNum;
    private long total;
    private List<T> rows;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public QueryPage(int pageSize, int pageCount,int pageNum, long total, List<T> rows) {
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.pageNum = pageNum;
        this.total = total;
        this.rows = rows;

    }
}
