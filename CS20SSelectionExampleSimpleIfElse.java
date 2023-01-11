/* *********************************
* Programmer:  sveinson
* Class:       CS20S
*
* Assignment:  Selection Example Simple If/Else
*
* Description: Simple if else example, if a number entered is greater than 10 multiply
*              int by 4 if not square it
* ************************************* */

// **** import class libraries ****
import java.util.Scanner;
import java.text.NumberFormat;

public class CS20SSelectionExampleSimpleIfElse
{
    public static void main(String[] args){
    // **** constants ****
    
        final int FOUR = 4;         // multiplier
        final int TEN = 10;         // boundary value
    
    // **** variables ****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int n = 0;          // entered from the keyboard
        int result = 0;     // result of the math
     
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** output banner *****
    
        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Selection Example Simple If/Else" + nl;
        banner += "**************************\n";
        
        System.out.println(banner);
    
    // **** get input ****
        // prompt for input
        prompt = "enter a number";
        System.out.println(prompt);
        
        // read input from keyboard buffer
        n = scanner.nextInt();
        
        // echo input back to output window
        System.out.println("You entered " + n);
    
    // **** processing ****
    
        if(n > TEN){
            //System.out.println("> 10");
            result = n * FOUR;
        }// end if
        else{
            result = n * n;
        }// end else
    
    // **** output ****
    
        if(n > TEN){
            System.out.println(n + " * " + FOUR + " = " + result);
            
        }// end if
        else{
            System.out.println(n + " * " + n + " = " + result);
        }// end else
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
