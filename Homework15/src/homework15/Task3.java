package homework15;

import java.io.*;
import java.nio.file.Path;

public class Task3 {
    public static void reverseOrderFile(String file, String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);
        if (f.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line;
                while ((line=bufferedReader.readLine())!=null) {
                    StringBuilder sb=new StringBuilder(line);
                    sb.reverse();
                    //bufferedWriter.write(f_result,sb.toString());
                    bufferedWriter.append(line.replace(line,sb.toString())).append(System.lineSeparator());
                }
            }
        }

    }

    public static void main(String[] args){
        String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\JavaProgramTask3";
        String result_file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\JavaProgramResultTask3.txt";
        try {
            reverseOrderFile(file, result_file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
