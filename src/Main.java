import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int[] b= new int[3];
         b [0]=1;
         b [1]=2;
         b [2]=3;
         double [ ] a ={1.57, 7.654, 9.986};
        int [ ] c={6,7,9};
        System.out.println("задание 2");
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i]);
            if  (i<b.length-1)
            {
                System.out.print(", ");
            }
            }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
            if  (i<a.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < c.length; i++)
        {
            System.out.print(c[i]);
            if  (i<c.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("задание 3");

        for (int i = b.length-1; i >= 0; i--)
        {
            System.out.print(b[i]);
            if  (i !=0)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = a.length-1; i >= 0; i--)
        {
            System.out.print(a[i]);
                if  (i !=0)
                {
                System.out.print(", ");
                }
        }
        System.out.println(" ");

        for (int i = c.length-1; i >= 0; i--)
        {
            System.out.print(c[i]);
            if  (i !=0)
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("задание 4");

        for (int i = 0; i < b.length; i++)
        {
            if (b[i] % 2 != 0)
            {
                b[i]++;
            }
        }
                System.out.println(Arrays.toString(b));



    }
}