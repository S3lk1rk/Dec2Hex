package Unit_testing_cw;
import java.util.Scanner;


class Dec2Hex
{

    public static int EnteredValue;	
    public static void main(String args[])
    {

     String result = Dec2HexConv(args);
	System.out.println(result);

    }
    public static String Dec2HexConv(String args[]){
	// this checks if the argument input is empty by checking if its length is 0, if it is an error is displayed
                if (args.length == 0){
                String Unfilled="No entry made, please enter an integer";
                return Unfilled;
            }
	// if a non integer is input this catches the exception and outputs an error message
            try
            {
                 EnteredValue = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException ex)
            {
                String exception="The entered value exists outwith the current bounds of the system, please enter an integer";
            return exception;
                }



        EnteredValue = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = EnteredValue;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        String conversion= ("Hexadecimal representation is: " + hexadecimal);
        return conversion;
}
}

