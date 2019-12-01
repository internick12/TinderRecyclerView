package com.galosoft.tinderrecyclerview.Model;

public class Item {

    private int index;
    private String imgLink;

    public Item(String imgLink, int index) {
        this.index = index;
        this.imgLink = imgLink;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}
