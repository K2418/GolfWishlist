package com.example.kaupp.golfwishlist;

import android.content.Context;

/**
 * Created by kaupp on 20.10.2017.
 */

public class Place {
    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
