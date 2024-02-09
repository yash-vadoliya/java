// 5. Write a program that Floyd Triangle.
// 1
// 2 3
// 4 5 6
// 7 8 9 10


class Pro_5
{
    public static void main(String[] args)
    {
        int i,j,count =1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}