package Metric;

import Device.Device;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CompletableFuture;

public class WeeklyMetric {
    private Metric metric;
    private LocalDate startDate;
    private LocalDate endDate;
    private double metric_value;
    Device device;

    public WeeklyMetric(Metric metric, LocalDate startDate, LocalDate endDate, Device device, double metric_value){
        this.startDate = startDate;
        this.endDate = endDate;
        this.metric = metric;
        this.metric_value = metric_value;
        this.device = device;
    }

}

