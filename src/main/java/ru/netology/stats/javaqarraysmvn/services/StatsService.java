package ru.netology.stats.javaqarraysmvn.services;

public class StatsService {

    // 1. Подсчёт суммы всех продаж.

    public long allMoneyEarned(long[] sales) {
        long allMoneyEarned = 0; // переменная для всех заработанных денег
        for (int i = 0; i < sales.length; i++) {
            allMoneyEarned = allMoneyEarned + sales[i];

        }
        return allMoneyEarned;

    }

    // 2 Расчёт средней суммы продаж в месяц.

    public long moneyMonthAverage(long[] sales) {
        long allMoneyEarned = allMoneyEarned(sales);
        long moneyMonthAverage = allMoneyEarned / sales.length;

        return moneyMonthAverage;
    }

    // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    // Примечание: в вашем задании нужно найти последний месяц, соответствующий условиям.

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // 4. Вычисление номера месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.
    // Примечание: в вашем задании нужно найти последний месяц, соответствующий условиям.

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Расчёт количества месяцев, в которых продажи были ниже среднего.

    public int monthUnderAverage(long[] sales) {
        long moneyMonthAverage = moneyMonthAverage(sales);
        int monthUnderAverage = 0; // количество месяцев, где догод меньше среднего.
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale < moneyMonthAverage) {
                monthUnderAverage = monthUnderAverage + 1;
            }

        }
        return monthUnderAverage;

    }


    // 6. Расчёт количества месяцев, в которых продажи были выше среднего

    public int monthOverAverage(long[] sales) {
        long moneyMonthAverage = moneyMonthAverage(sales);
        int monthOverAverage = 0; // количество месяцев, где догод меньше среднего.
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale > moneyMonthAverage) {
                monthOverAverage = monthOverAverage + 1;

            }
        }
                return monthOverAverage;

    }

}
