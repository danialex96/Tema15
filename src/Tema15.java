import java.util.*;
public class Tema15 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num = 0;
        int pow = 0;
        int puterea = 0;

        System.out.print("Enter numar: ");
        num = sc.nextInt();

        System.out.print("Enter puterea: ");
        pow = sc.nextInt();

        System.out.print(puterea(num,pow));
    }
    public static int puterea(int a, int b)
    {
        int puterea = 1;
        for(int c=0;c<b;c++)
            puterea*=a;
        return puterea;
    }

}
