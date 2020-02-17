package com.ethan;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {   
        try{
            MidiApp.runTest();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
