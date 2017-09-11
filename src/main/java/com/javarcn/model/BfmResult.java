package com.javarcn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiacheng
 * @created on 2017/9/11 23:34.
 */
public class BfmResult {
    private int haveNext;
    private int nextPage;
    private int havePre;
    private int prePage;
    private int currentPage;
    private int count;
    private int sumPage;
    private int pageSize;
    private List<Bfm> dataList=new ArrayList<Bfm>();

    public List<Bfm> getDataList() {
        return dataList;
    }

    public void setDataList(List<Bfm> dataList) {
        this.dataList = dataList;
    }

    public int getHaveNext() {
        return haveNext;
    }

    public void setHaveNext(int haveNext) {
        this.haveNext = haveNext;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getHavePre() {
        return havePre;
    }

    public void setHavePre(int havePre) {
        this.havePre = havePre;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSumPage() {
        return sumPage;
    }

    public void setSumPage(int sumPage) {
        this.sumPage = sumPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
