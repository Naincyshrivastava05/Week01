import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2= sc.nextInt();
	char op = sc.next().charAt(0);
	int result = 0;
	switch(op){
	 case '+':
             	   result = num1 + num2;  
           	    break;
        	    case '-':
     	    result = num1 - num2;  
              	  break;
      	     case '*':
  	             result = num1 * num2;
           	     break;
     	       case '/':
       	 
           	     if (num2 != 0) {
               	     result = num1 / num2;
            	    } else {
            	        System.out.println("Error! Division by zero.");
     	           }
              	  break;
         	   case '%':
            	    result = num1 % num2;  
            	    break;
    	        default:
            	    System.out.println("Invalid operator! Please enter one of (+, -, *, /, %).");
             	   break;
	}
	   System.out.println("Result: " + result);
	}
}