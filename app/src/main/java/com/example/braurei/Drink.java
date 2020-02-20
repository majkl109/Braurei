package com.example.braurei;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Schönbuch Helles", "Schönes bier", R.drawable.schoenbuch_helles),
            new Drink("Schönbuch Weiss","Schönes weizen",R.drawable.schoenbuch_weizen)
     };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    
}
