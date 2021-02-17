package com.example.helloworldassignmenbirkanak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button epilepsyButton;
    View bg;
    Switch phrogswitch;
    ImageView phrogimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText=(TextView)findViewById(R.id.hello_text);
        epilepsyButton=(Button)findViewById(R.id.epilepsy_button);
        bg=(View)findViewById(R.id.rView);
        phrogswitch=(Switch)findViewById(R.id.phrogswitch);
        phrogimg=(ImageView)findViewById(R.id.phrogimg);
        phrogswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    phrogimg.setVisibility(View.VISIBLE);

                }
                else{
                    phrogimg.setVisibility(View.INVISIBLE);
                    AlertDialog phrogdialog = new AlertDialog.Builder(MainActivity.this).create();
                    phrogdialog.setTitle("Phrog Dead");
                    phrogdialog.setMessage("Damn you really killed phrog");
                    phrogdialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Pls bring him back",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    phrogdialog.show();
                }
            }
        });
    }


    public void onEpilepsyClick(View view){
        Random rn = new Random();
        int randomNum =  rn.nextInt(68) + 1;
        helloText.setTextSize(randomNum);
        helloText.setTextColor(Color.rgb(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
        bg.setBackgroundColor(Color.rgb(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
        epilepsyButton.setBackgroundColor(Color.rgb(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
        epilepsyButton.setTextColor(Color.rgb(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
        phrogswitch.setTextColor(Color.rgb(rn.nextInt(256),rn.nextInt(256),rn.nextInt(256)));
    }
}
