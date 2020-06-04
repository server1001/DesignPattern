package com.zqc.designpattern.factorymethod;

public class IOFactory {


    /**
     *
     * @param clz  类类型
     * @param <T>
     * @return  IOHandler 对象
     */
    public static <T extends  IOHandler> T getIOHandler(Class<T> clz){
        IOHandler ioHandler=null;
        try {
            ioHandler= (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) ioHandler;
    }
}
