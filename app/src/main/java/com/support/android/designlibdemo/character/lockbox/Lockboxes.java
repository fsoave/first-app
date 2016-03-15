package com.support.android.designlibdemo.character.lockbox;

import com.support.android.designlibdemo.R;

import java.util.ArrayList;

/**
 * Created by fabio on 22/10/15.
 *
 * spero di fare una sola classe per tutti i personaggi
 */

public class Lockboxes {

    public static int getRandomDrawable() {
        return R.drawable.juggernaut;
    }

    public static final String[] sLockboxesStrings = {
            "Magneto", "Omega Sentinel", "Juggernaut", "Constrictor", "Satana", "Elektra", "Thane",
            "Loki", "Sabretooth", "Doctor Doom", "Moonstone", "Taskmaster", "Sandman",
            "Avalanche", "Kang", "Fixer", "Hybrid", "Enchantress", "Destroyer", "Superior Spider-Man",
            "Hyperion", "Blizzard", "Baron Mordo", "Boomerang", "Winter Soldier", "Howard the Duck",
    };

    public static final String[] sLockboxesBruiser = {
            "Juggernaut", "Sandman", "Hyperion",
    };

    public static final String[] sLockboxesBlaster = {
            "Thane", "Fixer", "Hybrid", "Blizzard", "Baron Mordo",
    };

    public static final String[] sLockboxesScrapper = {
            "Omega Sentinel", "Sabretooth", "Avalanche",
    };

    public static final String[] sLockboxesInfiltrator = {
            "Satana", "Elektra", "Enchantress", "Winter Soldier",
    };

    public static final String[] sLockboxesTactical = {
            "Magneto", "Constrictor", "Loki", "Doctor Doom", "Moonstone", "Kang",
            "Superior Spider-Man", "Boomerang", "Howard the Duck",
    };

    public static final String[] sLockboxesGeneralist = {
            "Taskmaster", "Destroyer",
    };

    public static ArrayList<String> getList(String[] array) {                   //elenco eroi --> list
        ArrayList<String> list = new ArrayList<>(array.length);
        int i = 0;
        while (list.size() < array.length) {
            list.add(array[i]);
            i++;
        }
        return list;
    }

}



