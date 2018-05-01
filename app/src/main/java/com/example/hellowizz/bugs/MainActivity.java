package com.example.hellowizz.bugs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton m_imgHome;

    int m_nextLevel;
    private SharedPreferences m_sharedPreferences;
    public static final String KEY_LEVEL = "KEYLEVEL";
    public static final String GAME_PREFERENCES = "GamePrefs";

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // hide the default bar

        m_imgHome = findViewById(R.id.image_button_home);
        m_imgHome.setScaleType(ImageView.ScaleType.CENTER_CROP);

        m_sharedPreferences = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE);
        final int m_nextlevel = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE).getInt(KEY_LEVEL, 0);

        m_imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(m_nextlevel == 0){
                    Intent gameActivityIntent = new Intent(MainActivity.this, Story.class);
                    startActivity(gameActivityIntent);
                }
                else if(m_nextlevel >=2){
                    Intent gameActivityIntent = new Intent(MainActivity.this, Exercices.class);
                    startActivity(gameActivityIntent);
                }
            }
        });
    }
}
