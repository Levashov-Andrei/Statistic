package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void totalofallsales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма всех продаж " + actual);
    }

    @Test
    public void averageamountpermonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averagesales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц " + actual);

    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSalesmonth(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц с максимальными продажами  " + actual);

    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesmonth(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц с минимальными продажами  " + actual);

    }

    @Test
    public void numberofMonthsWithBelowAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberofMonthsWithBelowAverageSale(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего  " + actual);

    }

    @Test
    public void numberOfMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberOfMonthsWithAboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + actual);

    }

}
