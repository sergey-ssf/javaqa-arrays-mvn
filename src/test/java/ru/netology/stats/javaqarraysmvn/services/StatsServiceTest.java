package ru.netology.stats.javaqarraysmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // 1. allMoneyEarned

    @Test
    public void allMoneyEarnedTest() {
        StatsService service = new StatsService();

        long[] earned = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAllMoney = 180;
        long actualAllMoney = service.allMoneyEarned(earned);

        Assertions.assertEquals(expectedAllMoney, actualAllMoney);
    }

    // 2. moneyMonthAverage

    @Test
    public void moneyMonthAverageTest() {
        StatsService service = new StatsService();

        long[] earned = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthAverage = 15;
        long actualMonthAverage = service.moneyMonthAverage(earned);

        Assertions.assertEquals(expectedMonthAverage, actualMonthAverage);

    }

    // 3. maxSales — Номер (последнего) месяца, в котором был пик продаж

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        long[] earned = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSalesMonth = 8;
        long actualMaxSalesMonth = service.maxSales(earned);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);

    }


    // 4. minSales — Номер (последнего) месяца, в котором был минимум продаж

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        long[] earned = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSalesMonth = 9;
        long actualMinSalesMonth = service.minSales(earned);

        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);

    }

    // 5. monthUnderAverage — Количество месяцев, в которых продажи были ниже среднего

    @Test
    public void monthUnderAverage() {
        StatsService service = new StatsService();

        long[] earned = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthUnderAverage = 5;
        long actualMonthUnderAverage = service.monthUnderAverage(earned);

        Assertions.assertEquals(expectedMonthUnderAverage, actualMonthUnderAverage);

    }

    // 6. monthOverAverage — Количество месяцев, в которых продажи были выше среднего

    @Test
    public void monthOverAverage() {
        StatsService service = new StatsService();

        long[] earned = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthOverAverage = 5;
        long actualMonthOverAverage = service.monthOverAverage(earned);

        Assertions.assertEquals(expectedMonthOverAverage, actualMonthOverAverage);

    }

}
