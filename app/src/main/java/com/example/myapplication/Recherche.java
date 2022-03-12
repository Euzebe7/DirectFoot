package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;


public class Recherche extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_menu);
  
        Button btnRetour = (Button) findViewById(R.id.direct);
        btnRetour.setOnClickListener(btnRetourOnClickListener);

    }


    /** Listener à l'écoute des evenements Bouton */
    View.OnClickListener btnRetourOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setResult(50);
            finish();
        }
    };



}

