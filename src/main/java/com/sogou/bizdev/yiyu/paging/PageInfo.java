package com.sogou.bizdev.yiyu.paging;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.io.Serializable;

/**
 * Created by zhangyiyu on 24/05/2017.
 */
public class PageInfo implements Serializable {

    private static final long serialVersionUID = 7546554083425189473L;
    private Integer pageSize;
    private Integer pageNo;
    private Integer offset; //分页初始值

    public PageInfo() {
    }

    public PageInfo(Integer pageSize, Integer pageNo) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
