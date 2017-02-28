package com.example.iem.tubproject.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pass {

    @SerializedName("idStop")
    @Expose
    private String idStop;
    @SerializedName("idPass")
    @Expose
    private String idPass;
    @SerializedName("numLine")
    @Expose
    private String numLine;
    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("previousPass")
    @Expose
    private String previousPass;
    @SerializedName("nextPass")
    @Expose
    private String nextPass;

    public String getIdStop() {
        return idStop;
    }

    public void setIdStop(String idStop) {
        this.idStop = idStop;
    }

    public String getIdPass() {
        return idPass;
    }

    public void setIdPass(String idPass) {
        this.idPass = idPass;
    }

    public String getNumLine() {
        return numLine;
    }

    public void setNumLine(String numLine) {
        this.numLine = numLine;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPreviousPass() {
        return previousPass;
    }

    public void setPreviousPass(String previousPass) {
        this.previousPass = previousPass;
    }

    public String getNextPass() {
        return nextPass;
    }

    public void setNextPass(String nextPass) {
        this.nextPass = nextPass;
    }
}
