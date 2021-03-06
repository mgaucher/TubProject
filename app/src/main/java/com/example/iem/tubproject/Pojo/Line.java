package com.example.iem.tubproject.Pojo;


import com.example.iem.tubproject.Manager.LineManager;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Line {

    @SerializedName("idStop")
    @Expose
    private String idStop;
    @SerializedName("idLine")
    @Expose
    private String idLine;
    @SerializedName("numLine")
    @Expose
    private String numLine;
    @SerializedName("nameLine")
    @Expose
    private String nameLine;

    public String getIdStop() {
        return idStop;
    }

    public void setIdStop(String idStop) {
        this.idStop = idStop;
    }

    public String getIdLine() {
        return idLine;
    }

    public void setIdLine(String idLine) {
        this.idLine = idLine;
    }

    public String getNumLine() {
        return numLine;
    }

    public void setNumLine(String numLine) {
        this.numLine = numLine;
    }

    public String getNameLine() {
        return nameLine;
    }

    public void setNameLine(String nameLine) {
        this.nameLine = nameLine;
    }
}