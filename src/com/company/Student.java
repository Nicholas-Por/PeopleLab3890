package com.company;

public class Student extends Person
{
    private double GPA;
    private String gender, age;

    public Student(String firstName, String familyName,double GPA,String age,String gender)
    {
        super(firstName,familyName);
        this.GPA = GPA;
        this.age = age;
        this.gender = gender;
    }

    public double getGPA()
    {
        return this.GPA;
    }

    public String getGender()
    {
        return this.gender;
    }

    public String getAge() {
        return age;
    }

    public String toString()
    {
        return this.getFamilyName() + this.getFirstName();
    }
}
