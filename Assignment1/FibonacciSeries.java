public class FibonacciSeries {
        public static void printSeries(int terms) {
            long a=0, b=1, c;
            for (int i = 0; i < terms; i++) {
                    System.out.print(" " + a);
                    c = a + b;
                    a = b;
                    b = c;
            }
            System.out.println("");
        }
}