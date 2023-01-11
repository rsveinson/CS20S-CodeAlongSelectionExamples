/* *********************************
* Programmer:  Sveinson
* Class:       CS20S
*
* Assignment:  Selection Example Range Checker
*
* Description: get a number from the keyboard, if 
*               it's between 10 and 100 increase it by 5%
*               if it's not in range set the result to 0
* ************************************* */

// **** import class libraries ****
import java.util.Scanner;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class CS30SelectionExampleRangeChecker
{
    public static void main(String[] args){
    // **** constants ****
        
        // set the range boundaries
        final int LOW = 10;
        final int HIGH = 100;
        
        // increment percentage
        final double INCREASE = 0.05;
    
    // **** variables ****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int n = 0;                      // from keyboard
        double increaseAmount = 0.0;    // amount of increase
        double result = 0.0;            // the result of some math
     
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** output banner *****
    
        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Selection Example Range Checker" + nl;
        banner += "**************************\n";
        
        System.out.println(banner);
    
    // **** get input ****
        // prompt for input
        prompt = "enter a number between 10 and 100.";
        
        // read input from keyboard buffer
        n = scanner.nextInt();
        
        // echo input back to output window
        System.out.println("You entered " + n);
    
    // **** processing ****
    
        if(n >= LOW && n <= HIGH){
            //System.out.println("in range");
            increaseAmount = n * INCREASE;        // calculate the increase
            result = n + increaseAmount;          // calculate final total
        }// end if in range
        else{
            //System.out.println("not in range");
            result = 0.0;                       // set result to 0
        }// end else not in range
      
    // **** output ****
    
        System.out.format("Result = %6.2f %s", result, nl);
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
