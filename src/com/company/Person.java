package com.company;

public abstract class Person
{
    private String firstName;
    private String familyName;

    public Person(String firstname, String familyName)
    {
        this.firstName = firstname;
        this.familyName = familyName;


    }
    public abstract String getFirstName();
    public abstract String getFamilyName();

    public boolean equals(Person p)
    {
        if(firstName.equals(familyName)) {
            return true;
        }
        else
        {
            return false;
        }
    }



}
