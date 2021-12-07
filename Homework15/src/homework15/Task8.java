package homework15;

import java.io.*;

public class Task8 {

    public static void taks8(String file, String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);
        String line_result = "";
        if(f.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line;

                while((line = bufferedReader.readLine())!=null){
                    line_result = line.trim();
                    bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                    line_result="";
                }
            }
        }
    }
    public static void main(String[] args){
        String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task8.txt";
        String result_file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task8Result.txt";
        try {
            taks8(file, result_file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
