package Java_Features;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;


public class InputStream {
    public static void main(String[] args) {
        readFromKeyBoard();
        readFromFile();
    }

    static private void readFromKeyBoard() {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter anything: ");
            int letters = isr.read();
            System.out.println((char) letters);
            while (isr.ready()) {
                System.out.print("inside while : ");
                System.out.println((char) letters);
                letters = isr.read();
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static private void readFromFile() {
        System.out.println("Hello from function");
        try(FileReader fr = new FileReader("/home/ubuntu/MyProjects/JAVA_FSD/Java_Features/sample.txt")){
            
            char letter = (char) fr.read();
            while (fr.ready()) {
                System.out.print(letter);
                letter = (char) fr.read();
            }
            fr.close();
        } catch (Exception exp) {
        
        }
    }
}
