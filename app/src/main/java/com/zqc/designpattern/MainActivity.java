package com.zqc.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zqc.designpattern.ObservablePattern.Coder;
import com.zqc.designpattern.ObservablePattern.DevTechFrontier;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    HashMap  map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        Coder coder01 = new Coder("11111");
        Coder coder02 = new Coder("2222222");
        Coder coder03 = new Coder("3333333");
        devTechFrontier.addObserver(coder01);
        devTechFrontier.addObserver(coder02);
        devTechFrontier.addObserver(coder03);
        devTechFrontier.post(" 上线发布新产品");
boolean
        String  a="abcacbb";
        for (int i = 0; i < a.length(); i++) {
            Log.e("=========",a.charAt(i)+"    "+i);
        }


    }
}
