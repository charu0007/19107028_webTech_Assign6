// For division and multiplication two numbers should not be zero. If zero is
// entered for any number then throw an exception in respective methods.
// So design an exception handler (ArithmeticException) in multiply () and
// Division () methods respectively to check whether any number is zero or
// not.
import java.util.Scanner;
class q1{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        int operand_1 = myObj.nextInt();
        System.out.println("Enter second integer: ");
        int operand_2 = myObj.nextInt();
        System.out.println("Your input is: " + operand_1 + " " + operand_2) ;
        try{
            int result = divideInt(operand_1, operand_2);
            System.out.println("Your result is: " + result);
        }catch(ArithmeticException ex){
            // System.out.println(ex.getMessage());
            System.out.println(ex);
        }

        try{
            int result = multiplyInt(operand_1, operand_2);
            System.out.println("Your result is: " + result);
        }catch(ArithmeticException ex){
            // System.out.println(ex.getMessage());
            System.out.println(ex);
        }
    }
    public static int divideInt(int i, int j){
        if(i==0 || j==0){
            throw new ArithmeticException("Input cannot be zero");
        }
        return i/j;
    }
    public static int multiplyInt(int i, int j){
        if(i==0 || j==0){
            throw new ArithmeticException("Input cannot be zero");
        }
        return i*j;
    }
}
