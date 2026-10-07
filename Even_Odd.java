import java.util.Scanner;
public class Even_Odd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        double Num = sc.nextDouble();

        if(Num%2==0)
        {
            System.out.print("Number is Even");
        }
        else if (Num%2!=0)
        {
            System.out.print("Number is Odd");
        }
        else
        {
            System.out.print("Number is Zero");
        }
    }
}
