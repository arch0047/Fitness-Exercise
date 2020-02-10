package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


class Main {

    private ArrayList<Person>List;
    private ArrayList<Administration>EList;
    private ArrayList<Member>MList;

    public static void main(String[] args)throws Exception
    {
// code for fitness employee and member name and cpr list:
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("Claus","221175-1011"));
        list.add(new Person("Tove" ,"011080-1014"));
        list.add(new Person("Anne" ,"011080-1012"));
        list.add(new Person("Henning","011080-1014"));
        list.add(new Person("Morten" ,"130185-1303"));
        list.add(new Person("Martin" ,"221175-1011"));
        list.add(new Person("Martina","050970-1409"));
        list.add(new Person("Marcel","221175-1011"));

// Code for ==============
        for (int j=0;j<=59;j++)
        {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Fitness Employee and Member Name and Cpr:");
        System.out.println("");
        System.out.printf("%-10s", "Navn");
        System.out.printf("%-15s", "CPR");
        System.out.println("");

// code for  ******
        for (int i=0;i<=59;i++)
        {
            System.out.print("*");
        }
        System.out.println("");

        for (Person s : list)
        {
            System.out.print("");
            System.out.printf("%-10s", s.getName());
            System.out.printf("%-15s", s.getCpr());
            System.out.println("");
        }

// code for Fitness Employees list.
        ArrayList<Administration> Elist = new ArrayList<Administration>();

        Elist.add(new Administration("Claus","221175-1011",37,23000,5));
        Elist.add(new Administration("Tove","011080-1014",20,9120, 0));
        Elist.add(new Administration("Anne","011080-1012",37,23000,5));
        Elist.add(new Administration("Henning","011080-1014",15,6840,0));

        // Code for ==============

        for (int j=0;j<=59;j++)
        {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Fitness Employees:");
        System.out.println("");
        System.out.printf("%-10s", "Navn");
        System.out.printf("%-15s", "CPR");
        System.out.printf("%-10s", "Hours");
        System.out.printf("%-10s", "Salary");
        System.out.printf("%-10s", "Vacation");
        System.out.println();

// code for  ******
        for (int i=0;i<=59;i++)
        {
            System.out.print("*");
        }
        System.out.println("");

        for (Administration s : Elist)
        {
            System.out.print("");
            System.out.printf("%-10s", s.getName());
            System.out.printf("%-15s", s.getCpr());
            System.out.printf("%-10s", s.getHours());
            System.out.printf("%-10s", s.getSalary());
            System.out.printf("%-10s", s.getVacation());
            System.out.println("");
        }

// code for Fitness Member List:
        ArrayList<Member> Mlist = new ArrayList<Member>();

        Mlist.add(new Member("Morten","130185-1303","Full",299));
        Mlist.add(new Member("Martin","221175-1011","Basic",199));
        Mlist.add(new Member("Martina","050970-1409","Full",299));
        Mlist.add(new Member("Marcel","221175-1011","Basic",199));

// Code for ==============
        for (int j=0;j<=59;j++)
        {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Fitness Member:");
        System.out.println("");
        System.out.printf("%-10s", "Navn");
        System.out.printf("%-15s", "CPR");
        System.out.printf("%-10s", "Member Type");
        System.out.printf("%-10s", "Fee");
        System.out.println();

// code for  ******
        for (int i=0;i<=59;i++)
        {
            System.out.print("*");
        }

        System.out.println("");

        for (Member s : Mlist)
        {
            System.out.print("");
            System.out.printf("%-10s", s.getName());
            System.out.printf("%-15s", s.getCpr());
            System.out.printf("%-15s", s.getMemberType());
            System.out.printf("%-10s", s.getMonthlyFee());
            System.out.println();
        }
// code for ========
        for (int j=0;j<=59;j++)
        {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Here reading from the text files :");
        for (int i=0;i<=59;i++)
        {
            System.out.print(".");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Employees and Members list with name and cpr:");
        System.out.println("");
        System.out.println("");

//From Person.txt file
        Handling handling = new Handling();
        handling.openFile();
        handling.readFile();
        handling.closeFile();

// Code for ==============
        for (int j=0;j<=59;j++)
        {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Member List with name and cpr:");
        System.out.println("");
        System.out.println("");

//From Member.txt file
        handling.openFile1();
        handling.readFile1();
        handling.closeFile1();

// Code for ==============
        for (int j=0;j<=59;j++)
        {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Employees List with name and cpr:");
        System.out.println("");
        System.out.println("");
//From Empliyee.txt file
        handling.openFile2();
        handling.readFile2();
        handling.closeFile2();

    }
}
