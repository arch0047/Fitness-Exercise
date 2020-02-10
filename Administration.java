package com.company;

public class Administration extends Employee{

    private int vacation= 5;

    public Administration()
    {
        super();
    }
    public Administration(String Name, String Cpr,int Hours,int Salary, int Vacation)
    {
        super(Name,Cpr,Hours,Salary);
        this.vacation= Vacation;

    }
    @Override
    public int getHours()
    {
        return super.getHours() ;
    }

    public int getSalary()
    {

        return super.getSalary();
    }
    public int getVacation(){
        return vacation;
    }

}