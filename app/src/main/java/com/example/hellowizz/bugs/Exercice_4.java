package com.example.hellowizz.bugs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Exercice_4 extends AppCompatActivity {

    ImageView m_buttonSoluce1;
    ImageView m_buttonSoluce2;
    ImageView m_buttonSoluce3;
    ImageView m_buttonSoluce4;
    ImageView m_imageChris;
    TextView m_textDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_4);
        getSupportActionBar().hide(); // hide the default bar

        m_buttonSoluce1 = findViewById(R.id.image_soluce1);
        m_buttonSoluce2 = findViewById(R.id.image_soluce2);
        m_buttonSoluce3 = findViewById(R.id.image_soluce3);
        m_buttonSoluce4 = findViewById(R.id.image_soluce4);
        m_imageChris = findViewById(R.id.imageChris);
        m_textDialog = findViewById(R.id.textDialog);

        m_buttonSoluce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textDialog.setText("Ok... I'll go and see how it goes.");
                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        m_textDialog.setText("Cool! Dirt is at 0, I'm all clean thank you~");

                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                finish();
                            }

                        }, 1500L);
                    }

                }, 1500L);
            }
        });

        m_buttonSoluce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textDialog.setText("Ok... I'll go and see how it goes.");
                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        m_imageChris.setImageResource(R.drawable.chibi_1);
                        m_textDialog.setText("Hmmm... Not fine, my dirt is not a global variable, I need to set it at 0 after washing I guess...");
                    }

                }, 1500L);
            }
        });

        m_buttonSoluce3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textDialog.setText("Ok... I'll go and see how it goes.");
                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        m_imageChris.setImageResource(R.drawable.chibi_1);
                        m_textDialog.setText("Hmmm... Not fine, my dirt is not a global variable, I need to set it at 0 after washing I guess...");
                    }

                }, 1500L);
            }
        });

        m_buttonSoluce4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textDialog.setText("Ok... I'll go and see how it goes.");
                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        m_imageChris.setImageResource(R.drawable.chibi_1);
                        m_textDialog.setText("Hmmm... Not fine, my dirt is not a global variable, I need to set it at 0 after washing I guess...");
                    }

                }, 1500L);
            }
        });
    }
}
