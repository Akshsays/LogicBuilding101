// Q1. Write a program where the user enters a number, and the program prints its multiplication table.
// Q2. Write a program that acts as a calculator, taking two numbers and an operator from the user, and performing the operation based on the operator.
// Q3. Write a program where the user enters a number, and the program prints it in reverse order.
import java.util.Scanner;

public class Solution
{
    static void Q1()
    {
        Scanner myobj1=new Scanner(System.in);
        int num,i;

        System.out.print("Enter the number for multiplication table:");
        num=myobj1.nextInt();

        if(num<=0)
        {
            System.out.println("Invaild input");
        }
        else
        {
            System.out.println("\n");
            System.out.println("** Multiplication table of "+num+":");
            System.out.println("\n");
            for(i=1;i<=10;i++)
            {
                System.out.println(num+"*"+i+":"+(num*i));
            }
        }
    }

    static void Q2()
    {
        Scanner myobj2=new Scanner(System.in);
        int ch,num1,num2;

        System.out.print("Enter first number:");
        num1=myobj2.nextInt();

        System.out.print("Enter second number:");
        num2=myobj2.nextInt();

        if(num1<=0 || num2<=0)
        {
            System.out.println("Invalid input");
        }
        else
        {

        do { 
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter your choice (**`+`**, **`-`**, **`*`**, **`/`**):");
            ch=myobj2.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Addition:"+(num1+num2));
                    break;
                case 2:
                    System.out.println("Substraction:"+(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication:"+(num1*num2));
                    break;
                case 4:
                    System.out.println("Division:"+(num1/num2));
                    break;
            }
        } while (ch >= 1 && ch <= 4);
        }

    }

    static void Q3()
    {
        Scanner myobj3=new Scanner(System.in);
        int num,remainder,reverse=0;

        System.out.print("Enter the number:");
        num=myobj3.nextInt();

        while(num>0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println("Reverse of number is:"+reverse);
    }
    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }
}