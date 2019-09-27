import java.io.BufferedInputStream;
import java.io.Console;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputTest {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.printf("Hello Abhijit.");
        }
        System.out.printf("\r\r");
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}