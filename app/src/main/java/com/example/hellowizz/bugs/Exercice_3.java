package com.example.hellowizz.bugs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Exercice_3 extends AppCompatActivity {

    Button m_buttonInferior;
    Button m_buttonInferiorEqual;
    Button m_buttonEqual;
    ImageView m_imageChris;
    TextView m_textDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_3);
        getSupportActionBar().hide(); // hide the default bar

        m_buttonInferior = findViewById(R.id.button_inferior);
        m_buttonInferiorEqual = findViewById(R.id.button_inferiorEqual);
        m_buttonEqual = findViewById(R.id.button_equal);
        m_imageChris = findViewById(R.id.imageChris);
        m_textDialog = findViewById(R.id.textview);

        m_buttonInferior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_textDialog.setText("Oh thanks! My energy went up to 99%, but that's not perfect, I need one more percent.");
                m_imageChris.setImageResource(R.drawable.chibi_2);
            }
        });

        m_buttonInferiorEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textDialog.setText("Oh thanks! My energy is now at 100%, I feel so full and vigorous!");
                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        finish();
                    }

                }, 1500L);
            }
        });

        m_buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_3);
                m_textDialog.setText("... My sleeping function never launched, what the hell have you done?!");
            }
        });
    }
}
