package com.biryanistudio.tourguide;

/**
 * Created by Aakaash on 24/03/17 at 11:35 PM.
 */

class Location {

    private final String name;
    private final int drawableId;

    Location(String name, int drawableId) {
        this.name = name;
        this.drawableId = drawableId;
    }

    String getName() {
        return name;
    }

    int getDrawableId() {
        return drawableId;
    }
}
