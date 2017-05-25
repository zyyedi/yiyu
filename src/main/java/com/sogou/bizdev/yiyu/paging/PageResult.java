package com.sogou.bizdev.yiyu.paging;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyiyu on 24/05/2017.
 */

public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -4955523355334134099L;
    private List<T> list = new ArrayList<T>();      //列表
    private Integer numOfLines = 0;
    private Integer pages = 0;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getNumOfLines() {
        return numOfLines;
    }

    public void setNumOfLines(Integer numOfLines) {
        this.numOfLines = numOfLines;
    }

    public Integer getPage() {
        return pages;
    }

    public void setPage(Integer pagesSize, Integer numOfLines) {
        this.pages = numOfLines % pagesSize == 0 ? numOfLines / pagesSize : numOfLines / pagesSize + 1;
    }
}
