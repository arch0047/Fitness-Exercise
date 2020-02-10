package com.company;

public class Employee extends Person {

    private int hours;
    private int salary;


    public Employee()
    {
        super();

    }
    public Employee(String Name, String Cpr,int Hours,int Salary)
    {
        super(Name,Cpr);
        this.hours=Hours;
        this.salary=Salary;
    }

//public Employee(int Hours,int Salary){
//}

    public void SetHours(int Hours )
    {
        this.hours = Hours;
    }
    public int getHours()
    {
        return hours;
    }

    public void SetSalary( int Salary)
    {
        this.salary= Salary ;
    }
    public int getSalary()
    {
        return salary ;
    }
    public String toString()
    {
        return this.hours+"\t"+this.salary+"\t\t";
    }
}
