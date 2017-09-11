package com.javarcn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiacheng
 * @created on 2017/9/11 21:00.
 */
public class CategoryResult {
    private List<Category> dataList = new ArrayList<Category>();

    public List<Category> getDataList() {
        return dataList;
    }

    public void setDataList(List<Category> dataList) {
        this.dataList = dataList;
    }
}
