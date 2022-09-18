package Metric;

import Device.Device;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.Calendar;

public class DailyMetric {

    private static DailyMetric instance;
    private Metric metric;
    private LocalDate date;
    private int day;
    private double metric_value;
    private Device device;

    public DailyMetric(Metric metric, LocalDate date, Device device, double metric_value){
        this.date = date;
        this.metric = metric;
        Calendar calender = Calendar.getInstance();
        Date newDate = new Date();
        calender.setTime(newDate);
        this.day = calender.get(Calendar.DAY_OF_WEEK);
        this.metric_value=metric_value;
        this.device = device;
    }



}

