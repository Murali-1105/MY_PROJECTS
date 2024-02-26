import java.util.*; 
  
public class Ratings {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your Star Ratings 1 to 5: "); 
        int n = scanner.nextInt(); 
          
        
        if (n==1) {
            System.out.println("your Star Rating is very bad");
        }else if(n==2){
            System.out.println("your Star Rating is bad"); 
        }else if(n==3){
            System.out.println("your Star Rating is average"); 
        }else if(n==4){
            System.out.println("your Star Rating is good"); 
        }else if(n==5){
            System.out.println("your Star Rating is very good "); 
        }else{ 
            System.out.println("Invalid input ");
        }
    
 }
}
