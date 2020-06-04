package com.zqc.designpattern.factorymethod;

public abstract class IOHandler {

    public abstract void add(String id,String name);

    public abstract void remove();

    public abstract void update(String id,String name);

    public abstract  String  query(String id);

}

