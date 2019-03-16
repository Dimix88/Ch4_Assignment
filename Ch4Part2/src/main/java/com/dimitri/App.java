package com.dimitri;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee john = new Teacher("John", "Down", 115,"Parklands High");
        System.out.println(john.printDetails());
    }
}
