package com.javarcn.model;

/**
 * @author jiacheng
 * @created on 2017/9/11 23:34.
 */
public class BfmModel {
    private String code;
    private String message;
    private BfmResult result=new BfmResult();

    public BfmResult getResult() {
        return result;
    }

    public void setResult(BfmResult result) {
        this.result = result;
    }

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
}
