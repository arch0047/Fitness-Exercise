package com.company;

import java.util.*;

public class Person {

    protected String name;
    protected String cpr;


    public Person(){}

    public Person(String Name, String Cpr) {
        this.name = Name ;
        this.cpr=Cpr;

    }

    public void setName(String Name)
    {
        this.name=Name;
    }
    public String getName()
    {
        return name;
    }

    public void setCpr( String Cpr)
    {
        this.cpr= Cpr ;

    }
    public String getCpr()
    {
        return cpr ;
    }

}
