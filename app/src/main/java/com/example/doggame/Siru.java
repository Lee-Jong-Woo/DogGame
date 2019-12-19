package com.example.doggame;

public class Siru extends Dog{

    private String name = "시루";
    @Override
    public void Name(){
        super.name = name;
        super.Name();
    }

    @Override
    public void Bark(){
        super.bark = "왈왈";
        super.Bark();
    }

    @Override
    public void Run(){
        super.run = "썡썡";
        super.Run();
    }
}
