package com.example.bboss.run2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaGare extends AppCompatActivity {
    private ListView lvGare;
    private Button btnBack;
    private List<Race> races;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        races=new ArrayList<>();
        //random generation
        for(int i=0;i<10;i++)
            races.add(new Race());
        setContentView(R.layout.activity_lista_gare);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //lvGare = findViewById(R.id.lvGare);
        //btnBack = findViewById(R.id.btnBack);
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        RaceAdapter raceAdapter = new RaceAdapter(this, R.layout.item_race, races);
        lvGare.setAdapter(raceAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
