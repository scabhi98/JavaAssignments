import java.util.Scanner;
public class Identities {
    float number1, number2;
    Identities(){
        number1 = 0;
        number2 = 0;
    }
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        number1 = s.nextFloat();
        System.out.print("Enter number 2: ");
        number2 = s.nextFloat();
        s.close();
    }
    public void wholeSquare() {
        float result;
        result = BasicMaths.square(number1) + BasicMaths.square(number2) + 2 * BasicMaths.multiply(number1, number2);
        System.out.println("(a + b)^2 = " + result);
    }
    public void wholeCube() {
        float result;
        result = BasicMaths.cube(number1) + BasicMaths.cube(number2) 
                + 3 * BasicMaths.add(number1, number2) * BasicMaths.multiply(number1, number2);
        System.out.println("(a + b)^3 = " + result);
    }
    
}