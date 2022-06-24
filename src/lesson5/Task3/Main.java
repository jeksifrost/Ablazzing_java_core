package lesson5.Task3;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sbWriter = new StringBuilder();
        String s = "";
        int sumIncomes = 0;
        int sumOutcomes = 0;
        int incomes, outcomes;
        for (int i = 0; i < 10; i++) {
            incomes = new Random().nextInt(10000) + 1;
            outcomes = new Random().nextInt(10000) + 1;
            FinancialRecord record = new FinancialRecord(incomes, outcomes);
            s = "доходы = " + record.getIncomes() + " расходы = " + record.getOutcomes() + "\n";
            sbWriter.append(s);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resource\\report.txt"))) {
            writer.write(String.valueOf(sbWriter));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("resource\\report.txt"))) {
            while (reader.ready()) {
                String[] splited = reader.readLine().split(" ");
                sumIncomes += Integer.parseInt(splited[2]);
                sumOutcomes += Integer.parseInt(splited[5]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("общие доходы - " + sumIncomes + ", общие расходы - " + sumOutcomes);
    }
}
