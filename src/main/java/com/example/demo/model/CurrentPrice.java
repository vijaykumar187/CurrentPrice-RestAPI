package com.example.demo.model;

import java.util.Map;

public class CurrentPrice {

    public Time time;
    public String disclaimer;
    public String chartName;
    public Map<String, Details> bpi;

    public CurrentPrice() {
    }

    public CurrentPrice(Time time, String disclaimer, String chartName, Map<String, Details> bpi) {
        this.time = time;
        this.disclaimer = disclaimer;
        this.chartName = chartName;
        this.bpi = bpi;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public Map<String, Details> getBpi() {
        return bpi;
    }

    public void setBpi (Map<String, Details> bpi) {
        this.bpi = bpi;
    }
}
