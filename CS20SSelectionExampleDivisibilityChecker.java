/* *********************************
* Programmer:  Sveinson
* Class:       CS20S
*
* Assignment:  Selection Example Checking Divisibility
*
* Description: Get two numbers from the keyboard and see if n1 is divisible
*               by n2
* ************************************* */

// **** import class libraries ****
import java.util.Scanner;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class CS20SSelectionExampleDivisibilityChecker
{
    public static void main(String[] args){
    // **** constants ****
    
    // **** variables ****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int divisor = 0;    // the number being used to divide
        int dividend = 0;   // the number being divided
        
        boolean divisible = false;      // true if numbers are divisible
     
    // **** objects ****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** output banner *****
    
        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Selection Example 1 Divisibility Checker\n";
        banner += "**************************\n";
        
        System.out.println(banner);
    
    // **** get input ****
        // prompt for input
        prompt = "enter the number to be divided followed by the number to divide by";
        
        // read input from keyboard buffer
        strin = JOptionPane.showInputDialog(banner + prompt);
        
        // echo input back to output window
        JOptionPane.showMessageDialog(null, banner + "You entered " + strin);
        // "9 3"
        
        tokens = strin.split(delim);
        // "9" "3"
        
        dividend = Integer.parseInt(tokens[0]);
        divisor = Integer.parseInt(tokens[1]);
   
    // **** processing ****
    
        if(dividend % divisor == 0){
            //System.out.println("divisible");
            divisible = true;       // set divisible to true
        }// end if
        else{
            //System.out.println("not divisible"); 
            divisible = false;      // set divisible to false
        }// end else
    
    // **** output ****
    
        System.out.println(dividend + " is divisible by " + divisor + ": " + divisible);
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
