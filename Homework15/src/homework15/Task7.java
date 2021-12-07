package homework15;

import java.io.*;
import java.util.ArrayList;

public class Task7 {
    public static void task7(String file, String result_file) throws IOException {
        File f = new File(file);
        File f_result = new File(result_file);
        String line_result = "";
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count_reps = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        int count = 0;
        if (f.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f_result))) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    String[] words_arr = line.trim().split(" ");
                    for (int i = 0; i < words_arr.length; i++){
                        if (words_arr[i].length() > 3 && words_arr[i].length() < 6) {
                            if (words.isEmpty()) {
                                words.add(words_arr[i]);
                                count_reps.add(count+=1);
                                count = 0;

                            } else if (words.contains(words_arr[i])) {
                                for (int k = 0; k < words.size(); k++) {
                                    if (words.get(k).equals(words_arr[i])) {
                                        int index = k;
                                        int count_changed = count_reps.get(k);
                                        count_reps.set(k, count_changed+=1);
                                    }
                                }
                            } else if (!words.contains(words_arr[i])) {
                                words.add(words_arr[i]);
                                count_reps.add(count+=1);
                                count = 0;
                            }
                        }
                    }
                    /*System.out.print("Words list: ");
                    for (int k = 0; k < words.size(); k++){
                        System.out.print(words.get(k) + " ");
                    }
                    System.out.print("\nCount_reps list: ");
                    for (int k = 0; k < count_reps.size(); k++){
                        System.out.print(count_reps.get(k) + " ");
                    }*/
                    int max = 0;
                    for (int i = 0; i < count_reps.size(); i++){
                        if (count_reps.get(i) % 2 == 0){
                            if (max == 0){
                                max = count_reps.get(i);
                                indexes.add(i);
                            } else if (max < count_reps.get(i)){
                                max = count_reps.get(i);
                                indexes.set(0, max);
                            }
                        }
                    }
                    //System.out.print("\nIndexes list: " + indexes.get(0));
                    String words_to_delete = words.get(indexes.get(0));

                        for (int i = 0; i < words_arr.length; i++){
                            if (words_arr[i].equals(words_to_delete)){
                                words_arr[i] = "";
                                line_result += words_arr[i] + " ";
                            }
                            line_result += words_arr[i] + " ";
                        }
                        bufferedWriter.append(line.replace(line, line_result)).append(System.lineSeparator());
                        line_result="";
                        words.clear();
                        count_reps.clear();
                        indexes.clear();
                }
                }
            }
        }

    public static void main(String[] args){
        String file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task7.txt";
        String result_file = "C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\Task7Result.txt";
        try {
            task7(file, result_file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
