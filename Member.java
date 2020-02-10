package com.company;

public class Member extends Person {

    private boolean isBasic;

    private String memberType;
    private int monthlyFee;


    public Member()
    {
        super();

    }

    public Member(String Name, String Cpr,String MemberType,int MonthlyFee)
    {
        super(Name,Cpr);
        this.memberType = MemberType;
        monthlyFee=MonthlyFee;
    }

    public Member(String Name, String Cpr,boolean isBasic,String MemberType,
                  int MonthlyFee)
    {
        super(Name,Cpr);
        this.isBasic = isBasic;
        memberType = MemberType;
        monthlyFee=MonthlyFee;
    }

    public void setIsBasic(boolean isBasic)
    {
        this.isBasic = isBasic;
    }

    public boolean getIsBasic()
    {
        if(monthlyFee==199)
        {
            isBasic=true;
        }
        else
        {
            isBasic=false;
        } return isBasic;
    }

    public void setMemberType(String MemberType)
    {
        this.memberType = MemberType;
    }

    public String getMemberType()
    {
        if(monthlyFee==199)
        {
            memberType="Basic";
        }
        else
        {
            memberType="Full";
        }
        return memberType;
    }

    public void setMonthlyFee(int MonthlyFee)
    {
        this.monthlyFee=MonthlyFee;
    }

    public int getMonthlyFee()
    {
        if(memberType=="Basic")
        {
            monthlyFee=199;
        }
        else
        {
            monthlyFee=299;
        }
        return monthlyFee;

    }


}




