package com.zqc.designpattern.ObservablePattern;

import java.util.Observable;

public class DevTechFrontier extends Observable {


    public void post(String  content){
        setChanged();
        notifyObservers(content);
    }
}
