/*Create a Program that takes user input for Student Fee and University Discount to compute the
discounted amount and discounted price the student will pay for the course.
Hint =>
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___*/



import java.util.*;
public class StudentFee_Discount{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student Fee");
      double StudentFee=sc.nextDouble();
      System.out.println("Discount%");
      double discountPercent=sc.nextDouble();
      
      double Discount=((StudentFee * discountPercent)/100);
     
      double Final_Discounted_Fee=(StudentFee - Discount);
      
      System.out.println(Final_Discounted_Fee);
 }
}
      