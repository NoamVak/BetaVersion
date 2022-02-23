package com.example.betaversion1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Books {

    private String Name;
    private String Author;
    private int Genre;
    private ArrayList<String> Image;
    private int Pages;
    private String Id;
    private int AgeGroup;
    private String Info;

    public Books(String Name, String Author, int Genre, ArrayList<String> Image, int Pages, String Id, int AgeGroup, String Info){
        this.Name=Name;
        this.Author=Author;
        this.Genre=Genre;
        this.Image=Image;
        this.Pages=Pages;
        this.Id=Id;
        this.AgeGroup=AgeGroup;
        this.Info=Info;
    }


}
