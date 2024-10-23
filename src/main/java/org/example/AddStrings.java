package org.example;
//Andrew Smiley
//Chapter 2
//Program 11
public class AddStrings
{
    private String first, last;

    public AddStrings() {

    }

    public AddStrings(String one, String two) {
        setStrings(one, two);
        //this is a two parameter initialization constructor that calls the setStrings method
        //and passes the paramaters one and two from the method.
    }

    public void setStrings(String one, String two) {
        first = one; //this sets the attribute "first" to the value of the parameter "one" in the method
        last = two; //this sets the attribute "last" to the value of the parameter "two" in the method
    }

    public String add() {
        return first + " " + last;
    }

    public int findLength() {
        return add().length(); //this calls the add() method to get the name and then gets the length of that string
    }

    public String toString()
    {
        return "Here is the \"sum\" of the words \""+first+"\" and \""+last+"\".\n" +
                "The length of the name \""+add()+"\" is "+findLength()+"."; //this returns a string which describes the class and its attributes.
    }
    public static void main(String args[])
    {
        AddStrings test = new AddStrings();
        test.setStrings("Aaron", "Smith"); //this calls setStrings method with Aaron and Smith as the parameters
        System.out.println(test);
        test.setStrings("Andrew", "Smiley");
        System.out.println(test);
        test.setStrings("Maria", "Sanchez");
        System.out.println(test);
        //what happens if you only call setStrings() and the toString()?	Why?
        //nothing is different because the "add" method only returns a string and does not change anything.

    }
    /*
    OUTPUT:
    Here is the "sum" of the words "Aaron" and "Smith".
    The length of the name "Aaron Smith" is 11.
    Here is the "sum" of the words "Andrew" and "Smiley".
    The length of the name "Andrew Smiley" is 13.
    Here is the "sum" of the words "Maria" and "Sanchez".
    The length of the name "Maria Sanchez" is 13.
     */
}