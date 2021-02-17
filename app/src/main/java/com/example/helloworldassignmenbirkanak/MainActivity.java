package com.example.helloworldassignmenbirkanak;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button epilepsyButton;
    View bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText=(TextView)findViewById(R.id.hello_text);
        epilepsyButton=(Button)findViewById(R.id.epilepsy_button);
        bg=(View)findViewById(R.id.rView);

    }

    public void onEpilepsyClick(View view){
        Random rn = new Random();;
        int randomNum =  rn.nextInt(68) + 1;
        int red =  rn.nextInt(256);
        int green =  rn.nextInt(256);
        int blue =  rn.nextInt(256);
        helloText.setTextSize(randomNum);
        int red1 =  rn.nextInt(256);
        int green1 =  rn.nextInt(256);
        int blue1 =  rn.nextInt(256);
        bg.setBackgroundColor(Color.rgb(red,green,blue));
        epilepsyButton.setBackgroundColor(Color.rgb(red1,green1,blue1));

    }
}
