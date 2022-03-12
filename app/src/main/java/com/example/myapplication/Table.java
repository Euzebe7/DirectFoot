package com.example.myapplication;

import com.example.myapplication.Championship;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Table {

    private ArrayList<TeamTable> teamsTable = new ArrayList<>();;

    public Table(Championship championship) throws Exception {
        String urlString = "https://iphdata.lequipe.fr/iPhoneDatas/EFR/STD/ALL/V1/Football/ClassementsBase/current/";
        switch(championship)
        {
            case LIGA :
                urlString += "championnat-d-espagne";
                break;
            case LIGUE_1 :
                urlString += "ligue-1";
                break;
            case SERIE_A :
                urlString += "championnat-d-italie";
                break;
            case BUNDESLIGA :
                urlString += "championnat-d-allemagne";
                break;
            case PREMIER_LEAGUE :
                urlString += "championnat-d-angleterre";
                break;
            default :
                throw new Exception("Championnat Incorrect");

        }
        urlString += "/general.json";

        //read the answer of the api
        URL url = new URL(urlString);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String jsonString = bufferedReader.readLine();

        //Create an objet with this answer
        TableJsonModel.Root jsonObject = new Gson().fromJson(jsonString, TableJsonModel.Root.class);

        for(TableJsonModel.Item tmp : jsonObject.getItems().get(1).getObjet().getItems())
        {
            teamsTable.add(new TeamTable(tmp));
        }
    }

    public ArrayList<TeamTable> getTeamsTable() {
        return teamsTable;
    }
}
