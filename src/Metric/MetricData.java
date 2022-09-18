package Metric;

import Device.Device;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.concurrent.*;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class MetricData {
    public Metric metric;
    public Year year;
    public Month month;
    public LocalDate date;
    public Timestamp timestamp;
    public double metric_value;
    Device device;

    public void addMetricData(Metric metric, double metric_value, Device device){
        this.metric = metric;
        this.metric_value = metric_value;
        this.year = Year.now();
        this.month = MonthDay.now().getMonth();
        this.date = LocalDate.now();
        this.device = device;
        this.timestamp = new Timestamp(System.currentTimeMillis());

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            double dailyMetricValue = getDailyMetricData( metric, date, device );
            LocalDate startDate = LocalDate.now().with(
                            TemporalAdjusters.previous( DayOfWeek.SUNDAY ));
            double WeeklyMetricValue = getWeeklyMetricData( metric, startDate, date, device );
            DailyMetric d = new DailyMetric(metric, date, device, dailyMetricValue);
            WeeklyMetric w = new WeeklyMetric(metric, startDate, date, device, WeeklyMetricValue);
        });

    }

    public double getDailyMetricData( Metric metric, LocalDate date, Device device){
        double dailyMetricValue=0.01;
        db.read(); // Read db for a particular date
        return dailyMetricValue;
    }

    public double getWeeklyMetricData( Metric metric, LocalDate startDate, LocalDate endDate, Device device){
        double weeklyMetricValue=0.01;
        db.read(); // Read db for a particular raneg of dates
        return weeklyMetricValue;
    }

}
