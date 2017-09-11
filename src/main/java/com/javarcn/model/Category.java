package com.javarcn.model;

/**
 * @author jiacheng
 * @created on 2017/9/11 21:02.
 */
public class Category {

    private int categoryId;
    private String categoryName;
    private int hasSub;
    private String logo;
    private int linkType;
    private int id;
    private String imageAoyo;
    private String imageAoyoEffect;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getHasSub() {
        return hasSub;
    }

    public void setHasSub(int hasSub) {
        this.hasSub = hasSub;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getLinkType() {
        return linkType;
    }

    public void setLinkType(int linkType) {
        this.linkType = linkType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageAoyo() {
        return imageAoyo;
    }

    public void setImageAoyo(String imageAoyo) {
        this.imageAoyo = imageAoyo;
    }

    public String getImageAoyoEffect() {
        return imageAoyoEffect;
    }

    public void setImageAoyoEffect(String imageAoyoEffect) {
        this.imageAoyoEffect = imageAoyoEffect;
    }
}
