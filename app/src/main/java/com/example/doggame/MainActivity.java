package com.example.doggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, DogListener {
    private Button[] button_dog = new Button[4];
    private int[] buttonId = {R.id.btn_jeje, R.id.btn_nuri, R.id.btn_siru, R.id.btn_function};
    private Dog[] dog = {new Jeje(), new Nuri(), new Siru()};
    private int location = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i = 0; i<4; i++){
            button_dog[i] = (Button) findViewById(buttonId[i]);
            button_dog[i].setOnClickListener(this);
        }
        for(int i = 0; i<3; i++){
            dog[i].onDogListener(this);
        }
    }

    @Override
    public void onClick(View v) {

        if((v.getId() == R.id.btn_jeje)||(v.getId()==R.id.btn_nuri)||(v.getId()==R.id.btn_siru)) {
            switch (v.getId()) {
                case R.id.btn_jeje:
                    location = 0;
                    break;
                case R.id.btn_nuri:
                    location = 1;
                    break;
                case R.id.btn_siru:
                    location = 2;
                    break;
                default:
                    break;
            }
            dog[location].Bark();
            dog[location].Run();
            dog[location].Name();
        }
        else if(v.getId() == R.id.btn_function) {
            if (button_dog[3].getText().equals("짖기")) {
                button_dog[3].setText("달리기");
            } else if (button_dog[3].getText().equals("달리기")) {
                button_dog[3].setText("이름");
            } else if (button_dog[3].getText().equals("이름")) {
                button_dog[3].setText("짖기");
            }
        }
    }

    @Override
    public void onBark(String bark) {
        if(button_dog[3].getText().equals("짖기")){
            button_dog[location].setText(dog[location].bark);
        }
    }
    @Override
    public void onName(String name) {
        if(button_dog[3].getText().equals("이름")){
            button_dog[location].setText(dog[location].name);
        }
    }
    @Override
    public void onRun(String run) {
        if(button_dog[3].getText().equals("달리기")){
            button_dog[location].setText(dog[location].run);
        }
    }
}