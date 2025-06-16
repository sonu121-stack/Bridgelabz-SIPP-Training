import java.util.Scanner; 
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter °C: ");
            double c = in.nextDouble();
            double f = c * 9 / 5 + 32;
            System.out.printf("%.1f °C = %.1f °F%n", c, f);
        } 
    }
}

