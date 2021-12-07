package homework15;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task9 {

    public static void taks9(String file, String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);
        String line_result = "";
        if(f.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line;
                while((line = bufferedReader.readLine())!=null){
                    String[] arr = line.trim().split(" ");
                    char[] char_arr = arr[0].toCharArray();
                    if (arr[0].charAt(0)=='/'){
                        bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());

                    } else {
                        bufferedWriter.append(line.replace(line, line)).append(System.lineSeparator());
                    }

                    line_result="";
                }
            }
        }
    }

    public static void main(String[] args){
        String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task9.txt";
        String result_file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task9Result.txt";
        try {
            taks9(file, result_file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
