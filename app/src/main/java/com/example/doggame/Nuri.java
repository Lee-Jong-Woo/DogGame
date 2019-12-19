package com.example.doggame;

public class Nuri extends Dog{

    String name = "누리";
    @Override
    public String Name(){
        String result = super.Name() + name;
        return result;
    }

    @Override
    public String Bark(){
        String result = name + super.Bark() + "웡웡";
        return result;
    }

    @Override
    public String Run(){
        String result = name + super.Run() + "뒹굴뒹굴";
        return result;
    }
}
