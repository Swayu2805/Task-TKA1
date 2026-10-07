import java.util.Scanner;
 class Profit_Loss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Cost_Price:");
        double cost_price = sc.nextDouble();

        System.out.print("Enter Selling_Price");
        double selling_price = sc.nextDouble();

        if(selling_price>cost_price)
        {
            double Profit = selling_price-cost_price;
            System.out.print("Profit:"+Profit);
        }
        else if(cost_price>selling_price)
        {
            double Loss = cost_price-selling_price;
            System.out.print("Loss:"+Loss);
        }
        else
        {
            System.out.print("No Profit, No Loss");
        }
    }
}
