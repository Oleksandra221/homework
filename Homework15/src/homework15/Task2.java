package homework15;

import java.io.*;
import java.nio.file.Path;

public class Task2 {
    /*The lineSeparator() is a built-in method in Java which returns
    the system-dependent line separator string.
    It always returns the same value – the initial value of the system property line.separator.*/
    public static final String PUBLIC = "public";
    public static final String PRIVATE = "private";

    public void task1() throws IOException {
        File file = new File("C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\JavaProgramExample.txt");
        File resultFile = new File("C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\JavaProgramExResult.txt");


        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))) {
                String line;
                while ((line=bufferedReader.readLine())!=null) {
                    bufferedWriter.append(line.replace(PUBLIC, PRIVATE)).append(System.lineSeparator());
                }
            }
        }
    }

    public static void main(String[] args){
        Task2 task2 = new Task2();
        try {
            task2.task1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
