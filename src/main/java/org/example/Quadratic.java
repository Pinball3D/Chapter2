package org.example;

import java.util.Scanner;
public class Quadratic
{
    private int a, b, c;
    private double rootOne, rootTwo;


    public Quadratic(int quadA, int quadB, int quadC)
    {
        a = quadA; b = quadB; c = quadC;
    }
    public Quadratic() {

    }

    public void setEquation(int quadA, int quadB, int quadC)
    {
        a = quadA; b = quadB; c = quadC;
    }

    public void calcRoots( )
    {
        rootOne = (-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
        rootTwo = (-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
    }

    public void print( )
    {
        System.out.println("Root One: "+rootOne);
        System.out.println("Root Two: "+rootTwo);
    }
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        Quadratic quad = new Quadratic();
        System.out.print("Enter A: ");
        int aa = keyboard.nextInt();
        System.out.print("Enter B: ");
        int ab = keyboard.nextInt();
        System.out.print("Enter C: ");
        int ac = keyboard.nextInt();
        quad.setEquation(aa, ab, ac);
        quad.calcRoots();
        quad.print();

    }
    /*
    OUTPUT
    Enter A: 5
    Enter B: -8
    Enter C: 3
    Root One: 1.0
    Root Two: 0.6
     */
}
