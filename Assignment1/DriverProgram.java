import java.util.Scanner;
public class DriverProgram {
    public static void main(String args[]) {
        Array ar;
        Scanner s = new Scanner(System.in);
        if(args.length == 0)
            return;
        switch (args[0]) {
            case "Fibonacci":
                int terms;
                System.out.print("Enter Number of Terms: ");
                terms = s.nextInt();
                FibonacciSeries.printSeries(terms);
                break;
            case "QuickSort":
                System.out.printf("\nEnter Number of Elements: ");
                ar = new Array(s.nextInt());
                ar.readArray();
                System.out.printf("\nEntered Array: ");
                ar.printArray();
                ar.quickSort();
                System.out.printf("\nSorted Array: ");
                ar.printArray();
                break;
            case "BubbleSort":
                System.out.printf("\nEnter Number of Elements: ");
                ar = new Array(s.nextInt());
                ar.readArray();
                System.out.printf("\nEntered Array: ");
                ar.printArray();
                ar.bubbleSort();
                System.out.printf("\nSorted Array: ");
                ar.printArray();
                break;
            case "Triangle":
                Triangle tr = new Triangle();
                if(tr.getSides())
                    System.out.printf("\nTriangle Constructed Successfully. Its area is: " + tr.getArea() + "\n\n");
                else
                    System.out.printf("\nTraingle Cannot be formed using side lengths entered.\n\n");
                break;
            default:
                System.out.printf("\nUnknown Argument Supplied");
                break;
        }
        System.out.println("\n");
        s.close();
    }
}