package com.zqc.designpattern.factorymethod;

public class FileHandler extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {

        return "FileHandler";
    }
}
