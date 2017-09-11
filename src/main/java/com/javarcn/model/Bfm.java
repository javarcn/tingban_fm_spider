package com.javarcn.model;

/**
 * @author jiacheng
 * @created on 2017/9/11 23:35.
 */
public class Bfm {
    private long id;
    private String name;
    private String pic;
    private String currentProgramTitle;
    private String webPic;
    private int classifyid;
    private int status;
    private int onLineNum;
    private int likedNum;
    private int type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCurrentProgramTitle() {
        return currentProgramTitle;
    }

    public void setCurrentProgramTitle(String currentProgramTitle) {
        this.currentProgramTitle = currentProgramTitle;
    }

    public String getWebPic() {
        return webPic;
    }

    public void setWebPic(String webPic) {
        this.webPic = webPic;
    }

    public int getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(int classifyid) {
        this.classifyid = classifyid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOnLineNum() {
        return onLineNum;
    }

    public void setOnLineNum(int onLineNum) {
        this.onLineNum = onLineNum;
    }

    public int getLikedNum() {
        return likedNum;
    }

    public void setLikedNum(int likedNum) {
        this.likedNum = likedNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
