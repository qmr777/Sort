package com.company;

/**
 * Created by Administrator on 2016/9/9.
 */
public class Door implements Alarm , BuyTicket {

    private Door(){
        System.out.println("new");
    }

    private static Door door;

    static {
        door = new Door();
    }

    public static Door getInstance(){
        return door;
    }

    {
        System.out.println("基本法");
    }

    @Override
    public String alarm(String alarmStr) {
        System.out.println("门的实现 " + alarmStr);
        return null;
    }

    @Override
    public String buyTicket(String name) {
        System.out.println(getClass().getSimpleName() + " " + name + " buyTicket");
        return null;
    }
}
