package com.javarcn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiacheng
 * @created on 2017/9/11 21:07.
 */
public class FmResult {
    private int haveNext;
    private int nextPage;
    private int havePre;
    private int prePage;
    private int currentPage;
    private int totalPages;
    private int totalCounts;
    private int pageSize;
    private List<Fm> dataList=new ArrayList<Fm>();

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

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<Fm> getDataList() {
        return dataList;
    }

    public void setDataList(List<Fm> dataList) {
        this.dataList = dataList;
    }
}
