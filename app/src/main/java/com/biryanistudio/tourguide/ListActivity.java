package com.biryanistudio.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent = getIntent();
        setTitle(intent.getStringExtra(MainActivity.INTENT_EXTRA_TITLE));
        String[] names = intent.getStringArrayExtra(MainActivity.INTENT_EXTRA_NAMES);
        int[] drawables = intent.getIntArrayExtra(MainActivity.INTENT_EXTRA_DRAWABLES);
        ArrayList<Location> locations = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            locations.add(new Location(names[i], drawables[i]));
        ((ListView) findViewById(R.id.list)).setAdapter(new LocationAdapter(getApplicationContext(), locations));
    }
}
