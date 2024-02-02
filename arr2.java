import java.util.*;

class arr2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] no = new int[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter Value => ");
            no[i] = sc.nextInt();
        }

        System.out.println("\n\nDisplay Array");

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Value => "+no[i]);
            
        }
    }
}