package com.example.hellowizz.bugs;

import android.content.ClipData;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Exercice_1 extends AppCompatActivity {

    ImageView m_endToPeeButton;
    ImageView m_wipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_1);
        getSupportActionBar().hide(); // hide the default bar

            // to get the width and the height of the app
        int width = this.getResources().getDisplayMetrics().widthPixels;
        int height = this.getResources().getDisplayMetrics().heightPixels;


            // Put the elements in the desired locations
        m_endToPeeButton = findViewById(R.id.image_endToPee);
        m_endToPeeButton.setY(750);
        m_endToPeeButton.setX(width/10);

        m_wipeButton = findViewById(R.id.image_wipe);
        m_wipeButton.setY(750);
        Log.i("button wipe width", ""+ m_wipeButton.getLayoutParams().width);
        m_wipeButton.setX(width - width/10 - m_wipeButton.getLayoutParams().width);

    }
}
