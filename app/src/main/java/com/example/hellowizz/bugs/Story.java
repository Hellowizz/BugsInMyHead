package com.example.hellowizz.bugs;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Story extends AppCompatActivity {

    private ImageView m_bulle;
    private TextView m_textDialog;
    private ImageButton m_background;
    public static float test = 0;
    private int stepInDialog = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        getSupportActionBar().hide(); // hide the default bar

        m_bulle = findViewById(R.id.bulleDialogue);
        m_background = findViewById(R.id.image_background);
        m_textDialog = findViewById(R.id.textDialog);

        m_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(stepInDialog == 0){
                    stepInDialog ++;
                    m_bulle.setAlpha(1f);
                    m_textDialog.setAlpha(1f);
                }else if(stepInDialog == 1){
                    stepInDialog ++;
                    m_textDialog.setText(getString(R.string.story_dialog_1));
                }else if(stepInDialog == 2){
                    stepInDialog ++;
                    m_textDialog.setText(getString(R.string.story_dialog_2));
                }else if(stepInDialog == 3){
                    stepInDialog ++;
                    m_textDialog.setText(getString(R.string.story_dialog_3));
                }else if(stepInDialog == 4){
                    stepInDialog ++;
                    m_textDialog.setText(getString(R.string.story_dialog_4));
                }else if(stepInDialog == 5){
                    stepInDialog ++;
                    m_textDialog.setText(getString(R.string.story_dialog_5));
                }else if(stepInDialog == 6){
                    stepInDialog ++;
                    m_textDialog.setText(getString(R.string.story_dialog_6));
                }else if(stepInDialog == 7){
                    stepInDialog ++;
                    Intent exercicesActivityIntent = new Intent(Story.this, Exercices.class);
                    startActivity(exercicesActivityIntent);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        /**new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                m_bulle.setAlpha(0.25f);
                new Handler().postDelayed(new Runnable() {
                    @Override public void run() {
                        m_bulle.setAlpha(0.5f);
                        new Handler().postDelayed(new Runnable() {
                            @Override public void run() {
                                m_bulle.setAlpha(0.75f);
                                new Handler().postDelayed(new Runnable() {
                                    @Override public void run() {
                                        m_bulle.setAlpha(1f);
                                        m_textDialog.setAlpha(1f);
                                    }
                                }, 200L);
                            }
                        }, 200L);
                    }
                }, 200L);
            }
        }, 2100L); TROP LENT */


        /**while(m_bulle.getAlpha() <= 1.0f){
            new Handler().postDelayed(new Runnable() {
                @Override public void run() {
                    test += 0.1f;
                    Log.i("test :", " " + test);
                }
            }, 200L);
        } PK ça fait tout bug, c'est un mystère **/
    }
}
