package com.company;

public class Runner{

    public static void main(String[] args) {
        Teacher = new Teacher("Derp","Derp","Mr.","Math")
        Student[]Student = new Student(randomStudent());
        int average = 0;
        for(int cur : Student)
        {
            average += Student[cur].getGPA();
        }
        Classroom.printClass();
        System.out.println(average/Student.length);
    }
    public static String randomStudent()
    {
        String Letter = "abcdefghijklmnopqrstuvwxyz";
        int x = (int)(Math.random() * 25);
        String firstName = Letter.substring(x,x + 1).toUpperCase();
        System.out.println(firstName);
        for(int i = 1; i < (Math.random() * 10); i++)
        {
            x = (int)(Math.random() * 25);
            firstName = firstName + Letter.substring(x,x + 1);
        }
        String familyName = Letter.substring(x ,x + 1).toUpperCase();
        for(int i = 1; i < (Math.random() * 10); i++)
        {
            x = (int)(Math.random() * 25);
            familyName = familyName + Letter.substring(x,x + 1);
        }
        double gpa = (Math.random() * 100);
        return firstName + ", " + familyName + "," + "" + gpa + "";
    }
}
