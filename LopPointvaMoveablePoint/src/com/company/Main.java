package com.company;

public class Main {

    public static void main(String[] args) {
	Point point=new Point(3,4);
        System.out.println(point.toString());
        MoveablePoint moveablePoint=new MoveablePoint(5,6,5,4);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
