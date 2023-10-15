package Homework_1;
import java.io.FileWriter;
import java.io.IOException;

public class FileWork {
    private String fileName;

    public FileWork(String fileName) {
        this.fileName = fileName;
    }

    public void saveDoc(String text) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(text);
            fileWriter.write("\n");

            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
