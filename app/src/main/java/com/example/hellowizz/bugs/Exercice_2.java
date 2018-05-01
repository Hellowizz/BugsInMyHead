package com.example.hellowizz.bugs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Exercice_2 extends AppCompatActivity {

    ImageView m_button_soluce1;
    ImageView m_button_soluce2;
    ImageView m_button_soluce3;
    ImageView m_button_help;
    ImageView m_imageChris;
    TextView m_textDialog;
    TextView m_textAlgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_2);
        getSupportActionBar().hide(); // hide the default bar

        m_button_soluce1 = findViewById(R.id.image_soluce1);
        m_button_soluce2 = findViewById(R.id.image_soluce2);
        m_button_soluce3 = findViewById(R.id.image_soluce3);
        m_button_help = findViewById(R.id.image_help);
        m_imageChris = findViewById(R.id.imageChris);
        m_textDialog = findViewById(R.id.textDialog);
        m_textAlgo = findViewById(R.id.textAlgo);

        m_button_soluce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textAlgo.setText("For i in plate -> eat(i)");
                m_textDialog.setText("When I have a thing in the plate... I have to eat it!\nOkay I understand better now, this meal is delicious.");
                new Handler().postDelayed(new Runnable() {
                    @Override public void run() {finish();}
                }, 1500L);
            }
        });

        m_button_soluce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_3);
                m_textAlgo.setText("For plate in i -> eat(i)");
                m_textDialog.setText("What?\nI'm not sure that you're understanding what you\'re doing!\nI won\'t eat the table!");
            }
        });

        m_button_soluce3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_1);
                m_textAlgo.setText("For i in i -> eat(plate[i])");
                m_textDialog.setText("For i in i?\nIt\'s like if you were asking me to take my phone in my phone, what a nonsense...");
            }
        });

        m_button_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_imageChris.setImageResource(R.drawable.chibi_2);
                m_textDialog.setText("You need some help?\nKay\' if I remember well, you can call a variable i to range in something else, maybe it could help.");
            }
        });
    }
}
