public class Solution
{
// square
    static void Q1()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print("* "); // column
            }
            System.out.println(1); // row
        }
    }
// right angle traingle 
    static void Q2()
    {
        int i,j;
        for(i=1;i<=5;i++) // row
        {
            for(j=1;j<=i;j++) // column
            {
                System.out.print("*");
            }
            System.out.println(1);
        }
        System.out.println("\n");
    }
    static void Q3()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            System.out.print(" ");
            for(j=1;j<=5;j++)
            {
                if(i==1||i==5||j==1||j==5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            // confused on hallow pattern
        }
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        // Q3();
    }
}