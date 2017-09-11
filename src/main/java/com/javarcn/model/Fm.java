package com.javarcn.model;

/**
 * @author jiacheng
 * @created on 2017/9/11 21:03.
 */
public class Fm {

    private long id;
    private int type;
    private String name;
    private String comeFrom;
    private int comeFromId;
    private String albumName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public int getComeFromId() {
        return comeFromId;
    }

    public void setComeFromId(int comeFromId) {
        this.comeFromId = comeFromId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
