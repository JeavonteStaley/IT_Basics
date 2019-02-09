
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeavonte Staley
 */
public class String_Basics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Concatenation Example
        
        //Creates two string variables with the names firstName and lastName.
        String firstName;
        String lastName;
        String fullName; 
        
        //Asks the user to enter a first and last name, then assigns them to the two variables.
        System.out.println("UserInput:");
        System.out.println("------------------");
        System.out.print("Enter your first name:");
        firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        lastName = in.nextLine();
        
        //Adds the two strings together. i.e. concatination Then adds them to a variable called fullName.
        fullName = firstName + " "+ lastName;
        System.out.println("Your full name is: " + fullName);
        System.out.println("-------------------------------------------------------");
        
        
        
        String userName;
        String answer;
        
        //String - is a collection of characters.
        System.out.println("Static string: ");
        System.out.println("------------------");
        String name = "Jeavonte";
        System.out.println("Name: " + name);     
        
        System.out.println("-------------------");
        System.out.println("Checks for a yes.");
        System.out.println("---------------------");
        System.out.print("Are we there yet? ");
        //gets user input and assigns it to the string varible answer.
        answer = in.nextLine();
        
       //Checks if user entered a specific word,regardless of the case.
        if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y")){
            System.out.println("Finally!!");
        }else{
            System.out.println("No!!");
        }
        
    }
    
}
