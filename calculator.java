import java.util.Scanner;
public class calculator {
    private int solution; 
    private static int i; 
    private static int j; 

    public calculator(int i, int j) 
    { 
        this.i = i;
        this.j = j;
        solution = 0;  
    } 

    public int geti() {
        return i;
    }

    public int getj() {
        return j;
    }

    public int add(){
        return geti() + getj();
    }

    public int subtract(){
        return geti() - getj();
    }

    public int multiply(){
        return geti() * getj();
    }

    public int divide(){
        return geti() / getj();
    }
}
