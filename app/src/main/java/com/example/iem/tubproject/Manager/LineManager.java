package com.example.iem.tubproject.Manager;

/**
 * Created by iem on 03/02/2017.
 */

import android.content.Context;

import java.util.List;

import com.example.iem.tubproject.Models.Line;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineManager {

    private static LineManager sInstance;

    public static synchronized LineManager getInstance(Context context){
        if(sInstance == null){
            sInstance = new LineManager(context);
        }
        return sInstance;
    }

    public LineManager(Context context) {

    }


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