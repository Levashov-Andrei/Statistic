package ru.netology.stats;

public class StatsService {
    public long totalSales(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    } // Сумма всех продаж

    public long averagesales(long[] sales) {
        long average = 0;
        for (int i = 0; i < sales.length; i++) {
            average = totalSales(sales) / 12;
        }
        return average;
    }// среднюю сумму продаж в месяц

    public long maxSalesmonth(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж мах продажи
                maxMonth = i; // запомним его как максимальное
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long minSalesmonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж мин продажи
                minMonth = i; // запомним его как максимальное
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int numberofMonthsWithBelowAverageSale(long[] sales) {
        int minaverageMonth = 0;
        for (long sale : sales) {
            if (sale < averagesales(sales)) {
                minaverageMonth++;
            }
        }
        return minaverageMonth;
    }

    public long numberOfMonthsWithAboveAverageSales(long[] sales) {
        long minaverageMonth = 0;
        for (long sale : sales) {
            if (sale > averagesales(sales)) {
                minaverageMonth++;
            }
        }
        return minaverageMonth;
    }
}
