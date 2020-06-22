package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
        @SerializedName("tmp")
        public String temperature;  // 当前温度
        @SerializedName("cond")
        public More more;   // 更多信息
        public class More{
            @SerializedName("txt")
            public String info; // 天气信息

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }
}