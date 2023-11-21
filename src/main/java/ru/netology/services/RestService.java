package ru.netology.services;
public class RestService {
    public int restCalc (int income, int expenses, int threshold) {
        int balance = 0;
        int count = 0; // Счетчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if (balance < threshold) {
                balance = balance + income - expenses;
            } else {
                count++;
                balance = (balance - expenses) / 3;
            }
        }
        return count;
    }
}
