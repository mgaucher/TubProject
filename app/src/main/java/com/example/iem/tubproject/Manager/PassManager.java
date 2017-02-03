package com.example.iem.tubproject.Manager;

import java.util.List;

import com.example.iem.tubproject.Pojo.Pass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PassManager {

    @SerializedName("pass")
    @Expose
    private List<Pass> pass = null;

    public List<Pass> getPass() {
        return pass;
    }

    public void setPass(List<Pass> pass) {
        this.pass = pass;
    }
}