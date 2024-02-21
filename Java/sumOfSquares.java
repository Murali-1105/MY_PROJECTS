import java.util.Scanner;

public class sumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an integer larger than 1 (or 0 to exit): ");
            int n = scanner.nextInt();
            
            if (n <= 1) {
                System.out.println("Goodbye!");
                break; 
            }
            
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            
            System.out.println("Sum of squares from 1 to " + n + " is: " + sum);
        }
    }
}
