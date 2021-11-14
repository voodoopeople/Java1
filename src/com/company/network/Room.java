package com.company.network;

public class Room {
    private Integer width = 0;
    private Integer lenght = 0;
    private Integer height = 0;
    private String nameOfLivin = "";

    public Room(Integer w, Integer l, Integer h, String n){
        width = w;
        lenght = l;
        height= h;
        nameOfLivin = n;
    }

    public Room(Integer w, Integer l, String n){
        width = w;
        lenght = l;
        nameOfLivin = n;
    }

    public Room(Integer w, Integer l, Integer h){
        width = w;
        lenght = l;
        height= h;
    }

    public Room(){
    }

    public Integer calculate(){
        return width + lenght + height;
    }

    public void setWidth(Integer w){
        width = w;
    }

    public Integer getWidth(){
        return width;
    }
}
