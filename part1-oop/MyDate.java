package org.example;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static final int[] DAY_IN_MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }

        int maxDay = DAY_IN_MONTHS[month];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] monthAdjust = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year -= 1;
        }
        int dayOfWeek = (year + year / 4 - year / 100 + year / 400 + monthAdjust[month - 1] + day) % 7;
        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else {
            System.out.println("错误！");
        }
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else {
            System.out.println("错误！");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("错误！");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("错误！");
        }
    }

    public void setDay(int day) {
        int maxDay = DAY_IN_MONTHS[month];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        if (day >= 1 && day <= maxDay) {
            this.day = day;
        } else {
            System.out.println("错误！");
        }
    }

    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month] + " " + year;
    }

    public MyDate nextDay() {
        day ++ ;
        if (day > DAY_IN_MONTHS[month] || (month == 2 && isLeapYear(year) && day > 29)) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month ++ ;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        year ++ ;
        if (year > 9999) {
            System.out.println("错误！");
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();
            day = DAY_IN_MONTHS[month];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        month -- ;
        if (month < 1) {
            month = 12;
            previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (year < 1) {
            System.out.println("错误！");
        }
        return this;
    }
}
