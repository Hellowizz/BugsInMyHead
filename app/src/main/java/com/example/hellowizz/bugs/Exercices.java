package com.example.hellowizz.bugs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exercices extends AppCompatActivity {

    Button m_buttonExo1;
    Button m_buttonExo2;
    Button m_buttonExo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercices);

        getSupportActionBar().hide(); // hide the default bar

        m_buttonExo1 = findViewById(R.id.button_exercice1);
        m_buttonExo2 = findViewById(R.id.button_exercice2);
        m_buttonExo3 = findViewById(R.id.button_exercice3);

        m_buttonExo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Exercices.this, "Button1 clicked", Toast.LENGTH_LONG).show();

                Intent exercice1ActivityIntent = new Intent(Exercices.this, Exercice_1.class);
                startActivity(exercice1ActivityIntent);
            }
        });
    }
}
