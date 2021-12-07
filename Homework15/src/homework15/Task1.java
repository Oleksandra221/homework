package homework15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task1 {

    public static void fileWithRandomValues(int amountOfNumbers, int boundOfRandomizing, Path randomNumPath) {
        List<String> randomNum = getRandomStringListOfNum(amountOfNumbers, boundOfRandomizing);

        try {
            Files.write(randomNumPath, randomNum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> getRandomStringListOfNum(int amountOfNumbers, int boundOfRandomizing) {
        Random random = new Random();
        List<String> randomNum = new ArrayList<>(amountOfNumbers);
        for (int i = 0; i < amountOfNumbers; i++) {
            randomNum.add(String.valueOf(random.nextInt(boundOfRandomizing)));
        }
        return randomNum;
    }

    public static void getSortedNum(Path randomNumbersPath, Path outputPathForSortedNum) {
        try {
            List<String> listOfNumbers = Files.readAllLines(randomNumbersPath);
            listOfNumbers.sort(Comparator.comparing(Integer::valueOf));
            Files.write(outputPathForSortedNum, listOfNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Path file = Path.of("C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\file.txt");
        Path sorted_file = Path.of("C:\\Users\\Yulia\\IdeaProjects\\Homework15\\src\\homework15\\sorted_file.txt");
        fileWithRandomValues(10, 100, file);
        getSortedNum(file, sorted_file);
    }
}
