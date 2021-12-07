package homework15;

import java.io.*;
import java.util.ArrayList;

public class Task5 {

    public static void task5(String file,String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);

        if (f.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line;
                double avg;
                String line_result;

                while ((line=bufferedReader.readLine())!=null) {
                    String[] arr = line.split(" ");
                    avg = Double.parseDouble(arr[1]);

                    if (avg>7.0){
                        line_result = arr[0].toUpperCase() + " " + String.valueOf(avg);
                    } else {
                        line_result = line;
                    }
                    bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                    line_result = "";
                }

            }
        }
    }

    public static void main(String[] args){
        String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task5.txt";
        String result_file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task5Result.txt";
        try {
            task5(file, result_file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
