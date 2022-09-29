
import java.util.Scanner;
public class Lily {
	
	public static void main(String[] args) {
	
            Scanner scanner = new Scanner (System.in);
            System.out.print("who are you? Man press 1, Woman press 2 "); 
            
            
    int army = scanner.nextInt();
    
    System.out.println("How old are you? ");
    int me = scanner.nextInt();
    String age = me >= 18 ? "You are an adult " : "too yound, ";
    	System.out.println (age);
    
   //lol = 1;
   //int lol1 = 2;
   
    /* if (army == 1) {
    System.out.println("Go help you country...");
    }
    else if (army == 2) {
    System.out.println("Go help you family...");
    }
   else {
    System.out.println("You Are a child, go drink milk...");
   }
    */
	
	
    //army = 1; 

    switch (army) { 
    
    	case 1:
    		System.out.println("Go help you country...");
    	break; 
    
    	       case 2:
    		       System.out.println("Go help you family...");
    		
    		        break; 
    		        
    	       default:
    	    	   
    	    	   System.out.println("You Are a child, go drink milk...");
    	    	   
    	    	   
    	    	   
    }
	}
    }

    	
    
	



