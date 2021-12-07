package homework15;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

    public static void task6(String file, String file_result) throws IOException {
        File f = new File(file);
        File f_result = new File(file_result);


        if (f.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result));
                 Scanner sc = new Scanner(f, StandardCharsets.UTF_8)) {
                String line;

                String line_result;

                while ((line=bufferedReader.readLine())!=null) {

                    if (sc.hasNextDouble()){
                        line_result = "Double: " + String.valueOf(sc.hasNextDouble());
                        bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                    } else if(sc.hasNextInt()){
                        line_result = "Integer: " + String.valueOf(sc.hasNextInt());
                        bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());

                    } else if(line.length() ==1 && !sc.hasNextInt()){
                        line_result = "Char: " + line;
                        bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                    } else {
                        line_result = "String: " + line;
                        bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                    }
                    line_result = "";

                    }

                }

            }
        }
        public static void main(String[] args){
            String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task6";
            String file_result = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task6Result.txt";
            try {
                task6(file, file_result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



