package org.example;
//Andrew Smiley
//Chapter 2
//Program 12
public class Name {
    private String name;

    public Name() {
    }

    public Name(String s) {
        setName(s);
    }

    public void setName(String s) {
        name = s;
    }

    public String getFirst() {
        int index = name.lastIndexOf(" ");
        return name.substring(0, index);

        //literally have no clue if you're going to read this, but
        //we haven't learned this yet right?
        //name.split(" ")[0];
    }

    public String getLast() {
        int index = name.lastIndexOf(" ");
        return name.substring(index+1);
    }

    public String toString() {
        return getFirst()+"\n"+getLast()+"\n"+getFirst()+" "+getLast();
    }

    public static void main(String args[]) {
        Name test = new Name();
        test.setName("Sandy Painter");
        System.out.println(test);
        test.setName("Benny Programmer");
        System.out.println(test);
        test.setName("Sally Baker");
        System.out.println(test);
        test.setName("John Doe");
        System.out.println(test);
        test.setName("Sammy Lammy");
        System.out.println(test);
    /*
    OUTPUT
    Sandy
    Painter
    Sandy Painter
    Benny
    Programmer
    Benny Programmer
    Sally
    Baker
    Sally Baker
    John
    Doe
    John Doe
    Sammy
    Lammy
    Sammy Lammy
     */
    }
}
