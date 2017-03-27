package com.biryanistudio.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_EXTRA_TITLE = "title";
    public static final String INTENT_EXTRA_NAMES = "names";
    public static final String INTENT_EXTRA_DRAWABLES = "drawables";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.bangalore));
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(MainActivity.this, ListActivity.class);
        findViewById(R.id.restaurants).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] restaurantNames = getResources()
                        .getStringArray(R.array.resturants_array);
                int[] restaurantDrawables = {
                        R.drawable.vidhyarthi_bhavan,
                        R.drawable.mavalli_tiffin_rooms,
                        R.drawable.maiyas_restaurant,
                        R.drawable.central_tiffin_room};
                intent.putExtra(INTENT_EXTRA_TITLE, getString(R.string.restaurants));
                intent.putExtra(INTENT_EXTRA_NAMES, restaurantNames);
                intent.putExtra(INTENT_EXTRA_DRAWABLES, restaurantDrawables);
                startActivity(intent);
            }
        });
        findViewById(R.id.historic_places).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] historicPlacesNames = getResources()
                        .getStringArray(R.array.historic_places_array);
                int[] histornicPlacesDrawables = {
                        R.drawable.vidhana_soudha,
                        R.drawable.state_central_library,
                        R.drawable.karnataka_high_court,
                        R.drawable.bangalore_fort};
                intent.putExtra(INTENT_EXTRA_TITLE, getString(R.string.historic_places));
                intent.putExtra(INTENT_EXTRA_NAMES, historicPlacesNames);
                intent.putExtra(INTENT_EXTRA_DRAWABLES, histornicPlacesDrawables);
                startActivity(intent);
            }
        });
        findViewById(R.id.hotels).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] hotelsNames = getResources()
                        .getStringArray(R.array.hotels_array);
                int[] hotelsDrawables = {
                        R.drawable.the_leela_palace,
                        R.drawable.le_meridien,
                        R.drawable.taj_bangalore,
                        R.drawable.the_lalit_ashok};
                intent.putExtra(INTENT_EXTRA_TITLE, getString(R.string.hotels));
                intent.putExtra(INTENT_EXTRA_NAMES, hotelsNames);
                intent.putExtra(INTENT_EXTRA_DRAWABLES, hotelsDrawables);
                startActivity(intent);
            }
        });
        findViewById(R.id.parks).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] parksNames = getResources()
                        .getStringArray(R.array.parks_array);
                int[] parksDrawables = {
                        R.drawable.cubbon_park,
                        R.drawable.lalbagh_botanical_garden,
                        R.drawable.m_n_krishna_rao_park,
                        R.drawable.wonderla_amusement_park};
                intent.putExtra(INTENT_EXTRA_TITLE, getString(R.string.parks));
                intent.putExtra(INTENT_EXTRA_NAMES, parksNames);
                intent.putExtra(INTENT_EXTRA_DRAWABLES, parksDrawables);
                startActivity(intent);
            }
        });
    }
}
