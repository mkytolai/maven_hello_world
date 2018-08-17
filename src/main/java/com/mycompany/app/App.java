package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    String addNonsense(String inputstring)
    {
        return (inputstring+" nonsense");
    }
    public static void main( String[] args )
    {
        App foo = new App();
        System.out.println(foo.addNonsense("testing"));
    }



}
