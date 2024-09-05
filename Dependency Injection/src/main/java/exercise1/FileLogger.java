package exercise1;

import java.io.FileWriter;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        try (FileWriter fileWriter = new FileWriter("log.txt", true);){
            fileWriter.write(message + "\n");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file");
        }
    }
}
