package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MainActivity main =this;
    private static String rayyan = "RAYYAN LE COCHON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classement);

        Button direct = (Button) findViewById(R.id.direct);
        direct.setOnClickListener(directOnClickListener);

    }

    /** Listener à l'écoute des evenements Bouton */
    OnClickListener directOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            LayoutInflater vi = (LayoutInflater)main.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            vi.inflate(R.layout.classement_1, findViewById(R.id.classement_gauche), true);
            vi.inflate(R.layout.classement_2, findViewById(R.id.classement_droite), true);


        }


    };


}