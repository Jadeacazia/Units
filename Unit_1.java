import java.util.Scanner;  
//to be able to read from the keyboard 

/**
 * Student name : A.Ammon
 * Student Number : ST10451774
 * 
 */
    public class Unit1 {
    public static void main(String[] args) {
        //create a scanner object to read from the keyboard
    Scanner keyboard = new Scanner(System.in);
        double hours;
        double rate;
        double pay = 0;
        
        //Display prompts and get input
        System.out.println("How many hours did you work?" );
        hours = keyboard.nextDouble();
        
        System.out.println("How much do you get paid per hour?");
        rate = keyboard.nextDouble();
        
        //Calculations
        if (hours <= 40) {
            // Calculate gross pay for 40 hours or less
            pay = hours * rate;
        } else {
            // Calculate gross pay for more than 40 hours
            pay = hours * (rate * 1.5);
        }
        //display results
        System.out.println("You earned R" + pay );
  
    }
    
}
