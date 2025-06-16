/*Create a program to calculate the profit and loss in number and percentage based on the cost price
of INR 129 and the selling price of INR 191.
Hint =>
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P =>
The Cost Price is INR ___ and the Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___*/


import java.util.*;

public class ProfitLossCalculate{
   public static void main(String[] args){
   
   double cp=129;
   double sp=191;

   double profit=sp-cp;
   double Profit_Percentage = profit / cp * 100;

   System.out.println("The Cost Price is INR" + cp + "and the Selling Price is INR" + sp + "The Profit is INR " + profit + "and the Profit Percentage is"  + Profit_Percentage);
	}
}
   
   
