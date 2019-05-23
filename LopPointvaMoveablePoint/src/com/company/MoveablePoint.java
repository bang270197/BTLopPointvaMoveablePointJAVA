package com.company;

import javax.swing.*;
import java.net.PortUnreachableException;
import java.nio.channels.FileLock;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){

    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] arr_speed=new float[2];
        arr_speed[0]=xSpeed;
        arr_speed[1]=ySpeed;
        return arr_speed;
    }
    @Override
    public String toString(){
        return "x: "+super.getX()+"\n"+
                "y: "+super.getY()+"\n"+
                "xSpeed: "+getSpeed()[0]+"\n"+
                "ySpeed: "+getSpeed()[1]
                ;
    }
    public String move(){
        super.setX(super.getX()+this.xSpeed);
        super.setY(super.getY()+this.ySpeed);

        return super.getX()+"\n"+super.getY();


    }
}
