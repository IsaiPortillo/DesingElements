package com.example.desingelements;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    int level;
    boolean res=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.iv);
        level=0;
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(level==0){
                    iv.setImageLevel(1);
                    level=1;
                }else {
                    iv.setImageLevel(0);
                    level=0;
                }
            }
        });
    }

    public void btn_img(View view) {
    }

    public void change(View view) {
        ImageView iv2 = findViewById(R.id.iv2);
        Drawable d = iv2.getDrawable();
        TransitionDrawable td = (TransitionDrawable) d;
        if(res){
            td.startTransition(1000);
            res=false;
        }else td.reverseTransition(1000);

    }

}