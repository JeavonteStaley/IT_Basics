
import java.util.Scanner;

   /* + = Addition: adds two numbers or concatenats two strings together.
    * - = Subtraction: subtract two numbers
    * / = Division: divides two numbers
    * * = Multiplication: multiplys two numbers
    * % = Modulus: calculates and returns the remainder of to divisible numbers
   */

/**
 *
 * @author Jeavonte Staley
 */
public class Operators {

    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOne;
        int numTwo; 
        System.out.print("Enter first number: ");
        numOne = in.nextInt();
        System.out.print("Enter a second number: ");
        numTwo = in.nextInt();
        System.out.println("------------------------------");
        int addition = numOne + numTwo;
        System.out.println("Addition: " +numOne +" + " + numTwo + " = "+ addition);
        
        int subtraction = numOne - numTwo;
        System.out.println("Subtraction: " + numOne +" - "+ numTwo + " = "+ subtraction);
        
        int division = numOne / numTwo;
        System.out.println("Division: " + numOne + " / " + numTwo + " = "+ division);
        
        int mulitplication = numOne * numTwo;
        System.out.println("Multiplication: " + numOne + " * " + numTwo + " = "+ mulitplication);
        
        int modulus = numOne % numTwo;
        System.out.println("The remainder is: " + numOne + " % " + numTwo + " = " + modulus);
    }
    
}
