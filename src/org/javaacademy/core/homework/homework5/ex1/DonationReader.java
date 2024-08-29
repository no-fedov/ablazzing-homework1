package org.javaacademy.core.homework.homework5.ex1;

import org.javaacademy.core.homework.homework5.Runner;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;


public class DonationReader {
    private Scanner scanner;
    private final Pattern pattern = Pattern.compile("^\\d*,\\d*$");
    private final BigDecimal[] donates = new BigDecimal[Country.values().length];

    public DonationReader(String filename) {
        setFile(filename);
    }

    public void setFile(String filename) {
        initDonateArray();
        this.scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
    }

    public void presentDonation() {
        try {
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] columns = line.split(";");
                calculateDonation(columns);
            }
        } catch (Throwable e) {
            System.out.println("Произошла ошибка");
        } finally {
            scanner.close();
        }
        printDonates();
    }

    /**
     * Инициализирует массив донатов
     */
    private void initDonateArray() {
        for (int i = 0; i < donates.length; i++) {
            donates[i] = BigDecimal.ZERO;
        }
    }

    /**
     * Рачиститывает донаты из каждой страны и сохраняет в массив
     */
    private void calculateDonation(String[] columns) {
        int counter = 0;

        if (pattern.matcher(columns[1]).find()) {
            String number = columns[1].replaceAll(",", ".");
            for (Country country : Country.values()) {
                if (country.getCountryName().equals(columns[0])) {
                    donates[counter] = donates[counter].add(new BigDecimal(number));
                }
                counter++;
            }
        }
    }

    private void printDonates() {
        for (Country country : Country.values()) {
            System.out.printf("%s - %s\n", country.getCountryName(), donates[country.ordinal()]);
        }
    }
}
