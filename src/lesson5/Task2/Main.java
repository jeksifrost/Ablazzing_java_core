package lesson5.Task2;

import lesson5.Homework3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        StringBuilder s = new StringBuilder();
        Path resource = Paths.get("resource");
        String fileName = "my_first_file.txt";
        String filePath = Paths.get(resource.toString(), fileName).toString();

        String path = Homework3.class.getClassLoader().getResource("").getPath();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while (reader.ready()) {
                s.append(reader.readLine()).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println(path);
    }
}
