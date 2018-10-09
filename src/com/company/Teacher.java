package com.company;

public class Teacher extends Person
{

    private String Title;
    private String Subject;

    public Teacher(String firstName, String familyName, String Title, String Subject)
    {
        super(firstName,familyName);
        this.Title = Title;
        this.Subject = Subject;

    }
    public String getSubject()
    {
        return this.Subject;
    }
    public String toString()
    {
        return this.Title + this.getFamilyName();

    }

}