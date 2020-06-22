package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
        // 引用其他类
        public String status;   // status数据，成功返回ok
        public Basic basic;
        public AQI aqi;
        public Now now;
        public Suggestion suggestion;
        @SerializedName("daily_forecast")
        public List<Forecast> forecastList;

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public Basic getBasic() {
                return basic;
        }

        public void setBasic(Basic basic) {
                this.basic = basic;
        }

        public AQI getAqi() {
                return aqi;
        }

        public void setAqi(AQI aqi) {
                this.aqi = aqi;
        }

        public Now getNow() {
                return now;
        }

        public void setNow(Now now) {
                this.now = now;
        }

        public Suggestion getSuggestion() {
                return suggestion;
        }

        public void setSuggestion(Suggestion suggestion) {
                this.suggestion = suggestion;
        }

        public List<Forecast> getForecastList() {
                return forecastList;
        }

        public void setForecastList(List<Forecast> forecastList) {
                this.forecastList = forecastList;
        }


    }