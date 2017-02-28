package com.example.iem.tubproject.Manager;

import com.example.iem.tubproject.Models.Stop;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by iem on 03/02/2017.
 */

public class StopManager {

    @SerializedName("stops")
    @Expose
    private List<Stop> stops = null;

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }
}