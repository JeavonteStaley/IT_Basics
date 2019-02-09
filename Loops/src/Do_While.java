/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeavonte Staley
 */
public class Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 1;
        //With a do while loop, the do allows the loop to run at least once.
        do{
            System.out.println(counter);
            counter++;
        }while(counter <= 10);
    }
    
}
