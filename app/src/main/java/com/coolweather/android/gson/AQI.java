package com.coolweather.android.gson;

public class AQI {
        public AQICity city;    // 城市
        public class AQICity{
            public String aqi;  // 空气质量指数
            public String pm25; // pm2.5浓度

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }
        }

    public AQICity getCity() {
        return city;
    }

    public void setCity(AQICity city) {
        this.city = city;
    }
}