package com.company;

public class Point {
    private float x;
    public float y;
    public Point(){

    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr_xy=new float[2];
        arr_xy[0]=x;
        arr_xy[1]=y;
        return arr_xy;
    }
    @Override
    public String toString(){
        return "x: "+getXY()[0]+"\n"+
                "y: "+getXY()[1]+"\n";
    }
}
