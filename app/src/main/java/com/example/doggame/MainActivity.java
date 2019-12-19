package com.example.doggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_jeje;
    Button button_nuri;
    Button button_siru;
    Button button_function;
    Dog dog = new Dog();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_jeje=(Button) findViewById(R.id.jeje);
        button_nuri =(Button) findViewById(R.id.nuri);
        button_siru =(Button) findViewById(R.id.siru);
        button_function =(Button) findViewById(R.id.function);

        button_jeje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dog = new Jeje();
                if(button_function.getText().equals("짖기")){
                    button_jeje.setText(dog.Bark());
                }
                else if(button_function.getText().equals("달리기")){
                    button_jeje.setText(dog.Run());
                }
                else if(button_function.getText().equals("이름")){
                    button_jeje.setText(dog.Name());
                }
            }
        });
        button_nuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dog = new Nuri();
                if(button_function.getText().equals("짖기")){
                    button_nuri.setText(dog.Bark());
                }
                else if(button_function.getText().equals("달리기")){
                    button_nuri.setText(dog.Run());
                }
                else if(button_function.getText().equals("이름")){
                    button_nuri.setText(dog.Name());
                }
            }
        });
        button_siru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dog = new Siru();
                if(button_function.getText().equals("짖기")){
                    button_siru.setText(dog.Bark());
                }
                else if(button_function.getText().equals("달리기")){
                    button_siru.setText(dog.Run());
                }
                else if(button_function.getText().equals("이름")){
                    button_siru.setText(dog.Name());
                }
            }
        });
        button_function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(button_function.getText().equals("짖기")){
                    button_function.setText("달리기");
                }
                else if(button_function.getText().equals("달리기")){
                    button_function.setText("이름");
                }
                else if(button_function.getText().equals("이름")){
                    button_function.setText("짖기");
                }
            }
        });
    }
}