package com.example.kaupp.golfwishlist;

import java.util.ArrayList;

/**
 * Created by kaupp on 20.10.2017.
 */

public class Places {
    public static String[] placeNameArray = {
            "Black Mountain", "Chambers Bay", "Clear Water", "Harbour Town",
            "Muirfield", "Old Course", "Pebble Beach", "Spy Class", "Turtle Bay"};

    public static ArrayList<Place> placeList() {
        ArrayList<Place> list = new ArrayList<>();
        for (int i = 0; i < placeNameArray.length; i++) {
            Place place = new Place();
            place.name = placeNameArray[i];
            place.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
            list.add(place);
        }
        return list;
    }
}
