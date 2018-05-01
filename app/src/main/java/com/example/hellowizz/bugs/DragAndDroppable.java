package com.example.hellowizz.bugs;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by helor on 29/04/2018.
 */

public class DragAndDroppable extends android.support.v7.widget.AppCompatImageView{

    private ViewParent zone;
    public boolean inDroppingZone;

    public DragAndDroppable(Context context) {
        super(context);
        inDroppingZone = false;
        zone = this.getParent();
    }

    public ViewParent getParentView() {
        return zone;
    }
}
