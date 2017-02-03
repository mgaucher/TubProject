package com.example.iem.tubproject.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by iem on 31/01/2017.
 */

public class Stop {

    @SerializedName("idStop")
    @Expose
    private String idStop;
    @SerializedName("nameStop")
    @Expose
    private String nameStop;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public String getIdStop() {
        return idStop;
    }

    public void setIdStop(String idStop) {
        this.idStop = idStop;
    }

    public String getNameStop() {
        return nameStop;
    }

    public void setNameStop(String nameStop) {
        this.nameStop = nameStop;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}