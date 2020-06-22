package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
        @SerializedName("comf")
        public Comfort comfort; // 舒适度
        @SerializedName("cw")
        public CarWash carWash; // 洗车建议
        public Sport sport; // 运动建议
        public class Comfort{
            @SerializedName("txt")
            public String info;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }
        public class CarWash{
            @SerializedName("txt")
            public String info;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }
        public class Sport{
            @SerializedName("txt")
            public String info;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }
        }

    public Comfort getComfort() {
        return comfort;
    }

    public void setComfort(Comfort comfort) {
        this.comfort = comfort;
    }

    public CarWash getCarWash() {
        return carWash;
    }

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}