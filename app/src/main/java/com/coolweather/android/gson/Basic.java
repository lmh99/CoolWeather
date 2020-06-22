package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
        @SerializedName("city")
        public String cityName;     // 城市名
        @SerializedName("id")
        public String weatherId;    // 天气编号
        public Update update;   // 更新状态类
        public class Update{
            @SerializedName("loc")
            public String updateTime;   // 更新时间

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }
        }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }
}