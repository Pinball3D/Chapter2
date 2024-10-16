package org.example;
//Andrew Smiley
//Program 9
//Chapter 2
import java.util.Scanner;
public class Operations
{
    //instance variables
    private double one, two, sum, diff, prod, quot, mod;

    public Operations() {

    }
    public Operations(double num1,double num2) {
        setNums(num1, num2);
    }
    public void setNums(double num1, double num2)
    {
        one = num1; two = num2;
    }
    public void sum( )
    {
        sum = one+two;
    }
    public void difference( )
    {
        diff = one-two;
    }
    public void product( )
    {
        prod = one*two;
    }
    public void quotient( )
    {
        quot = one/two;
    }
    public void modulus( )
    {
        mod = one % two;
    }
    public void print()
    {
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Quotient: " + quot);
        System.out.println("Product: " + prod);
        System.out.println("Modulus: " + mod);
    }


	public static void main (String [] args){
	  	Scanner user = new Scanner(System.in);
        double first, second;

        System.out.print("Enter a number with a decimal: ");
        first = user.nextDouble(); //repeat process for the second number.
        System.out.print("Enter a number with a decimal: ");
        second = user.nextDouble(); //create object of type Operations
		Operations test = new Operations();
		test.setNums(first, second);
		test.sum();
        test.difference();
        test.modulus();
        test.product();
        test.quotient();
        test.print();
    }
    /*
    OUTPUT
    Enter a number with a decimal: 1.0
    Enter a number with a decimal: 2.0
    Sum: 3.0
    Difference: -1.0
    Quotient: 0.5
    Product: 2.0
    Modulus: 1.0
     */
}

