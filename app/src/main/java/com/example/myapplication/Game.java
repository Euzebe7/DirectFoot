package com.example.myapplication;
import java.text.SimpleDateFormat;

import com.example.myapplication.LiveGamesJsonModel.*;

import static com.example.myapplication.Game.Statut.*;

/**
 * Declaration of class Game
 */
public class Game {

    private String homeTeamName;
    private String awayTeamName;
    private String homeScore;
    private String awayScore;
    private String date;
    private Statut statut;
    private String urlHomeLogo;
    private String urlAwayLogo;
    private String urlMatch;

    /**
     * Declaration of enum Statut
     */
    public enum Statut
    {
        RUNNING, FINISHED, COMING, HALF_TIME;
    }

    /**
     * Constructor of Game
     * @param game
     */
    public Game(Objet game)
    {
        //Teams name
        homeTeamName = game.getSpecifics().getDomicile().getEquipe().getNom();
        awayTeamName = game.getSpecifics().getExterieur().getEquipe().getNom();

        //Match Statut
        switch(game.getStatut().getType())
        {
            case "avenir" :
                statut = COMING;
                break;
            case "termine" :
                statut = FINISHED;
                break;
            case "encours" :
                statut = RUNNING;
                break;
            case "mi-temps" :
                statut = HALF_TIME;
                break;
            default :
                statut = null;
                break;
        }

        //Score if game is running, finished or half-time
        if(statut.equals(RUNNING) || statut.equals(FINISHED)) {
            homeScore = game.getSpecifics().getScore().getDomicile();
            awayScore = game.getSpecifics().getScore().getExterieur();
            urlMatch = game.getStatistics_feed_url();
        }



        //Date
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        date = sdf.format(game.getDate());
        urlHomeLogo = game.getSpecifics().getDomicile().getEquipe().getUrl_image();
        urlAwayLogo = game.getSpecifics().getExterieur().getEquipe().getUrl_image();
    }


    /**
     *
     * @return homeTeamName
     */
    public String getHomeTeamName() {
        return homeTeamName;
    }

    /**
     * @return awayTeamName
     */
    public String getAwayTeamName() {
        return awayTeamName;
    }

    /**
     *
     * @return homeScore
     */
    public String getHomeScore() {
        return homeScore;
    }

    /**
     *
     * @return awayScore
     */
    public String getAwayScore() {
        return awayScore;
    }

    /**
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @return statut
     */
    public Statut getStatut() {
        return statut;
    }

    /**
     *
     * @return urlHomeLogo
     */
    public String getUrlHomeLogo() {
        return urlHomeLogo;
    }

    /**
     *
     * @return urlAwayLogo
     */
    public String getUrlAwayLogo() {
        return urlAwayLogo;
    }
}
