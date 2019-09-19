package com.lambton;

public class FirstDay
{
    public static void main(String[] args)
    {
        System.out.println ("shiji");
        //variable declaration
        int a, b, c, i;
        //value assignment
        a=10;
        b=20;
        c = a + b;
        //display
        System.out.println("sum : " + c);
        Integer x = Integer.MAX_VALUE;
        System.out.println("x : " + x);
        int y = x + 1;
        System.out.println("Y : " + y);
        System.out.println("Min : " + Integer.MIN_VALUE);

        student s1 = new student();
        s1.setValues();
        s1.display();

        student s2 = new student();
        s2.setValues();
        s2.display();

        student s3 = new student();
        s3.setValues();
        s3.display();

        student s4 = new student();
        s4.studentID = 4;
        s4.studentName = "shiji";
        s4.display();

    }
}
