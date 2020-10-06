/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    
    @Override
    public double getPermeter() {
        return ((getWidth()+getLength())*2);
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public void printResult() {
        System.out.println("----Rectangle----");
        System.out.println("width: "+getWidth());
        System.out.println("length: "+getLength());
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPermeter());
    }

    
    
}
