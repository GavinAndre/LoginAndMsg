package com.example.administrator.loginandmsg;

/**
 * Created by Administrator on 2015/11/9 0009.
 */
public class NameList {
    private String name;
    private int imageId;
    public NameList(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
