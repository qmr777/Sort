package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/9/12.
 *
 */
public class DoorHandler implements InvocationHandler {

    private Object door;
/*
    public DoorHandler(Door door){
        this.door = door;
    }*/

    public Object newProxyInstance(Object targetObj){
        this.door = targetObj;
        return Proxy.newProxyInstance(door.getClass().getClassLoader(),door.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先于门报警");
        System.out.println(method.getName() +" "+ method.getDeclaringClass());
        Object o = method.invoke(door,args);
        System.out.println("执行后");
        return o;
    }
}
