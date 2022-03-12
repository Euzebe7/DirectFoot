package com.example.myapplication;

import java.util.ArrayList;
import java.util.Date;

public class TableJsonModel {
    public class Metas{
        public String __type;
        public String description;
        public String canonical;
        public String title;
        public String label;
        public String opengraph_title;
        public String sub_label;
        public String id;
        public String twitter_title;
    }

    public class Item{
        public String key;
        public String value;
        public String __type;
        public String rank_label;
        public int rank_evolution;
        public int nombre_points;
        public int buts_contre;
        public String difference_de_buts_libelle;
        public int bonus_offensif;
        public int rang;
        public int difference_de_buts;

        public Equipe getEquipe() {
            return equipe;
        }

        public Equipe equipe;
        public int nombre_de_victoires;
        public int nombre_de_bonus;
        public int nombre_de_defaites;
        public int nombre_de_matchs;
        public int bonus_defensif;
        public int buts_pour;
        public int nombre_de_nuls;
        public ArrayList<LastMatch> last_matches;
        public String layout;

        public Objet getObjet() {
            return objet;
        }

        public Objet objet;
        public ArrayList<Option> options;

        public int getNombre_points() {
            return nombre_points;
        }

        public int getButs_contre() {
            return buts_contre;
        }

        public int getRang() {
            return rang;
        }

        public int getDifference_de_buts() {
            return difference_de_buts;
        }

        public int getNombre_de_victoires() {
            return nombre_de_victoires;
        }

        public int getNombre_de_defaites() {
            return nombre_de_defaites;
        }

        public int getNombre_de_matchs() {
            return nombre_de_matchs;
        }

        public int getButs_pour() {
            return buts_pour;
        }

        public int getNombre_de_nuls() {
            return nombre_de_nuls;
        }
    }

    public class Slug{
        public String __type;
        public ArrayList<Item> items;
    }

    public class Element{
        public String __type;
        public String libelle;
    }

    public class Surtitre{
        public String __type;
        public ArrayList<Element> elements;
    }

    public class PrimaryColor{
        public String __type;
    }

    public class SecondaryColor{
        public String __type;
    }

    public class Equipe{
        public String __type;
        public PrimaryColor primary_color;
        public String url_fiche;

        public String getUrl_image() {
            return url_image;
        }

        public String url_image;

        public String getNom() {
            return nom;
        }

        public String nom;
        public SecondaryColor secondary_color;
        public String id;
    }

    public class Statut{
        public String __type;
        public String type;
        public String libelle;
    }

    public class Competition{
        public String __type;
        public String libelle;
        public String code;
        public String id;
    }

    public class Exterieur{
        public String __type;
        public Equipe equipe;
    }

    public class Score{
        public String __type;
        public String domicile;
        public String exterieur;
    }

    public class Domicile{
        public String __type;
        public Equipe equipe;
    }

    public class Specifics{
        public String __type;
        public String vainqueur;
        public Exterieur exterieur;
        public boolean is_qualifier;
        public Score score;
        public String vainqueur_final;
        public Domicile domicile;
        public boolean prolongation;
        public boolean is_final;
    }

    public class LastMatch{
        public String __type;
        public String lien_web;
        public Date date;
        public String id;
        public Statut statut;
        public String lien;
        public Competition competition;
        public Specifics specifics;
    }

    public class Objet{
        public String __type;
        public String subtitle;
        public String title;
        public Surtitre surtitre;
        public String libelle_direct;

        public ArrayList<Item> getItems() {
            return items;
        }

        public ArrayList<Item> items;
        public boolean direct;
        public String lien;
        public String widget_id_desktop;
        public String widget_id_android_phone;
        public String widget_id_pwa;
        public String widget_id_android_tab;
        public String tracking_id_android_phone;
        public String widget_id_ios_phone;
        public String tracking_id_ios_pad;
        public String tracking_id_ios_phone;
        public String tracking_id_android_tab;
        public String widget_id_ios_pad;
        public String titre;
    }

    public class Option{
        public String __type;
        public Objet objet;
        public String type;
    }

    public class IndicateursApplication{
        public String __type;
        public String valeur;
        public String custom_var_type;
        public int id;
    }

    public class Basic{
        public String name;
        public String chapter1;
        public String chapter2;
        public String chapter3;
        public String level2;
    }

//    public class Custom{
//        @JsonProperty("13")
//        public String _13;
//        @JsonProperty("14")
//        public String _14;
//        @JsonProperty("16")
//        public String _16;
//        @JsonProperty("17")
//        public String _17;
//        @JsonProperty("18")
//        public String _18;
//        @JsonProperty("19")
//        public String _19;
//        @JsonProperty("21")
//        public String _21;
//        @JsonProperty("22")
//        public String _22;
//        @JsonProperty("23")
//        public String _23;
//        @JsonProperty("26")
//        public int _26;
//        @JsonProperty("27")
//        public int _27;
//        @JsonProperty("28")
//        public String _28;
//        @JsonProperty("29")
//        public String _29;
//        @JsonProperty("30")
//        public String _30;
//    }

    public class AtVars{
        public String __type;
        public Basic basic;
//        public Custom custom;
    }

    public class Stat{
        public String __type;
        public String niveau2;
        public String sous_chapitre;
        public String chapitre;
        public ArrayList<IndicateursApplication> indicateurs_application;
        public String page;
        public AtVars at_vars;
    }

    public class Parameter{
        public String __type;
        public String key;
        public String value;
    }

    public class Value{
        public String __type;
        public String tag_id;
        public int id;
    }

    public class Format{
        public String __type;
        public String platform;
        public ArrayList<Value> value;
    }

    public class SiteId{
        public String __type;
        public String platform;
        public int id;
    }

    public class PageId{
        public String __type;
        public String platform;
        public int id;
    }

    public class PubDFP{
        public String __type;
        public String ad_unit_id_ios;
        public ArrayList<Parameter> parameters;
        public ArrayList<Format> formats;
        public ArrayList<String> keywords;
        public String ad_unit_id_desktop;
        public String position;
        public String ad_unit_id_pwa;
        public String ad_unit_id_android;
        public ArrayList<SiteId> site_id;
        public ArrayList<PageId> page_id;
    }

    public class Root{
        public String __type;
        public Metas metas;
        public Slug slug;

        public ArrayList<Item> getItems() {
            return items;
        }

        public ArrayList<Item> items;
        public Stat stat;
        public PubDFP pub_DFP;
    }
}
