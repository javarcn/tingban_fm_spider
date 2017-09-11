package com.javarcn.model;

/**
 * @author jiacheng
 * @created on 2017/9/11 21:08.
 */
public class CategoryModel {
    private String code;
    private String message;
    private long serverTime;
    private CategoryResult result=new CategoryResult();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getServerTime() {
        return serverTime;
    }

    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }

    public CategoryResult getResult() {
        return result;
    }

    public void setResult(CategoryResult result) {
        this.result = result;
    }
}
