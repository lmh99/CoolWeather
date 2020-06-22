package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
        public String date; // 预报日期
        @SerializedName("tmp")
        public Temperature temperature; // 预报气温
        @SerializedName("cond")
        public More more;   // 更多信息
        public class Temperature{
            public String max;  //最高温
            public String min;  // 最低温

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }
        }
        public class More{
            @SerializedName("txt_d")
            public String info; // 预测的天气信息

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }
}