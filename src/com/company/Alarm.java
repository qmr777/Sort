package com.company;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface Alarm {

    String alarmString = "火灾来了";

    String alarm(String alarmStr);

    default void urgentAlarm(){
        System.out.println("虽然我是一个接口，但火灾确实来了");
    }

}
