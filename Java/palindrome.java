import java.util.Scanner;

public class palindrome { 
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter any Word: ");
     String s = scanner.nextLine(); 
      
     int n=s.length();  
     String reverse ="";
    
     for(int i=n-1;i>=0;i--){ 
            reverse=reverse+s.charAt(i);
     }
      

     if (s.equals(reverse)) {
             System.out.println(s + " is a palindrome.");
      } else { 
              System.out.println(s + " is not a palindrome."); 
      }

   }

}