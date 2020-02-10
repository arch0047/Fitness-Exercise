package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Handling{

    private Scanner x;
    private Scanner y;
    private Scanner z;


    // Reading the file Persons.txt ====
    public void openFile()
    {
        try {
            x = new Scanner(new File("Persons.txt"));
        }
        catch(Exception e)
        {
            System.out.println( " File not found !");
        }
    }

    public void readFile()
    {
        while (x.hasNext())
        {
            String a= x.next();
            String b= x.next();
            System.out.printf( "%S %S\n",a,b);
        }
    }
    public void closeFile()
    {
        x.close();
    }

    // Reading the file Member.txt ====
    public void openFile1()
    {
        try {
            y = new Scanner(new File("Member.txt"));
        }
        catch(Exception e)
        {
            System.out.println( " File not found !");
        }
    }

    public void readFile1()
    {
        while (y.hasNext())
        {
            String a1= y.next();
            String b1= y.next();
            System.out.printf( "%S %S\n",a1,b1);
        }
    }
    public void closeFile1()
    {
        y.close();
    }

    // Reading the file Employee.txt ====
    public void openFile2()
    {
        try {
            z = new Scanner(new File("Employee.txt"));
        }
        catch(Exception e)
        {
            System.out.println( " File not found !");
        }
    }

    public void readFile2()
    {
        while (z.hasNext())
        {
            String a2= z.next();
            String b2= z.next();
            System.out.printf( "%S %S\n",a2,b2);
        }
    }
    public void closeFile2()
    {
        z.close();
    }
}



