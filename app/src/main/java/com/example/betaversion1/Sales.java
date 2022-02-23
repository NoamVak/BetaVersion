package com.example.betaversion1;

import java.util.ArrayList;

public class Sales {

    private String Date;
    private boolean Status;
    private int Price;
    private int Condition;
    private ArrayList<String> Image;
    private String UserId;
    private String BookId;
    private String Info;

    public Sales(String Date, boolean Status, int Price, int Condition, ArrayList<String> Image,
                 String UserId, String BookId, String Info){
        this.Date=Date;
        this.Status=Status;
        this.Price=Price;
        this.Condition=Condition;
        this.Image=Image;
        this.UserId=UserId;
        this.BookId=BookId;
        this.Info=Info;

    }





}
