/*
 * This for loop iterates(runs through the loop) 20 times.
 */

/**
 *
 * @author Jeavonte Staley
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        * for loop syntax: initilization; condition; increment/decrement
        * initilization: sets the value of the variable
        * condition: sets the condition that is checked before each iteration
        * incredment/decrement: updates the value after each iteration
        */
        for(int i = 1; i <= 20; i++){
            System.out.println("Loop #: " + i);
        }
        System.out.println("---------------------------");
        System.out.println("This loop addition by two.");
        for(int n = 4; n <= 20; n += 2){
            System.out.println("Loop #: " + n);
        }
        System.out.println("------------------------------");
        System.out.println("This loop counts by two, however it explicitly checks if it divisible by two.");
        for(int x = 35; x <= 50; x++){
            if(x % 2 == 0){
                System.out.println("Loop #: " + x);
            }
        }
    }
    
}
