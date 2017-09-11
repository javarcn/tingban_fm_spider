package com.javarcn.model;

/**
 * @author jiacheng
 * @created on 2017/9/11 20:59.
 */
public class FmModel {

    private String code;
    private String message;
    private long serverTime;
    private FmResult result=new FmResult();

    public FmResult getResult() {
        return result;
    }

    public void setResult(FmResult result) {
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

    public long getServerTime() {
        return serverTime;
    }

    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }
}
