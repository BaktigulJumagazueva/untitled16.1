package com.company;

public class Animal {

    public String method(){
        String word ="I am animal";
        return word;
    }
    @Override
    public String toString(){
        Class c = getClass();
        return c.toString();
    }
}
