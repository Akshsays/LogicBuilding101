// Q1. Write a program that checks whether a number entered by the user is odd or even.
// Q2. Write a program that determines if a number entered by the user is divisible by 5.
// Q3. Write a program that verifies if a number entered by the user is a multiple of 7.
import java.util.Scanner;

public class Solution
{

    static void Q1()
    {
        Scanner myobj= new Scanner(System.in);
        
        int num;

        System.out.print("Enter the number:");
        num=myobj.nextInt();

        if(num<=0)
        {
            System.out.println("Are you serious right now bruh??");
        }
        else if(num%2==0)
        {
            System.out.println("Entered number is Even");
        }
        else
        {
            System.out.println("Entered number is Odd");
        }
    }

    static void Q2()
    {
        Scanner myobj2= new Scanner(System.in);
        
        int num;

        System.out.print("Enter the number:");
        num=myobj2.nextInt();

        if(num<=0)
        {
            System.out.println("I might beat your ASS!!");
        }
        else if(num%5==0)
        {
            System.out.println("Number "+num+" is divisble by "+7);
        }
        else
        {
            System.out.println("Number "+num+" is not divisble by "+7);
        }

    }

    static void Q3()
    {
        Scanner myobj3= new Scanner(System.in);
        
        int num;

        System.out.print("Enter the number:");
        num=myobj3.nextInt();

        if(num<=0)
        {
            System.out.println("RAHHHHHHH!!");
        }
        else if(num%7==0)
        {
            System.out.println("Number "+num+" is divisble by "+5);
        }
        else
        {
            System.out.println("Number "+num+" is not divisble by "+5);
        }

    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }
}