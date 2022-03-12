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

    private TextView equipe_name;
    private  TeamTable team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classement);

        Button direct = (Button) findViewById(R.id.direct);
        direct.setOnClickListener(directOnClickListener);

       /* equipe_name = findViewById(R.id.Equipe_);
        try {
            Table classement = new Table(Championship.LIGUE_1);
            ArrayList <TeamTable> table = classement.getTeamsTable();
            TeamTable team = table.get(0);



        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        // Intent login = new Intent(getApplicationContext(), Recherche.class);

    /*    String imageUri = "https://medias.lequipe.fr/logo-football/692/";
        ImageView ivBasicImage = (ImageView) findViewById(R.id.ImageView01);
        Picasso.get().load(imageUri).into(ivBasicImage);*/

    }


    MainActivity main =this;

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