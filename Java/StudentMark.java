import java.util.Scanner; 

class StudentMark{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); 

    System.out.print("Enter Your Marks: ");
    float M=s.nextFloat(); 
    if (M<=100 && M>=75) { 
    System.out.println("Grade A");
    }else if(M<75 && M>=60){ 
    System.out.println("Grade B");
    }else if(M<60 && M>=35){  
     System.out.println("Grade C" );
    }else if(M<35 && M>=0){ 
    System.out.println("Grade D"); 
    }else{ 
    System.out.println("Invalid Marks");  
    }
}
}
