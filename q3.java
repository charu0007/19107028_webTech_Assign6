// Write a main class and declare four objects of Calculator class. Perform
// addition (obj1), subtraction (obj2), multiply (obj3) and division (obj4)
// operations for these objects. If any non integer values are provided as
// input; then you should throw an exception (NumberFormatException)
// and display a message that informs the user of the wrong input.
import java.util.Scanner;
public class q3 {
    public static void main(String args[]){
        try {
            int operand_1 = 1;
            int operand_2 = 2;
            calculator obj1=new calculator(operand_1, operand_2);
            System.out.println("Addition is :: " + obj1.add());
            calculator obj2=new calculator(operand_1, operand_2);
            System.out.println("Subtraction is :: "+obj2.subtract());

            calculator obj3=new calculator(operand_1, operand_2);
            System.out.println("Multiplication is :: "+obj3.multiply());
            calculator obj4=new calculator(operand_1, operand_2);
            System.out.println("Division is :: "+obj4.divide());


        }
        catch (NumberFormatException ne)
        {
            System.out.println(ne.getMessage());
        }

    }
   
    
}
