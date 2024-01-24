package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes)
            if (income > currentMax) {
                currentMax = income;
            }
        return currentMax;
    }
}
