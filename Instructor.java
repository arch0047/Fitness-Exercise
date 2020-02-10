package com.company;


public class Instructor extends Employee {


    int salaryPerHours = 456;
    int hours;
    int salary;

    @Override
    public void SetSalary(int Salary)
    {

        this.salary= Salary;

    }
    public int getSalary()
    {
        salary = 456*hours;
        return salary ;}

    public Instructor(){}

    public Instructor(int salaryPerHours, int Hours,
                      int salary ){}
}
