package com.example.doggame;

public class Siru extends Dog{

    String name = "시루";
    @Override
    public String Name(){
        String result = super.Name() + name;
        return result;
    }

    @Override
    public String Bark(){
        String result = name + super.Bark() + "왈왈";
        return result;
    }

    @Override
    public String Run(){
        String result = name + super.Run() + "쌩쌩";
        return result;
    }
}
