import java.util.Scanner; 

public class CompanyPayRoll{ 
    public static void main(String arg[]){  
        Scanner scanner= new Scanner(System.in);    
        double hourlyRate=10.0;
        double totalPay=0.0; 
         
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt(); 
          
         for (int i = 1; i <= numEmployees; i++) {
            System.out.print("Enter hours worked for Employee " + i + ": ");
            double hoursWorked = scanner.nextDouble();
    
            double employeePay = hoursWorked * hourlyRate;
            totalPay += employeePay;
            
            System.out.println("Employee " + i + " Pay: $" + employeePay);
        }
    
        System.out.println("Total Pay for the Week: $" + totalPay);
    }
}


