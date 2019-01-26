package com.company.lesson8;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class TimeConvert {

    public TimeConvert() {
        this.dateTime = dateTime;
    }

    public TimeConvert(DateTime dateTime) {
        this.dateTime = dateTime;
    }


    private DateTime dateTime = new DateTime();

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public DateTime getDateTime(DateTime dateTime2) {
        return dateTime;
    }

    public String convertTimePoint() {
        return dateTime.toString("dd-MM-YYYY");
    }

    public String convertTimeSlash() {
        return dateTime.toString("dd/MM/YYYY");
    }

    public long getLongOnStartOfDay() {
        return dateTime.getMillis() - dateTime.getMillisOfDay();
    }

    public long getLongOnEndOfDay() {
        return dateTime.plusDays(1).getMillis() - dateTime.getMillisOfDay() - 1;
    }

    public String convertFromLongToString(long dateTimeLong, String pattern) {
        DateTime dt = new DateTime(dateTimeLong);
        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.print(dt);
    }


    public boolean compareTwoDates(DateTime dateTime1, DateTime dateTime2) {
        return dateTime1.getMillis() > dateTime2.getMillis();
    }

    public long compareBeginEndLongDates() {
        long difference = getLongOnEndOfDay() - getLongOnStartOfDay();
        return difference;
    }

    public String getDayOfWeekForLong(long dateTimeLong) {
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        DateTime newDateFromLong = new DateTime(dateTimeLong);
        DateTimeFormatter dtf = DateTimeFormat.forPattern( "e" );
        String dayName = dtf.print(newDateFromLong);
        int day = Integer.parseInt(dayName);
        return days[day];

    }


    public static void main(String[] args) {

        DateTime dateTime1 = new DateTime();
        dateTime1 = DateTime.parse("2019-02-01", DateTimeFormat.forPattern("yyyy-MM-dd"));
        DateTime dateTime2 = new DateTime(1999, 02, 01, 00, 00);

        TimeConvert tm = new TimeConvert(dateTime1);
        TimeConvert tm2 = new TimeConvert();
        tm2.setDateTime(dateTime2);

        System.out.println(tm.getLongOnStartOfDay());
        System.out.println(tm.getLongOnEndOfDay());

        System.out.println(tm.convertTimePoint());
        System.out.println(tm.convertTimeSlash());
        long lo = tm.getLongOnEndOfDay();
        System.out.println(tm.getDayOfWeekForLong(lo));
        System.out.println(tm.compareBeginEndLongDates());
    }
}
