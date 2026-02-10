public class Solution
{
    static void Q1()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n"); // space between each question
    }

    static void Q2()
    {
        int i,j,k;
        for(i=1;i<=5;i++) // creating row 
        {
            for(j=1;j<=5-i;j++) // create spaces in column
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++) // print star in column 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Q3()
    {
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i*2-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }
}