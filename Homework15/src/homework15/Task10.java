package homework15;

import java.io.*;
import java.util.ArrayList;

public class Task10 {

    public static void taks10(String file, String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);
        String line_result = "";
        if (f.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line, temp;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] arr = line.trim().split(" ");

                    temp = arr[0];
                    arr[0] = arr[arr.length-1];
                    arr[arr.length-1] = temp;
                    for (String s : arr){
                        line_result +=s + " ";
                    }

                    bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());

                    line_result = "";
                }
            }
        }
    }
        public static void main(String[] args){
            String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task10.txt";
            String result_file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task10Result.txt";
            try {
                taks10(file, result_file);
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }

}
