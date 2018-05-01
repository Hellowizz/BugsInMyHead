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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Exercice_1 extends AppCompatActivity {

    ImageView m_endToPeeButton;
    DragAndDroppable m_endToPee;

    ImageView m_wipeButton;
    ImageView m_endToPooButton;
    ImageView m_ifButton;
    ImageView m_takeTheToiletPaperButton;
    ImageView m_andButton;

    int width;

    LinearLayout m_containerIf;
    LinearLayout m_containerEndToPooee;
    LinearLayout m_containerAnd;
    LinearLayout m_containerEndToPeeoo;
    LinearLayout m_containerTakeTheToiletPaper;
    LinearLayout m_containerWipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_1);
        getSupportActionBar().hide(); // hide the default bar

        // to get the width and the height of the app
        width = this.getResources().getDisplayMetrics().widthPixels;
        int height = this.getResources().getDisplayMetrics().heightPixels;


        // Put the elements in the desired locations

            // DRAG objects
        m_endToPeeButton = findViewById(R.id.image_endToPee);
        m_endToPeeButton.setOnTouchListener(new MyTouchListener_EndToPee());

        m_wipeButton = findViewById(R.id.image_wipe);
        m_wipeButton.setOnTouchListener(new MyTouchListener_Wipe());

        m_endToPooButton = findViewById(R.id.image_endToPoo);

        m_ifButton = findViewById(R.id.image_if);
        m_ifButton.setOnTouchListener(new MyTouchListener_If());

        m_takeTheToiletPaperButton = findViewById(R.id.image_takeTheToiletPaper);

        m_andButton = findViewById(R.id.image_and);

            // DROPPING ZONE
        m_containerIf = findViewById(R.id.container_if);
        m_containerIf.setOnDragListener(new MyDragListener_1());

        m_containerEndToPooee = findViewById(R.id.container_end_to_pooee);
        m_containerEndToPooee.setOnDragListener(new MyDragListener_2());

        m_containerAnd = findViewById(R.id.container_and);

        m_containerEndToPeeoo = findViewById(R.id.container_end_to_peeoo);

        m_containerTakeTheToiletPaper = findViewById(R.id.container_take_toiletpaper);

        m_containerWipe = findViewById(R.id.container_wipe);

    }

    private class MyTouchListener_EndToPee implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("button", "EndToPee");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            } else if (motionEvent.getAction() == MotionEvent.ACTION_CANCEL)
            {
                view.setVisibility(View.VISIBLE);
                return true;
            }
            else {
                return false;
            }
        }
    }

    private class MyTouchListener_Wipe implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("button", "Wipe");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            } else if (motionEvent.getAction() == MotionEvent.ACTION_CANCEL) {
                view.setVisibility(View.VISIBLE);
                return true;
            }
            else {
                return false;
            }
        }
    }

    private class MyTouchListener_If implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("button", "Wipe");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                view.setY(0);
                view.setX(0);
                return true;
            } else {
                return false;
            }
        }
    }

    private class MyDragListener_1 implements View.OnDragListener {
        Drawable enterShape = getResources().getDrawable(R.drawable.vide_exo1);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    v.setBackgroundDrawable(enterShape);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    //Dropped, reassign View to ViewGroup
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    v.setBackgroundDrawable(enterShape);
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    private class MyDragListener_2 implements View.OnDragListener {
        Drawable enterShape = getResources().getDrawable(R.drawable.vide_exo1);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    v.setBackgroundDrawable(enterShape);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    //Dropped, reassign View to ViewGroup
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    v.setBackgroundDrawable(enterShape);
                    break;
                default:
                    break;
            }
            return true;
        }
    }


}
