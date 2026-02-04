// Q1. Write a program where the user enters a number, and the program calculates its square and cube.
// Q2. Write a program to calculate the area of a circle given its radius and a triangle given its base and height.
// Q3. Write a program where the user enters two integers (divisor and dividend) and calculates their quotient and remainder.

import java.util.Scanner;

public class Solution
{
    static void Q1()
    {
        Scanner myobj1=new Scanner(System.in);
        int num,sqr,cube;

        System.out.print("Enter a number:");
        num=myobj1.nextInt();

        if(num<=0)
        {
            System.out.println("Number is less then or equal to zero");
        }
        else
        {
            sqr=num*num;
            cube=(num*num*num);
            System.out.println("Square of "+num+" is:"+sqr);
            System.out.println("Cube of "+num+" is:"+cube);
        }
    }

    static void Q2()
    {
        Scanner myobj2=new Scanner(System.in);
        int radius,base,height;
        double area_of_circle,area_of_triangle; 

        System.out.print("Enter the radius:");
        radius=myobj2.nextInt();

        System.out.print("Enter base of triangle:");
        base=myobj2.nextInt();

        System.out.print("Enter height of triangle:");
        height=myobj2.nextInt();


        if(radius<=0 || base<=0 || height<=0)
        {
            System.out.println("Entered input is less then or equal to zero");
        }
        else
        {
            area_of_circle=Math.PI*(radius*radius);
            area_of_triangle=0.5*base*height;
            System.out.println("Area of circle :"+area_of_circle);
            System.out.println("Area of triangle :"+area_of_triangle);
        }

    }

    static void Q3()
    {
        Scanner myobj3=new Scanner(System.in);
        int divisor,dividend,remainder;
        float quotient;

        System.out.print("Enter the divident:");
        dividend=myobj3.nextInt();

        System.out.print("Enter the divisor:");
        divisor=myobj3.nextInt();

        if(dividend<=0 || divisor<=0)
        {
            System.out.println("Entered input is less then or equal to zero");
        }
        else
        {
            quotient=(float)dividend/divisor;
            remainder=dividend%divisor;
            System.out.println("Quotient of "+dividend+" is:"+quotient);
            System.out.println("Remainder of "+dividend+" is:"+remainder);
        }
    }


    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }
}