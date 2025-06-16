import java.util.*;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate of interest (percent):");
        double rate = sc.nextDouble();
        System.out.println("Enter Time period (years):");
        double time = sc.nextDouble();
         
        double simpleInterest = (principal * rate * time) / 100.0;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
