package com.support.android.designlibdemo.character.groupboss;

import com.support.android.designlibdemo.R;

/**
 * Created by fabio on 22/10/15.
 *
 * spero di fare una sola classe per tutti i personaggi
 */

public class GBoss {

    public static int getRandomDrawable() {
        return R.drawable.karn;
    }

    public static final String[] sGroupBossStrings = {
            "Ultron", "Red Skull", "BlackHeart", "Thanos", "Kurse", "Arcade", "Hybrid", "Bastion",
            "High Evolutionary", "Surtur", "Karn", "Dracula", "Kingpin", "Zzzax",
    };

}

/* creo un singleton che
    1 crea una lista di oggetti personaggio,
    2 la restituisce alla necessità

    in futuro, creo un singleton che
    1 crea una lista di oggetti personaggio leggendo il DB in cerca di GBoss
    2 la restituisce alla necessità

    o magari, 6 liste una per ogni classe personaggio.
 */






