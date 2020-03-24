package com.example.andriod.takehomelesson07_lizhenz;



public class Film {
    public String name;
    public String info;
    public int imageId;

    public Film(String name, String info, int imageId){
        this.name =name;
        this.info =info;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
