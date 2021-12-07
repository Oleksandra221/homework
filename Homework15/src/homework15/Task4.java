package homework15;

import java.io.*;

public class Task4 {

    public static void task4(String file, String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);

        if (f.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line;
                String line_result = "";
                while ((line=bufferedReader.readLine())!=null) {
                    String[] arr = line.split(" ");
                    for (String word : arr){
                        if (word.length()>2){
                            line_result += word.toUpperCase() + " ";

                        }
                    }

                    bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                    line_result = "";
                }
            }
        }

    }
    public static void main(String[] args){
        String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Taks4.txt";
        String file_result = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task4Result.txt";
        try {
            task4(file, file_result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
