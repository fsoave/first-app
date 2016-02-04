package com.support.android.designlibdemo.character.pvp;

import com.support.android.designlibdemo.R;

/**
 * Created by fabio on 22/10/15.
 *
 * spero di fare una sola classe per tutti i personaggi
 */

public class Pvp {

    public static int getRandomDrawable() {
        return R.drawable.deadpool;
    }

    public static final String[] sPvpStrings = {
            "Deadpool", "Cable", "Psylocke", "Punisher", "X-23", "Fantomex", "Shatterstar", "Red Hulk",
            "Angel", "Bishop", "Spiral", "Domino", "Agent Venom", "Hogun", "Rocket Raccoon", "Drax",
            "Karnak", "Nova", "Angela", "Victor Mancha", "Deathlok", "Spider-Man Noir", "Spider-Girl",
            "A-Bomb", "Misty Knight"
    };

    public static final String[] sPvpBruiser = {
            "X-23", "Bishop", "Spider-Girl",
    };

    public static final String[] sPvpBlaster = {
            "Cable", "Domino", "Rocket Raccoon", "Nova", "Deathlok",  "Spider-Girl", "Misty Knight",
    };

    public static final String[] sPvpScrapper = {
            "Deadpool",  "Shatterstar", "Hogun", "Drax", "Karnak", "Angela",
    };

    public static final String[] sPvpTactical = {
            "Fantomex", "Red Hulk",
    };

    public static final String[] sPvpInfiltrator = {
            "Psylocke", "Spiral", "Agent Venom", "Victor Mancha", "A-Bomb",
    };

    public static final String[] sPvpGeneralist = {
            "Angel", "Spider-Man Noir",
    };

}





