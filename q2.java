// For addition and subtraction, two numbers should be positive. If any
// negative number is entered then throw an exception in respective
// methods. So design an exception handler (ArithmeticException) in Add ()
// and Subtract () methods respectively to check whether any number is
// negative or not.
import java.util.Scanner;
public class q2 {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        int operand_1 = myObj.nextInt();
        System.out.println("Enter second integer: ");
        int operand_2 = myObj.nextInt();
        System.out.println("Your input is: " + operand_1 + " " + operand_2) ;
        try{
            int result = addInt(operand_1, operand_2);
            System.out.println("Your result is: " + result);
        }catch(ArithmeticException ex){
            // System.out.println(ex.getMessage());
            System.out.println(ex);
        }

        try{
            int result = subtractInt(operand_1, operand_2);
            System.out.println("Your result is: " + result);
        }catch(ArithmeticException ex){
            // System.out.println(ex.getMessage());
            System.out.println(ex);
        }
    }
    public static int addInt(int i, int j){
        if(i<0 || j<0){
            throw new ArithmeticException("Input cannot be negative");
        }
        return i+j;
    }
    public static int subtractInt(int i, int j){
        if(i<0 || j<0){
            throw new ArithmeticException("Input cannot be negative");
        }
        return i-j;
    }

}
