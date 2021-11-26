package com.jano;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file1 = new File("/Users/janokularczyk/IdeaProjects/readingFiles/dataset_91033.txt");
        File file2 = new File("/Users/janokularczyk/IdeaProjects/readingFiles/dataset_91007.txt");
        File file3 = new File("/Users/janokularczyk/IdeaProjects/readingFiles/dataset_91022.txt");


        System.out.print(file1.getName() + "\\sum\\");
        sumNumbers(file1);

        System.out.print(file2.getName() + "\\greatest\\");
        greatestNumber(file2);

        System.out.print(file3.getName() + "\\sum>=9999\\");
        countNumbers(file3);


    }

    public static void sumNumbers(File file) {
        int sum = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file);
        }
        System.out.println(sum);
    }

    public static void greatestNumber(File file) {
        int num = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (num <= scanner.nextInt()) {
                    num = scanner.nextInt();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file);
        }
        System.out.println(num);
    }

    public static void countNumbers(File file) {
        int counter = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int temp = scanner.nextInt();
                if (temp >= 9999) {
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file);
        }
        System.out.println(counter);
    }
}