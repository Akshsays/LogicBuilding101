public class Solution
{
    static void Q1()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+"".repeat(i));
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void Q2()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+"".repeat(j));
            }
            System.out.println();
        }
        System.out.println();
    }

    static void Q3()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=6-i;j++)
            {
                System.out.print(j+"".repeat(i));
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