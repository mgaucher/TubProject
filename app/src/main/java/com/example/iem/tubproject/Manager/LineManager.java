package com.example.iem.tubproject.Manager;

/**
 * Created by iem on 03/02/2017.
 */

import java.util.List;

import com.example.iem.tubproject.Pojo.Line;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineManager {

    @SerializedName("line")
    @Expose
    private List<Line> line = null;

    public List<Line> getLine() {
        return line;
    }

    public void setLine(List<Line> line) {
        this.line = line;
    }

}