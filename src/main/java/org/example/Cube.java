package org.example;
//Andrew Smiley
//Program 8
//Chapter 2
public class Cube {
    int side;
    public void setSide(int s) {
        side = s;
    }
    public Cube() {

    }
    public Cube(int s) {
        setSide(s);
    }
    public void calculateSurfaceArea() {
        System.out.println((side*side)*6);
    }
    public void calculateVolume() {
        System.out.println(side*side*side);
    }
    public static void main(String[] args) {
        Cube test = new Cube();
        test.setSide(112);
        test.calculateSurfaceArea();
        test.calculateVolume();
        test.setSide(42); //this comment sets the side of test which is an instance of the Cube class
        test.calculateSurfaceArea();
        test.calculateVolume();
        test.setSide(11);
        test.calculateSurfaceArea();
        test.calculateVolume();
        test.setSide(37);
        test.calculateSurfaceArea();
        test.calculateVolume();

    }
    /*
    OUTPUT
    75264
    1404928
    10584
    74088
    726
    1331
    8214
    50653
     */
}
