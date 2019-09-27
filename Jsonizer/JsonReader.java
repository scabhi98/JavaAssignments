package Jsonizer;
/**
 * JsonReader
 */

import java.io.FileInputStream;
import java.io.IOException;

public class JsonReader {

    String json;
    JsonReader(String jsonString){
        json = jsonString;
    }
    JsonReader(FileInputStream fis) {
        try {
            while (fis.available() != 0) {
                json = String.valueOf(fis.readAllBytes());
            }
        } catch (IOException e) {
            System.out.println("Input Stream is either closed or some I/O Error Occurred.");
            json = null;
            return;
		}
    }
    
}