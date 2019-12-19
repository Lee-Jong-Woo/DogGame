package com.example.doggame;

public class Dog {
    private DogListener dogListener = null;
    public String name, bark, run;
    public void Move(){
    }

    public void Name(){
        dogListener.onName(name);
    }

    public void Bark(){
        dogListener.onBark(bark);
    }

    public void Run(){
        dogListener.onRun(run);
    }

    public void onDogListener(DogListener listener){
        this.dogListener = listener;
    }
}


