package com.example.hellowizz.bugs;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Exercices extends AppCompatActivity {

    private Button m_buttonExo1;
    private Button m_buttonExo2;
    private Button m_buttonExo3;
    private Button m_buttonExo4;
    private Button m_buttonNewGame;

    int m_nextLevel;
    private SharedPreferences m_sharedPreferences;
    public static final String KEY_LEVEL = "KEYLEVEL";
    public static final String GAME_PREFERENCES = "GamePrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercices);
        getSupportActionBar().hide(); // hide the default bar

        m_buttonExo1 = findViewById(R.id.button_exercice1);
        m_buttonExo2 = findViewById(R.id.button_exercice2);
        m_buttonExo3 = findViewById(R.id.button_exercice3);
        m_buttonExo4 = findViewById(R.id.button_exercice4);
        m_buttonNewGame = findViewById(R.id.button_newGame);

            // Les preferences permettent de récupérer les données sauvegardées

        m_sharedPreferences = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE);
        final int nextlevel = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE).getInt(KEY_LEVEL, 0);
        if(nextlevel == 0){
            m_nextLevel=2;  // CHEAT :: Impossible de finir le premier exo
        }
        else m_nextLevel = nextlevel;

        m_buttonExo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exercice1ActivityIntent = new Intent(Exercices.this, Exercice_1.class);
                startActivity(exercice1ActivityIntent);
            }
        });

        m_buttonExo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m_nextLevel == 2)
                {
                    m_nextLevel = 3;
                    m_sharedPreferences.edit().putInt(KEY_LEVEL, m_nextLevel).apply();  //Met à jour les données
                }
                Intent exercice2ActivityIntent = new Intent(Exercices.this, Exercice_2.class);
                startActivity(exercice2ActivityIntent);
            }
        });

        m_buttonExo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m_nextLevel == 3)
                {
                    m_nextLevel = 4;
                    m_sharedPreferences.edit().putInt(KEY_LEVEL, m_nextLevel).apply();
                }
                Intent exercice3ActivityIntent = new Intent(Exercices.this, Exercice_3.class);

                if(m_nextLevel >= 3) startActivity(exercice3ActivityIntent);
                else Toast.makeText(getApplicationContext(), "You need to finish level 2", Toast.LENGTH_SHORT).show();
            }
        });

        m_buttonExo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m_nextLevel == 4)
                {
                    m_nextLevel = 5;
                    m_sharedPreferences.edit().putInt(KEY_LEVEL, m_nextLevel).apply();
                }
                Intent exercice4ActivityIntent = new Intent(Exercices.this, Exercice_4.class);

                if(m_nextLevel >= 4) startActivity(exercice4ActivityIntent);
                else Toast.makeText(getApplicationContext(), "You need to finish level 3", Toast.LENGTH_SHORT).show();
            }
        });

        m_buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_sharedPreferences.edit().clear().apply();
                Intent mainActivityIntent = new Intent(Exercices.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}
