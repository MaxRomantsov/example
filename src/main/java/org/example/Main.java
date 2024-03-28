package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int MAX_NUMBER = 10;
    private static final int NUM_QUESTIONS = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctAnswers = 0;
        int wrongAnswers = 0;

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;

            System.out.printf("%d * %d = ", num1, num2);
            int answer = scanner.nextInt();

            if (answer == num1 * num2) {
                correctAnswers++;
            } else {
                wrongAnswers++;
            }
        }

        System.out.println();
        System.out.println("Кількість правильних відповідей: " + correctAnswers);
        System.out.println("Кількість неправильних відповідей: " + wrongAnswers);

        int grade = (int) Math.round(correctAnswers * 12.0 / NUM_QUESTIONS);
        System.out.println("Оцінка: " + grade);
    }
}
