package com.support.android.designlibdemo.character.hero;

import com.support.android.designlibdemo.R;

import java.util.Random;

/**
 * Created by fabio on 22/10/15.
 *
 * spero di fare una sola classe per tutti i personaggi
 */

public class Heroes {

    public static int getRandomDrawable() {
        return R.drawable.black_bolt;
    }

    /* gestisco le divise alternative con swipe su nome eroe che apre dialog, oppure un onlongpress che apre un dialog
    * scelgo la divisa e faccio pagina custom
    * - capire dove mettere l'anagrafica delle alt
    * */

    public static final String[] sHeroesStrings = {
            "Black Bolt", "Black Knight", "Black Panter", "Boomerang", "Captain America", "Constrictor",
            "Cyclops", "Doctor Doom", "Emma Frost", "Fantomex", "Gamora", "Hank Pym", "Hawkeye", "Kang",
            "Kate Bishop", "Loki", "Magneto", "Moonstone", "Mr. Fantastic", "Quake", "Red Hulk",
            "Rescue", "Superior Spiderman", "War Machine", "Howard the Duck",

            "Amazing Spider-Woman", "Blizzard", "Cable", "Cannonball", "Crystal", "Daimon Hellstrom",
            "Deathlok", "Doctor Voodoo", "Domino", "Dr. Strange", "Fixer", "Havok", "Human Torch",
            "Hybrid", "Iron Man" , "Karolina Dean","Ms. Marvel", "Nico Minoru", "Nova", "Phoenix",
            "Rocket Raccoon", "Scarlet Witch", "Storm", "Sunfire", "Thane", "Vision", "Misty Knight",
            "Baron Mordo",

            "Anti-Venom", "Ares", "Beta Ray Bill", "Bishop", "Captain Britain", "Colossus", "Gorgon",
            "Groot", "Heimdall", "Hercules", "Hulk", "Hyperion", "Iceman", "Juggernaut", "Molly Hayes",
            "Sandman", "She-Hulk", "Spider-Girl", "Spider-Gwen", "Thing", "Thor", "Thundra", "Valkyrie",
            "Volstagg", "Wonder Man", "X-23", "Jessica Jones",

            "Angela","Avalanche","Blade","Chase Stein","Daredevil","Deadpool","Drax",
            "Ghost Rider","Hogun","Iron Fist","Ka-Zar","Karnak","Luke Cage",
            "Magik","Omega Sentinel","Quicksilver","Sabretooth","Shatterstar","Sif",
            "Spider-Woman","Spider-Man 2099","Squirrel Girl","Union Jack","Wolverine", "Spitfire",
            "Kamala Khan",

            "A-Bomb","Agent Venom","Ant-Man","Black Cat","Black Widow","Elektra",
            "Enchantress","Falcon","Fandral","Gambit","Invisible Woman","Kitty Pryde",
            "Medusa","Morbius","Nightcrawler","Psylocke","Satana","Shanna","Spider-Man",
            "Spiral","Star-Lord","Tigra","Ultimate Spider-Man","Victor Mancha","Wasp",
            "Winter Soldier",

            "Angel","Beast","Destroyer","Mockingbird","Moon Knight","Punisher","Rogue",
            "Silk","Spider-Man Noir","Taskmaster", "Red She-Hulk",
    };

    public static final String[] sHeroesBruiser = {
            "Anti-Venom", "Ares", "Beta Ray Bill", "Bishop", "Captain Britain", "Colossus", "Gorgon",
            "Groot", "Heimdall", "Hercules", "Hulk", "Hyperion", "Iceman", "Juggernaut", "Molly Hayes",
            "Sandman", "She-Hulk", "Spider-Girl", "Spider-Gwen", "Thing", "Thor", "Thundra", "Valkyrie",
            "Volstagg", "Wonder Man", "X-23", "Jessica Jones",
    };

    public static final String[] sHeroesBlaster = {
            "Amazing Spider-Woman", "Blizzard", "Cable", "Cannonball", "Crystal", "Daimon Hellstrom",
            "Deathlok", "Doctor Voodoo", "Domino", "Dr. Strange", "Fixer", "Havok", "Human Torch",
            "Hybrid", "Iron Man" , "Karolina Dean","Ms. Marvel", "Nico Minoru", "Nova", "Phoenix",
            "Rocket Raccoon", "Scarlet Witch", "Storm", "Sunfire", "Thane", "Vision", "Misty Knight",
            "Baron Mordo",
    };

    public static final String[] sHeroesScrapper = {
            "Angela","Avalanche","Blade","Chase Stein","Daredevil","Deadpool","Drax",
            "Ghost Rider","Hogun","Iron Fist","Ka-Zar","Karnak","Luke Cage",
            "Magik","Omega Sentinel","Quicksilver","Sabretooth","Shatterstar","Sif",
            "Spider-Woman","Spider-Man 2099","Squirrel Girl","Union Jack","Wolverine", "Spitfire",
            "Kamala Khan",
    };

    public static final String[] sHeroesTactical = {
            "Black Bolt", "Black Knight", "Black Panter", "Boomerang", "Captain America", "Constrictor",
            "Cyclops", "Doctor Doom", "Emma Frost", "Fantomex", "Gamora", "Hank Pym", "Hawkeye", "Kang",
            "Kate Bishop", "Loki", "Magneto", "Moonstone", "Mr. Fantastic", "Quake", "Red Hulk",
            "Rescue", "Superior Spiderman", "War Machine", "Howard the Duck",
    };

    public static final String[] sHeroesInfiltrator = {
            "A-Bomb","Agent Venom","Ant-Man","Black Cat","Black Widow","Elektra",
            "Enchantress","Falcon","Fandral","Gambit","Invisible Woman","Kitty Pryde",
            "Medusa","Morbius","Nightcrawler","Psylocke","Satana","Shanna","Spider-Man",
            "Spiral","Star-Lord","Tigra","Ultimate Spider-Man","Victor Mancha","Wasp",
            "Winter Soldier",
    };

    public static final String[] sHeroesGeneralist = {
            "Angel","Beast","Destroyer","Mockingbird","Moon Knight","Punisher","Rogue",
            "Silk","Spider-Man Noir","Taskmaster", "Red She-Hulk",
    };

}

