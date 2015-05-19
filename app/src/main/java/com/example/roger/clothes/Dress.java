package com.example.roger.clothes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Dress extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress);

        ImageButton ButtonPrevSamarreta = (ImageButton) findViewById(R.id.prev_samarreta);
        ImageButton ButtonNextSamarreta = (ImageButton) findViewById(R.id.next_samarreta);
        ImageButton ButtonPrevPantalons = (ImageButton) findViewById(R.id.prev_pantalons);
        ImageButton ButtonNextPantalons = (ImageButton) findViewById(R.id.next_pantalons);
        final ImageView imageSamarreta = (ImageView) findViewById(R.id.image_samarreta);
        final ImageView imagePantalons = (ImageView) findViewById(R.id.image_pantalons);

        ButtonPrevSamarreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               imageSamarreta.setImageResource(R.drawable.next);
            }
        });

        ButtonNextSamarreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageSamarreta.setImageResource(R.drawable.previous);
            }
        });

        ButtonPrevPantalons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagePantalons.setImageResource(R.drawable.next);
            }
        });

        ButtonNextPantalons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagePantalons.setImageResource(R.drawable.previous);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dress, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
