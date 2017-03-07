package com.example.iem.tubproject.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by iem on 07/03/2017.
 */

public class CalculatedPath {
    @SerializedName("startStop")
    @Expose
    private String idStopStart;
    @SerializedName("endStop")
    @Expose
    private String idStopFinish;
    @SerializedName("idLine")
    @Expose
    private String idLine;
    @SerializedName("timeStartPass")
    @Expose
    private String timeStart;

    @SerializedName("timeEndPass")
    @Expose
    private String timeFinish;

    public String getIdStopStart() {
        return idStopStart;
    }

    public void setIdStopStart(String idStopStart) {
        this.idStopStart = idStopStart;
    }

    public String getIdStopFinish() {
        return idStopFinish;
    }

    public void setIdStopFinish(String idStop) {
        this.idStopFinish = idStop;
    }

    public String getIdLine() {
        return idLine;
    }

    public void setIdLine(String idStop) {
        this.idLine = idStop;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(String timeFinish) {
        this.timeFinish = timeFinish;
    }

}
