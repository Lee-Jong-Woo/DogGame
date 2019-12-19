package com.example.doggame;

public class Jeje extends Dog{

    String name = "제제";
    @Override
    public String Name(){
        String result = super.Name() + name;
        return result;
    }

    @Override
    public String Bark(){
        String result = name + super.Bark() + "왕왕";
        return result;
    }

    @Override
    public String Run(){
        String result = name + super.Run() + "우다다다다다다";
        return result;
    }
}

