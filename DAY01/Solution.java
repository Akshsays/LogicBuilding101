// Q1. Write a program where the user is asked to enter an integer number, and the program prints that number back to them.
// Q2. Write a program that displays the size of fundamental data types (**`int`**, **`float`**, **`double`**, and **`char`**) on your system.
// Q3. Write a program to compare two integers entered by the user and print the larger one.
import java.util.Scanner;

public class Solution
{
    static void Q1()
    {
        Scanner myobj=new Scanner(System.in);
        int input;

        System.out.print("Enter a number:");
        input=myobj.nextInt();

        //output
        System.out.println("You have entered:"+input);
        System.out.println("\n");
    }
    static void Q2()
    {
        System.out.println("Size of int in bytes:"+Integer.BYTES);
        System.out.println("Size of double in bytes:"+Double.BYTES);
        System.out.println("Size of float in bytes:"+Float.BYTES);
        System.out.println("Size of char in bytes:"+Character.BYTES);
        System.out.println("\n");
    }
    static void Q3()
    {
        Scanner myobj2=new Scanner(System.in);
        int num1,num2;

        System.out.print("Enter the first number:");
        num1=myobj2.nextInt();

        System.out.print("Enter the second number:");
        num2=myobj2.nextInt();

        if(num1>=num2)
        {
            System.out.println("Number "+num1+" is greater or equal to:"+num2);
        }
        else
        {
            System.out.println("Number "+num2+" is greater or equal to:"+num1);
        }
    }
    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }
}