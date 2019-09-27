import java.util.Scanner;
public class WholeSquare {
    int a,b, sum;
    WholeSquare(){
        a=0;
        b=0;
        sum=0;
    }
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = s.nextInt();
        System.out.print("Enter b: ");
        b = s.nextInt();
        sum = a*a + b*b + 2*a*b;
        s.close();
    }
    public void result() {
        System.out.println("(a + b)^2 = " + sum);
    }
}