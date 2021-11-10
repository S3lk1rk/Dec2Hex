
import java.util.Scanner;


class Dec2Hex
{

    public static int EnteredValue;

    public static void main(String args[])
    {
        
        Dec2HexConv(args); 

    }
    public static Dec2HexConv(String args[]){
    
        if (args.length == 0 || (args.equals(" "))){ 
            System.out.println("No entry made, please enter an integer");
	    return;
            }
            try
            {
                 EnteredValue = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException ex)
            {
              System.out.println("The entered value exists outwith the current bounds of the system, please enter an integer");
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

        System.out.println("Hexadecimal representation is: " + hexadecimal);
}
}


