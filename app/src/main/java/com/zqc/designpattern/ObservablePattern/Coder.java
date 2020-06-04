package com.zqc.designpattern.ObservablePattern;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

    private String name;



    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        Log.e("=========",""+name+"    更新了 ，内容      "+o);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
