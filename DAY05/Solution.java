// Q2. Write a program to check whether a str entered by the user is a vowel (**`a, e, i, o, u`**) or a consonant.
// Q1. Write a program that calculates the sum of the digits of a number entered by the user.
// Q3. Write a program that takes a character as input and displays its ASCII value.
import java.util.Scanner;

public class Solution
{

    static void Q2()
    {
        Scanner myobj=new Scanner(System.in);
        String str;

        System.out.print("Enter the str:");
        str=myobj.next();

        str=str.toLowerCase();

        if(str.isEmpty())
        {
            System.out.print("Invaild input");
        }
        else if(str.matches(".*[aeiou].*"))
        {
            System.out.println("Entered string contain vowels");
        }
        else
        {
            System.out.println("Entered string doesn't contain any vowels");
        }
        
    }

    static void Q1()
    {
        Scanner myobj2=new Scanner(System.in);
        int num,remainder,sum=0;
        
        System.out.print("Enter number for reverse:");
        num=myobj2.nextInt();

        while(num>0)
        {
            remainder=num%10;
            sum=sum+remainder;
            num=num/10;
        }
        System.out.println("Sum of the numbers is:"+sum);
    }

    static void Q3()
    {

        char str='@';
        int ascii;
        
        ascii=(int)str;
        System.out.println("Ascii value of "+str+" is:"+ascii);
    }

    public static void main(String[] args) {
        
        Q2();
        Q1();
        Q3();
    }
}