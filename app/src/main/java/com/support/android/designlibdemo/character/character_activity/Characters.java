package com.support.android.designlibdemo.character.character_activity;

import com.support.android.designlibdemo.R;

import java.util.TreeMap;
import java.util.Map;

/**
 * Created by fabio on 22/10/15.
 *
 * spero di fare una sola classe per tutti i personaggi
 */

public class Characters {                                                               // to be updated

    private static Map<String, CharacterData> characterDatas;
    private static Map<String, Biopic> biopics;

    // Heroes
    public static Map<String, CharacterData > getHeroBruiser(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Juggernaut", new CharacterData("Juggernaut", R.drawable.juggernaut, R.drawable.juggernaut_dial));
        characterDatas.put("Sandman", new CharacterData("Sandman", R.drawable.sandman, R.drawable.sandman_dial));
        characterDatas.put("Hyperion", new CharacterData("Hyperion", R.drawable.hyperion, R.drawable.hyperion_dial));
        characterDatas.put("Volstagg", new CharacterData("Volstagg", R.drawable.volstagg, R.drawable.volstagg_dial));
        characterDatas.put("Valkyrie", new CharacterData("Valkyrie", R.drawable.valkyrie, R.drawable.valkyrie_dial));
        characterDatas.put("Wonder Man", new CharacterData("Wonder Man", R.drawable.wonder_man, R.drawable.wonder_man_dial));
        characterDatas.put("Ares", new CharacterData("Ares", R.drawable.ares, R.drawable.ares));
        characterDatas.put("Heimdall", new CharacterData("Heimdall", R.drawable.heimdall, R.drawable.heimdall_dial));
        characterDatas.put("Iceman", new CharacterData("Iceman", R.drawable.iceman, R.drawable.iceman_dial));
        characterDatas.put("Anti-Venom", new CharacterData("Anti-Venom", R.drawable.anti_venom, R.drawable.anti_venom_dial));
        characterDatas.put("Beta Ray Bill", new CharacterData("Beta Ray Bill", R.drawable.beta_ray_bill, R.drawable.beta_ray_bill_dial));
        characterDatas.put("Jessica Jones", new CharacterData("Jessica Jones", R.drawable.jessica_jones, R.drawable.jessica_jones));
        characterDatas.put("X-23", new CharacterData("X-23", R.drawable.x_23, R.drawable.x_23_dial));
        characterDatas.put("Bishop", new CharacterData("Bishop", R.drawable.bishop, R.drawable.bishop_dial));
        characterDatas.put("Spider-Girl", new CharacterData("Spider-Girl", R.drawable.spider_girl, R.drawable.spidergirl_dial));
        characterDatas.put("Captain Britain", new CharacterData("Captain Britain", R.drawable.captain_britain, R.drawable.captain_britain_dial));
        characterDatas.put("Colossus", new CharacterData("Colossus", R.drawable.colossus, R.drawable.colossus_dial));
        characterDatas.put("Gorgon", new CharacterData("Gorgon", R.drawable.gorgon, R.drawable.gorgon_dial));
        characterDatas.put("Groot", new CharacterData("Groot", R.drawable.groot, R.drawable.groot_dial));
        characterDatas.put("Hercules", new CharacterData("Hercules", R.drawable.hercules, R.drawable.hercules_dial));
        characterDatas.put("Hulk", new CharacterData("Hulk", R.drawable.hulk, R.drawable.hulk_dial));
        characterDatas.put("Molly Hayes", new CharacterData("Molly Hayes", R.drawable.molly_hayes, R.drawable.molly_hayes_dial));
        characterDatas.put("She-Hulk", new CharacterData("She-Hulk", R.drawable.she_hulk, R.drawable.she_hulk_dial));
        characterDatas.put("Spider-Gwen", new CharacterData("Spider-Gwen", R.drawable.spider_gwen, R.drawable.spidergwen_dial));
        characterDatas.put("Thing", new CharacterData("Thing", R.drawable.thing, R.drawable.thing_dial));
        characterDatas.put("Thor", new CharacterData("Thor", R.drawable.thor, R.drawable.thor_dial));
        characterDatas.put("Thundra", new CharacterData("Thundra", R.drawable.thundra, R.drawable.thundra_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getHeroBlaster(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Thane", new CharacterData("Thane", R.drawable.thane, R.drawable.thane_dial));
        characterDatas.put("Fixer", new CharacterData("Fixer", R.drawable.fixer, R.drawable.fixer_dial));
        characterDatas.put("Hybrid", new CharacterData("Hybrid", R.drawable.hybrid, R.drawable.hybrid_dial));
        characterDatas.put("Blizzard", new CharacterData("Blizzard", R.drawable.blizzard, R.drawable.blizzard_dial));
        characterDatas.put("Baron Mordo", new CharacterData("Baron Mordo", R.drawable.baron_mordo, R.drawable.baron_mordo_dial));
        characterDatas.put("Havok", new CharacterData("Havok", R.drawable.havok, R.drawable.havok_dial));
        characterDatas.put("Vision", new CharacterData("Vision", R.drawable.vision, R.drawable.vision_dial));
        characterDatas.put("Daimon Hellstrom", new CharacterData("Daimon Hellstrom", R.drawable.daimon_hellstrom, R.drawable.daimon_hellstrom_dial));
        characterDatas.put("Nico Minoru", new CharacterData("Nico Minoru", R.drawable.nico_minoru, R.drawable.nico_minoru_dial));
        characterDatas.put("Cannonball", new CharacterData("Cannonball", R.drawable.cannonball, R.drawable.cannonball_dial));
        characterDatas.put("Crystal", new CharacterData("Crystal", R.drawable.crystal, R.drawable.crystal_dial));
        characterDatas.put("Cable", new CharacterData("Cable", R.drawable.cable, R.drawable.cable_dial));
        characterDatas.put("Domino", new CharacterData("Domino", R.drawable.domino, R.drawable.domino_dial));
        characterDatas.put("Rocket Raccoon", new CharacterData("Rocket Raccoon", R.drawable.rocket_raccoon, R.drawable.rocket_raccoon_dial));
        characterDatas.put("Nova", new CharacterData("Nova", R.drawable.nova, R.drawable.nova_dial));
        characterDatas.put("Deathlok", new CharacterData("Deathlok", R.drawable.deathlok, R.drawable.deathlok_dial));
        characterDatas.put("Misty Knight", new CharacterData("Misty Knight", R.drawable.misty_knight, R.drawable.misty_knight_dial));
        characterDatas.put("Sunfire", new CharacterData("Sunfire", R.drawable.sunfire, R.drawable.sunfire_dial));
        characterDatas.put("Amazing Spider-Woman", new CharacterData("Amazing Spider-Woman", R.drawable.amazing_spider_woman, R.drawable.amazing_spiderwoman_dial));
        characterDatas.put("Doctor Voodoo", new CharacterData("Doctor Voodoo", R.drawable.doctor_voodoo, R.drawable.doctor_voodoo_dial));
        characterDatas.put("Dr. Strange", new CharacterData("Dr. Strange", R.drawable.dr_strange, R.drawable.dr_strange_dial));
        characterDatas.put("Human Torch", new CharacterData("Human Torch", R.drawable.human_torch, R.drawable.human_torch_dial));
        characterDatas.put("Iron Man", new CharacterData("Iron Man", R.drawable.iron_man, R.drawable.iron_man_dial));
        characterDatas.put("Karolina Dean", new CharacterData("Karolina Dean", R.drawable.karolina_dean, R.drawable.karolina_dean_dial));
        characterDatas.put("Ms. Marvel", new CharacterData("Ms. Marvel", R.drawable.ms_marvel, R.drawable.ms_marvel_dial));
        characterDatas.put("Phoenix", new CharacterData("Phoenix", R.drawable.phoenix, R.drawable.phoenix_dial));
        characterDatas.put("Scarlet Witch", new CharacterData("Scarlet Witch", R.drawable.scarlet_witch, R.drawable.scarlet_witch_dial));
        characterDatas.put("Storm", new CharacterData("Storm", R.drawable.storm, R.drawable.storm_dial));
        characterDatas.put("Electro", new CharacterData("Electro", R.drawable.electro, R.drawable.electro_dial));
        characterDatas.put("Elsa Bloodstone", new CharacterData("Elsa Bloodstone", R.drawable.elsa_bloodstone, R.drawable.elsa_bloodstone_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getHeroScrapper() {
        characterDatas = new TreeMap<>();
        characterDatas.put("Omega Sentinel", new CharacterData("Omega Sentinel", R.drawable.omega_sentinel, R.drawable.omega_sentinel_dial));
        characterDatas.put("Sabretooth", new CharacterData("Sabretooth", R.drawable.sabretooth, R.drawable.sabretooth_dial));
        characterDatas.put("Avalanche", new CharacterData("Avalanche", R.drawable.avalanche, R.drawable.avalanche_dial));
        characterDatas.put("Magik", new CharacterData("Magik", R.drawable.magik, R.drawable.magik_dial));
        characterDatas.put("Ghost Rider", new CharacterData("Ghost Rider", R.drawable.ghost_rider, R.drawable.ghost_rider_dial));
        characterDatas.put("Ka-Zar", new CharacterData("Ka-Zar", R.drawable.kazar, R.drawable.kazar_dial));
        characterDatas.put("Blade", new CharacterData("Blade", R.drawable.blade, R.drawable.blade_dial));
        characterDatas.put("Chase Stein", new CharacterData("Chase Stein", R.drawable.chase_stein, R.drawable.chase_stein_dial));
        characterDatas.put("Spitfire", new CharacterData("Spitfire", R.drawable.spitfire, R.drawable.spitfire_dial));
        characterDatas.put("Deadpool", new CharacterData("Deadpool", R.drawable.deadpool, R.drawable.deadpool_dial));
        characterDatas.put("Shatterstar", new CharacterData("Shatterstar", R.drawable.shatterstar, R.drawable.shatterstar_dial));
        characterDatas.put("Hogun", new CharacterData("Hogun", R.drawable.hogun, R.drawable.hogun_dial));
        characterDatas.put("Drax", new CharacterData("Drax", R.drawable.drax, R.drawable.drax_dial));
        characterDatas.put("Karnak", new CharacterData("Karnak", R.drawable.karnak, R.drawable.karnak_dial));
        characterDatas.put("Angela", new CharacterData("Angela", R.drawable.angela, R.drawable.angela_dial));
        characterDatas.put("Squirrel Girl", new CharacterData("Squirrel Girl", R.drawable.squirrel_girl, R.drawable.squirrel_girl_dial));
        characterDatas.put("Daredevil", new CharacterData("Daredevil", R.drawable.daredevil, R.drawable.daredevil_dial));
        characterDatas.put("Iron Fist", new CharacterData("Iron Fist", R.drawable.iron_fist, R.drawable.iron_fist_dial));
        characterDatas.put("Luke Cage", new CharacterData("Luke Cage", R.drawable.luke_cage, R.drawable.luke_cage_dial));
        characterDatas.put("Quicksilver", new CharacterData("Quicksilver", R.drawable.quicksilver, R.drawable.quicksilver_dial));
        characterDatas.put("Sif", new CharacterData("Sif", R.drawable.sif, R.drawable.sif_dial));
        characterDatas.put("Spider-Woman", new CharacterData("Spider-Woman", R.drawable.spider_woman, R.drawable.spiderwoman_dial));
        characterDatas.put("Spider-Man 2099", new CharacterData("Spider-Man 2099", R.drawable.spider_man_2099, R.drawable.spiderman_2099_dial));
        characterDatas.put("Union Jack", new CharacterData("Union Jack", R.drawable.union_jack, R.drawable.union_jack_dial));
        characterDatas.put("Wolverine", new CharacterData("Wolverine", R.drawable.wolverine, R.drawable.wolverine_dial));
        characterDatas.put("Kamala Khan", new CharacterData("Kamala Khan", R.drawable.kamala_khan, R.drawable.kamala_khan_dial));
        //TODO: MANCA DIALOG IMAGE
        characterDatas.put("Hellcat", new CharacterData("Hellcat", R.drawable.hellcat, R.drawable.example_dialogue));
        return characterDatas;
    }

    public static Map<String, CharacterData > getHeroTactical() {
        characterDatas = new TreeMap<>();
        characterDatas.put("Magneto", new CharacterData("Magneto", R.drawable.magneto, R.drawable.magneto_dial));
        characterDatas.put("Constrictor", new CharacterData("Constrictor", R.drawable.constrictor, R.drawable.constrictor_dial));
        characterDatas.put("Loki", new CharacterData("Loki", R.drawable.loki, R.drawable.loki_dial));
        characterDatas.put("Doctor Doom", new CharacterData("Doctor Doom", R.drawable.doctor_doom, R.drawable.dr_doom_dial));
        characterDatas.put("Moonstone", new CharacterData("Moonstone", R.drawable.moonstone, R.drawable.moonstone_dial));
        characterDatas.put("Kang", new CharacterData("Kang", R.drawable.kang, R.drawable.kang_dial));
        characterDatas.put("Superior Spider-Man", new CharacterData("Superior Spider-Man", R.drawable.superior_spider_man, R.drawable.superior_spiderman_dial));
        characterDatas.put("Boomerang", new CharacterData("Boomerang", R.drawable.boomerang, R.drawable.boomerang_dial));
        characterDatas.put("Howard the Duck", new CharacterData("Howard the Duck", R.drawable.howard_the_duck, R.drawable.howard_the_duck_dial));
        characterDatas.put("Emma Frost", new CharacterData("Emma Frost", R.drawable.emma_frost, R.drawable.emma_frost_dial));
        characterDatas.put("Hank Pym", new CharacterData("Hank Pym", R.drawable.hank_pym, R.drawable.hank_pym_dial));
        characterDatas.put("Rescue", new CharacterData("Rescue", R.drawable.rescue, R.drawable.rescue_dial));
        characterDatas.put("Black Bolt", new CharacterData("Black Bolt", R.drawable.black_bolt, R.drawable.black_bolt_dial));
        characterDatas.put("Fantomex", new CharacterData("Fantomex", R.drawable.fantomex, R.drawable.fantomex_dial));
        characterDatas.put("Red Hulk", new CharacterData("Red Hulk", R.drawable.red_hulk, R.drawable.red_hulk_dial));
        characterDatas.put("Black Knight", new CharacterData("Black Knight", R.drawable.black_knight, R.drawable.black_knight_dial));
        characterDatas.put("Black Panter", new CharacterData("Black Panter", R.drawable.black_panther, R.drawable.black_panther_dial));
        characterDatas.put("Captain America", new CharacterData("Captain America", R.drawable.captain_america, R.drawable.captain_america_dial));
        characterDatas.put("Cyclops", new CharacterData("Cyclops", R.drawable.cyclops, R.drawable.cyclops_dial));
        characterDatas.put("Gamora", new CharacterData("Gamora", R.drawable.gamora, R.drawable.gamora_dial));
        characterDatas.put("Hawkeye", new CharacterData("Hawkeye", R.drawable.hawkeye, R.drawable.hawkeye_dial));
        characterDatas.put("Kate Bishop", new CharacterData("Kate Bishop", R.drawable.kate_bishop, R.drawable.kate_bishop_dial));
        characterDatas.put("Mr. Fantastic", new CharacterData("Mr. Fantastic", R.drawable.mr_fantastic, R.drawable.mr_fantastic_dial));
        characterDatas.put("Quake", new CharacterData("Quake", R.drawable.quake, R.drawable.quake_dial));
        characterDatas.put("War Machine", new CharacterData("War Machine", R.drawable.war_machine, R.drawable.war_machine_dial));
        characterDatas.put("Lizard", new CharacterData("Lizard", R.drawable.lizard, R.drawable.lizard_dial));
        characterDatas.put("Kraven the Hunter", new CharacterData("Kraven the Hunter", R.drawable.kraven, R.drawable.kraven_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getHeroInfiltrator() {
        characterDatas = new TreeMap<>();
        characterDatas.put("Satana", new CharacterData("Satana", R.drawable.satana, R.drawable.satana_dial));
        characterDatas.put("Elektra", new CharacterData("Elektra", R.drawable.elektra, R.drawable.elektra_dial));
        characterDatas.put("Enchantress", new CharacterData("Enchantress", R.drawable.enchantress, R.drawable.enchantress_dial));
        characterDatas.put("Winter Soldier", new CharacterData("Winter Soldier", R.drawable.winter_soldier, R.drawable.winter_soldier_dial));
        characterDatas.put("Falcon", new CharacterData("Falcon", R.drawable.falcon, R.drawable.falcon_dial));
        characterDatas.put("Star-Lord", new CharacterData("Star-Lord", R.drawable.star_lord, R.drawable.starlord_dial));
        characterDatas.put("Ultimate Spider-Man", new CharacterData("Ultimate Spider-Man", R.drawable.ultimate_spider_man, R.drawable.ultimate_spiderman_dial));
        characterDatas.put("Ant-Man", new CharacterData("Ant-Man", R.drawable.ant_man, R.drawable.ant_man_dial));
        characterDatas.put("Psylocke", new CharacterData("Psylocke", R.drawable.psylocke, R.drawable.psylocke_dial));
        characterDatas.put("Spiral", new CharacterData("Spiral", R.drawable.spiral, R.drawable.spiral_dial));
        characterDatas.put("Agent Venom", new CharacterData("Agent Venom", R.drawable.agent_venom, R.drawable.agent_venom_dial));
        characterDatas.put("Victor Mancha", new CharacterData("Victor Mancha", R.drawable.victor_mancha, R.drawable.victor_mancha_dial));
        characterDatas.put("A-Bomb", new CharacterData("A-Bomb", R.drawable.a_bomb, R.drawable.a_bomb_dial));
        characterDatas.put("Shanna", new CharacterData("Shanna", R.drawable.shanna, R.drawable.shanna_dial));
        characterDatas.put("Morbius", new CharacterData("Morbius", R.drawable.morbius, R.drawable.morbius_dial));
        characterDatas.put("Black Cat", new CharacterData("Black Cat", R.drawable.black_cat, R.drawable.black_cat_dial));
        characterDatas.put("Black Widow", new CharacterData("Black Widow", R.drawable.black_widow, R.drawable.black_widow_dial));
        characterDatas.put("Fandral", new CharacterData("Fandral", R.drawable.fandral, R.drawable.fandral_dial));
        characterDatas.put("Gambit", new CharacterData("Gambit", R.drawable.gambit, R.drawable.gambit_dial));
        characterDatas.put("Invisible Woman", new CharacterData("Invisible Woman", R.drawable.invisible_woman, R.drawable.invisible_woman_dial));
        characterDatas.put("Kitty Pryde", new CharacterData("Kitty Pryde", R.drawable.kitty_pryde, R.drawable.kitty_pryde_dial));
        characterDatas.put("Medusa", new CharacterData("Medusa", R.drawable.medusa, R.drawable.medusa_dial));
        characterDatas.put("Nightcrawler", new CharacterData("Nightcrawler", R.drawable.nightcrawler, R.drawable.nightcrawler_dial));
        characterDatas.put("Spider-Man", new CharacterData("Spider-Man", R.drawable.spider_man, R.drawable.spiderman_dial));
        characterDatas.put("Tigra", new CharacterData("Tigra", R.drawable.tigra, R.drawable.tigra_dial));
        characterDatas.put("Wasp", new CharacterData("Wasp", R.drawable.wasp, R.drawable.wasp_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getHeroGeneralist() {
        characterDatas = new TreeMap<>();
        characterDatas.put("Taskmaster", new CharacterData("Taskmaster", R.drawable.taskmaster, R.drawable.taskmaster_dial));
        characterDatas.put("Destroyer", new CharacterData("Destroyer", R.drawable.destroyer, R.drawable.destroyer_dial));
        characterDatas.put("Mockingbird", new CharacterData("Mockingbird", R.drawable.mockingbird, R.drawable.mockingbird_dial));
        characterDatas.put("Silk", new CharacterData("Silk", R.drawable.silk, R.drawable.silk_dial));
        characterDatas.put("Red She-Hulk", new CharacterData("Red She-Hulk", R.drawable.redshehulk, R.drawable.redshehulk_dial));
        characterDatas.put("Angel", new CharacterData("Angel", R.drawable.angel, R.drawable.angel_dial));
        characterDatas.put("Spider-Man Noir", new CharacterData("Spider-Man Noir", R.drawable.spider_man_noir, R.drawable.spiderman_noir_dial));
        characterDatas.put("Colleen Wing", new CharacterData("Colleen Wing", R.drawable.colleen_wing, R.drawable.colleen_wing_dial));
        characterDatas.put("Punisher", new CharacterData("Punisher", R.drawable.punisher, R.drawable.punisher_dial));
        characterDatas.put("Moon Knight", new CharacterData("Moon Knight", R.drawable.moon_knight, R.drawable.moon_knight_dial));
        characterDatas.put("Beast", new CharacterData("Beast", R.drawable.beast, R.drawable.beast_dial));
        characterDatas.put("Rogue", new CharacterData("Rogue", R.drawable.rogue, R.drawable.rogue_dial));
        characterDatas.put("Spider-Man Noir", new CharacterData("Spider-Man Noir", R.drawable.spider_man_noir, R.drawable.spiderman_noir_dial));
        return characterDatas;
    }

    //Lockboxes
    public static Map<String, CharacterData > getLockBoxesBruiser(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Juggernaut", new CharacterData("Juggernaut", R.drawable.juggernaut, R.drawable.juggernaut_dial));
        characterDatas.put("Sandman", new CharacterData("Sandman", R.drawable.sandman, R.drawable.sandman_dial));
        characterDatas.put("Hyperion", new CharacterData("Hyperion", R.drawable.hyperion, R.drawable.hyperion_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getLockBoxesBlaster(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Thane", new CharacterData("Thane", R.drawable.thane, R.drawable.thane_dial));
        characterDatas.put("Fixer", new CharacterData("Fixer", R.drawable.fixer, R.drawable.fixer_dial));
        characterDatas.put("Hybrid", new CharacterData("Hybrid", R.drawable.hybrid, R.drawable.hybrid_dial));
        characterDatas.put("Blizzard", new CharacterData("Blizzard", R.drawable.blizzard, R.drawable.blizzard_dial));
        characterDatas.put("Baron Mordo", new CharacterData("Baron Mordo", R.drawable.baron_mordo, R.drawable.baron_mordo_dial));
        characterDatas.put("Electro", new CharacterData("Electro", R.drawable.electro, R.drawable.electro_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getLockBoxesScrapper(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Omega Sentinel", new CharacterData("Omega Sentinel", R.drawable.omega_sentinel, R.drawable.omega_sentinel_dial));
        characterDatas.put("Sabretooth", new CharacterData("Sabretooth", R.drawable.sabretooth, R.drawable.sabretooth_dial));
        characterDatas.put("Avalanche", new CharacterData("Avalanche", R.drawable.avalanche, R.drawable.avalanche_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getLockBoxesInfiltrator(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Satana", new CharacterData("Satana", R.drawable.satana, R.drawable.satana_dial));
        characterDatas.put("Elektra", new CharacterData("Elektra", R.drawable.elektra, R.drawable.elektra_dial));
        characterDatas.put("Enchantress", new CharacterData("Enchantress", R.drawable.enchantress, R.drawable.enchantress_dial));
        characterDatas.put("Winter Soldier", new CharacterData("Winter Soldier", R.drawable.winter_soldier, R.drawable.winter_soldier_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getLockBoxesTactical(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Magneto", new CharacterData("Magneto", R.drawable.magneto, R.drawable.magneto_dial));
        characterDatas.put("Constrictor", new CharacterData("Constrictor", R.drawable.constrictor, R.drawable.constrictor_dial));
        characterDatas.put("Loki", new CharacterData("Loki", R.drawable.loki, R.drawable.loki_dial));
        characterDatas.put("Doctor Doom", new CharacterData("Doctor Doom", R.drawable.doctor_doom, R.drawable.dr_doom_dial));
        characterDatas.put("Moonstone", new CharacterData("Moonstone", R.drawable.moonstone, R.drawable.moonstone_dial));
        characterDatas.put("Kang", new CharacterData("Kang", R.drawable.kang, R.drawable.kang_dial));
        characterDatas.put("Superior Spider-Man", new CharacterData("Superior Spider-Man", R.drawable.superior_spider_man, R.drawable.superior_spiderman_dial));
        characterDatas.put("Boomerang", new CharacterData("Boomerang", R.drawable.boomerang, R.drawable.boomerang_dial));
        characterDatas.put("Howard the Duck", new CharacterData("Howard the Duck", R.drawable.howard_the_duck, R.drawable.howard_the_duck_dial));
        characterDatas.put("Lizard", new CharacterData("Lizard", R.drawable.lizard, R.drawable.lizard_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getLockBoxesGeneralist(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Taskmaster", new CharacterData("Taskmaster", R.drawable.taskmaster, R.drawable.taskmaster_dial));
        characterDatas.put("Destroyer", new CharacterData("Destroyer", R.drawable.destroyer, R.drawable.destroyer_dial));
        return characterDatas;
    }

    //SpecOP
    public static Map<String, CharacterData > getSpecOpBruiser(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Valkyrie", new CharacterData("Valkyrie", R.drawable.valkyrie, R.drawable.valkyrie_dial));
        characterDatas.put("Wonder Man", new CharacterData("Wonder Man", R.drawable.wonder_man, R.drawable.wonder_man_dial));
        characterDatas.put("Ares", new CharacterData("Ares", R.drawable.ares, R.drawable.ares_dial));
        characterDatas.put("Heimdall", new CharacterData("Heimdall", R.drawable.heimdall, R.drawable.heimdall_dial));
        characterDatas.put("Iceman", new CharacterData("Iceman", R.drawable.iceman, R.drawable.iceman_dial));
        characterDatas.put("Anti-Venom", new CharacterData("Anti-Venom", R.drawable.anti_venom, R.drawable.anti_venom_dial));
        characterDatas.put("Beta Ray Bill", new CharacterData("Beta Ray Bill", R.drawable.beta_ray_bill, R.drawable.beta_ray_bill_dial));
        characterDatas.put("Jessica Jones", new CharacterData("Jessica Jones", R.drawable.jessica_jones, R.drawable.jessica_jones));
        return characterDatas;
    }

    public static Map<String, CharacterData > getSpecOpBlaster(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Havok", new CharacterData("Havok", R.drawable.havok, R.drawable.havok_dial));
        characterDatas.put("Vision", new CharacterData("Vision", R.drawable.vision, R.drawable.vision_dial));
        characterDatas.put("Daimon Hellstrom", new CharacterData("Daimon Hellstrom", R.drawable.daimon_hellstrom, R.drawable.daimon_hellstrom));
        characterDatas.put("Nico Minoru", new CharacterData("Nico Minoru", R.drawable.nico_minoru, R.drawable.nico_minoru_dial));
        characterDatas.put("Cannonball", new CharacterData("Cannonball", R.drawable.cannonball, R.drawable.cannonball_dial));
        characterDatas.put("Crystal", new CharacterData("Crystal", R.drawable.crystal, R.drawable.crystal_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getSpecOpScrapper(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Magik", new CharacterData("Magik", R.drawable.magik, R.drawable.magik_dial));
        characterDatas.put("Ghost Rider", new CharacterData("Ghost Rider", R.drawable.ghost_rider, R.drawable.ghost_rider_dial));
        characterDatas.put("Ka-Zar", new CharacterData("Ka-Zar", R.drawable.kazar, R.drawable.kazar_dial));
        characterDatas.put("Blade", new CharacterData("Blade", R.drawable.blade, R.drawable.blade_dial));
        characterDatas.put("Chase Stein", new CharacterData("Chase Stein", R.drawable.chase_stein, R.drawable.chase_stein_dial));
        characterDatas.put("Spitfire", new CharacterData("Spitfire", R.drawable.spitfire, R.drawable.spitfire_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getSpecOpInfiltrator(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Falcon", new CharacterData("Falcon", R.drawable.falcon, R.drawable.falcon_dial));
        characterDatas.put("Star-Lord", new CharacterData("Star-Lord", R.drawable.star_lord, R.drawable.starlord_dial));
        characterDatas.put("Ultimate Spider-Man", new CharacterData("Ultimate Spider-Man", R.drawable.ultimate_spider_man, R.drawable.ultimate_spiderman_dial));
        characterDatas.put("Ant-Man", new CharacterData("Ant-Man", R.drawable.ant_man, R.drawable.ant_man_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getSpecOpGeneralist(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Mockingbird", new CharacterData("Mockingbird", R.drawable.mockingbird, R.drawable.mockingbird_dial));
        characterDatas.put("Silk", new CharacterData("Silk", R.drawable.silk, R.drawable.silk_dial));
        characterDatas.put("Red She-Hulk", new CharacterData("Red She-Hulk", R.drawable.redshehulk, R.drawable.redshehulk_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getSpecOpTactical(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Emma Frost", new CharacterData("Emma Frost", R.drawable.emma_frost, R.drawable.emma_frost_dial));
        characterDatas.put("Hank Pym", new CharacterData("Hank Pym", R.drawable.hank_pym, R.drawable.hank_pym_dial));
        characterDatas.put("Rescue", new CharacterData("Rescue", R.drawable.rescue, R.drawable.rescue_dial));
        characterDatas.put("Black Bolt", new CharacterData("Black Bolt", R.drawable.black_bolt, R.drawable.black_bolt_dial));
        return characterDatas;
    }

    //PvP

    public static Map<String, CharacterData > getPVPBruiser(){
        characterDatas = new TreeMap<>();
        characterDatas.put("X-23", new CharacterData("X-23", R.drawable.x_23, R.drawable.x_23_dial));
        characterDatas.put("Bishop", new CharacterData("Bishop", R.drawable.bishop, R.drawable.bishop_dial));
        characterDatas.put("Spider-Girl", new CharacterData("Spider-Girl", R.drawable.spider_girl, R.drawable.spidergirl_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getPVPBlaster(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Cable", new CharacterData("Cable", R.drawable.cable, R.drawable.cable_dial));
        characterDatas.put("Domino", new CharacterData("Domino", R.drawable.domino, R.drawable.domino_dial));
        characterDatas.put("Rocket Raccoon", new CharacterData("Rocket Raccoon", R.drawable.rocket_raccoon, R.drawable.rocket_raccoon_dial));
        characterDatas.put("Nova", new CharacterData("Nova", R.drawable.nova, R.drawable.nova_dial));
        characterDatas.put("Deathlok", new CharacterData("Deathlok", R.drawable.deathlok, R.drawable.deathlok_dial));
        characterDatas.put("Misty Knight", new CharacterData("Misty Knight", R.drawable.misty_knight, R.drawable.misty_knight_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getPVPScrapper(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Deadpool", new CharacterData("Deadpool", R.drawable.deadpool, R.drawable.deadpool_dial));
        characterDatas.put("Shatterstar", new CharacterData("Shatterstar", R.drawable.shatterstar, R.drawable.shatterstar_dial));
        characterDatas.put("Hogun", new CharacterData("Hogun", R.drawable.hogun, R.drawable.hogun_dial));
        characterDatas.put("Drax", new CharacterData("Drax", R.drawable.drax, R.drawable.drax_dial));
        characterDatas.put("Karnak", new CharacterData("Karnak", R.drawable.karnak, R.drawable.karnak_dial));
        characterDatas.put("Angela", new CharacterData("Angela", R.drawable.angela, R.drawable.angela_dial));
        //TODO: MANCA DIALOG IMAGE
        characterDatas.put("Hellcat", new CharacterData("Hellcat", R.drawable.hellcat, R.drawable.example_dialogue));
        return characterDatas;
    }

    public static Map<String, CharacterData > getPVPInfiltrator(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Psylocke", new CharacterData("Psylocke", R.drawable.psylocke, R.drawable.psylocke_dial));
        characterDatas.put("Spiral", new CharacterData("Spiral", R.drawable.spiral, R.drawable.spiral_dial));
        characterDatas.put("Agent Venom", new CharacterData("Agent Venom", R.drawable.agent_venom, R.drawable.agent_venom_dial));
        characterDatas.put("Victor Mancha", new CharacterData("Victor Mancha", R.drawable.victor_mancha, R.drawable.victor_mancha_dial));
        characterDatas.put("A-Bomb", new CharacterData("A-Bomb", R.drawable.a_bomb, R.drawable.a_bomb_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getPVPTactical(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Fantomex", new CharacterData("Fantomex", R.drawable.fantomex, R.drawable.fantomex_dial));
        characterDatas.put("Red Hulk", new CharacterData("Red Hulk", R.drawable.red_hulk, R.drawable.red_hulk_dial));
        characterDatas.put("Kraven the Hunter", new CharacterData("Kraven the Hunter", R.drawable.kraven, R.drawable.kraven_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getPVPGeneralist(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Angel", new CharacterData("Angel", R.drawable.angel, R.drawable.angel_dial));
        characterDatas.put("Spider-Man Noir", new CharacterData("Spider-Man Noir", R.drawable.spider_man_noir, R.drawable.spiderman_noir_dial));
        characterDatas.put("Colleen Wing", new CharacterData("Colleen Wing", R.drawable.colleen_wing, R.drawable.colleen_wing_dial));
        characterDatas.put("Punisher", new CharacterData("Punisher", R.drawable.punisher, R.drawable.punisher_dial));
        return characterDatas;
    }

    //Covert
    public static Map<String, CharacterData > getCovertBruiser(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Volstagg", new CharacterData("Volstagg", R.drawable.volstagg, R.drawable.volstagg_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getCovertBlaster(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Sunfire", new CharacterData("Sunfire", R.drawable.sunfire, R.drawable.sunfire_dial));
        characterDatas.put("Blizzard", new CharacterData("Blizzard", R.drawable.blizzard, R.drawable.blizzard_dial));
        characterDatas.put("Hybrid", new CharacterData("Hybrid", R.drawable.hybrid, R.drawable.hybrid_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getCovertScrapper(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Squirrel Girl", new CharacterData("Squirrel Girl", R.drawable.squirrel_girl, R.drawable.squirrel_girl_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getCovertGeneralist(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Moon Knight", new CharacterData("Moon Knight", R.drawable.moon_knight, R.drawable.moon_knight_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getCovertTactical(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Doctor Doom", new CharacterData("Doctor Doom", R.drawable.doctor_doom, R.drawable.dr_doom_dial));
        characterDatas.put("Howard the Duck", new CharacterData("Howard the Duck", R.drawable.howard_the_duck, R.drawable.howard_the_duck_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getCovertInfiltrator(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Shanna", new CharacterData("Shanna", R.drawable.shanna, R.drawable.shanna_dial));
        characterDatas.put("Morbius", new CharacterData("Morbius", R.drawable.morbius, R.drawable.morbius_dial));
        return characterDatas;
    }

    //Enemy

    //groupboss

    public static Map<String, Biopic > getBiopic() {

        biopics = new TreeMap<>();
        //bruiser
        biopics.put("Juggernaut", new Biopic("While exploring an ancient temple, Cain Marko came upon the" +
                " Crimson Gem of Cyttorak. Upon touching it, he was infused with the power of a god, " +
                "becoming an unstoppable human Juggernaut. He repeatedly sought revenge against his " +
                "step-brother Charles Xavier and the X-Men, though lately he has straddled the line " +
                "between hero and villain. Ultimately, Juggernaut serves nobody but Juggernaut."));

        biopics.put("Sandman", new Biopic("\n" +
                "William Baker used to be a small-time crook. After escaping from prison, he fled to an " +
                "irradiated beach near a nuclear testing facility. The radioactive sand fused with his body," +
                " allowing him to change shape, scatter and reform himself, and withstand almost any attack." +
                " Originally a prime member of Spider-Man’s gallery of rogues, the Sandman has recently " +
                "attempted to overcome his inglorious past and become a hero."));

        biopics.put("Hyperion", new Biopic("When Hyperion was a child, he was sent to Earth as the last " +
                "survivor of another race known as the Eternals. Raised by his adoptive father as Marcus " +
                "Milton, he learned a strict set of moral codes to benefit society. When he grew old " +
                "enough, he became the heroic titan, Hyperion. But one day, the skies turned red, and " +
                "another Earth appeared in the sky. Even with all the other heroes of his Earth coming " +
                "together, Hyperion could not prevent the catastrophe. By the time both Earths were " +
                "about to touch, all that remained was Hyperion, struggling to keep them apart. The " +
                "two worlds broke, and with them, all of existence. The only thing that remained, the" +
                " only survivor once again, was Hyperion. Floating in a void, Hyperion was inadvertently" +
                " rescued by the scientists of A.I.M. who would imprison and experiment on him. But Hyperion" +
                " was rescued by the Avengers. Now, Hyperion hopes for a second chance to save this new " +
                "Earth he now calls home and a chance at a new beginning."));

        biopics.put("Volstagg", new Biopic("Known throughout Asgard for his great deeds (and even greater girth)," +
                " Volstagg the Voluminous is the heart of the Warriors Three. Though boastful and reckless, " +
                "Volstagg is tremendously loyal to his companions Hogun and Fandral, and he is fearless in " +
                "face of his enemies. At least when others are watching."));

        biopics.put("Valkyrie", new Biopic("The Asgardian Brunnhilde confronted Odin All-Father rather than" +
                " leave the body of her fallen friend. So impressed was Odin at her courage and strength " +
                "that he made her the Valkyrie, guide of the honored dead to Valhalla. Armed with Dragonfang," +
                " her indestructible sword, and riding her winged steed Aragorn, she is one of the greatest" +
                " warriors of Asgard, and a champion of Earth."));

        biopics.put("Wonder Man", new Biopic("In a bid to destroy the Avengers from within, Baron Zemo performed ionic energy experiments on a man named Simon Williams. The experiments succeeded beyond Zemo's wildest dreams, transforming Simon into a being of superhuman strength and durability. Simon was welcomed into the Avengers as Wonder Man and became a spy for HYDRA. Later, he threw off HYDRA's control, saving the Avengers and truly becoming one of them. While his nigh-invulnerability has let him overcome physical challenges with ease, he continues to struggle with the ethics of using his tremendous gifts, endeavoring to pressure his humanity in the face of his own immortality."));

        biopics.put("Ares", new Biopic("As the Olympian God of War, Ares is one of the most brutal and " +
                "fearsome warriors of all time. He is a genius-level military tactician and a master of " +
                "all weaponry, both ancient and modern. Though his half-brother Hercules may be stronger, " +
                "Ares is meaner, and he isn't shy about demonstrating it."));

        biopics.put("Heimdall", new Biopic("Brother of Sif and steadfast friend of Thor, Heimdall is the guardian" +
                " of the Bifrost Bridge and the eternal sentry of Asgard. His vision and hearing are so " +
                "sensitive that they border on omniscience, allowing him to perceive threats from all " +
                "across the Nine Worlds. Though statue-like in his demeanor, he is anything but idle, " +
                "and will not hesitate to use his considerable skills as a warrior to protect Asgard."));

        biopics.put("Iceman", new Biopic("The class clown of Xavier's School for Gifted Youngsters, Bobby Drake" +
                " is nonetheless a stalwart original member of the X-Men. His command of temperature allows him" +
                " to turn his body into organic ice, freeze atmospheric moisture into whatever object he desires," +
                " and launch punishingly cold projectiles at his enemies. Though he is hardly ever serious," +
                " Bobby's powers taken to their extreme rank him amongst the most powerful mutants on Earth."));

        biopics.put("Anti-Venom", new Biopic("As the original host of the Venom symbiote, Eddie Brock was one of " +
                "Spider-Man's greatest enemies. That changed when the symbiote was forcefully removed from Brock's " +
                "body. The leftover Venom particles in his bloodstream were transformed, bonding to his white blood" +
                " cells, becoming a symbiote unlike any before. Born again as Anti-Venom, he has all the strengths " +
                "of a symbiote with none of the weaknesses, plus the ability to cure any disease or poison. As " +
                "to whether Brock's hatred of Spider-Man has changed as well... that remains to be seen."));

        biopics.put("Beta Ray Bill", new Biopic("The Korbinites were attacked by Surtur's demons and forced to flee" +
                " their world. Enchanted to become their cyborg champion and protector, Beta Ray Bill encountered " +
                "Thor and proved himself worthy of Mjolnir. Granted the mighty Uru hammer Stormbreaker by Odin himself," +
                " Beta Ray Bill comes to the aid of all those in need without a moment's hesitation."));

        biopics.put("Jessica Jones", new Biopic("The same accident that left Jessica Jones in a coma and killed her parents" +
                " was also responsible for giving her amazing strength. Shortly after deciding to become a hero, she " +
                "became a victim of the Purple Man's mind control. Jessica eventually broke free from his control, but " +
                "remained traumatized by the long term experience. With her hero days behind her, Jessica opened Alias " +
                "Investigations and became a private detective, working with locals like Matt Murdock, Luke Cage and " +
                "Heroes for Hire. Jessica and Luke eventually turned a fling into a thing, and ended up married with " +
                "a daughter. Jessica has recently been kept busy helping Luke lead various teams like the Mighty Avengers."));

        biopics.put("X-23", new Biopic("Laura Kinney is a female clone of Wolverine, conditioned to be the ultimate living " +
                "weapon by a mysterious organization known as The Facility. She possesses adamantium claws in her hands and " +
                "feet, and her mutant healing factor makes her extremely difficult to kill. Having escaped the abuse of her " +
                "creators, X-23 has found a new home at the Avengers Academy, where she has begun to determine the course " +
                "of her life."));

        biopics.put("Bishop", new Biopic("The \"M\" branded over Lucas Bishop's eye is a stark reminder of the apocalyptic" +
                " future he comes from. In his world, the Sentinels had imprisoned the entire mutant populace and set their" +
                " sights on the rest of humanity. Bishop traveled through time to prevent the same fate from befalling our" +
                " own timeline. with his mutant ability to absorb energy and redirect it into concussive blasts, he seems" +
                " well-equipped to succeed."));

        biopics.put("Spider-Girl", new Biopic("Anya Corazón, alias Spider-Girl, originates from the same universe as the " +
                "\"Superior\" Spider-Man. Anya was born in Mexico, but came with her father to the United States soon after " +
                "her mother died. She grew up in Brooklyn and developed an interest in gymnastics, until one day, she saw a " +
                "man being assaulted by a group of strange individuals. Anya jumped in to save the man's life but was fatally" +
                " wounded. The man, Miguel, turned out to be a part of a secret group called the Spider Society. He was also " +
                "a sorcerer, and he transferred some of his powers into Anya in order to save her life, gifting her with " +
                "incredible powers that manifested through a spider-shaped tattoo. Assisting the Spider Society for a time," +
                " Anya eventually returned her gifted powers, but she managed to maintain her incredible strength and agility." +
                " After a fight with the Kravinoff family, the former Spider-Woman, Julia Carpenter, was impressed with Anya " +
                "and how she handled the situation and decided to pass her old black costume to Anya who took on the mantle " +
                "of Spider-Girl."));

        biopics.put("Captain Britain", new Biopic("After narrowly escaping death, Brian Braddock was offered a choice by the" +
                " sorcerer Merlyn: the Amulet of Right or the Sword of Might. Lacking confidence in his ability as a warrior," +
                " Braddock chose the Amulet and became Captain Britain, the United Kingdom's greatest protector. Super-strong" +
                " and nearly invulnerable, Braddock shares the call to heroism with his twin sister Betsy, also known as Psylocke."));

        biopics.put("Colossus", new Biopic("Piotr Rasputin's power to transform his body into a nearly invulnerable organic" +
                " form of Osmium first appeared in adolescence. Coming to America at the urging of Professor X, he became " +
                "Colossus and has fought bravely despite his natural aversion to conflict and violence."));

        biopics.put("Gorgon", new Biopic("Gorgon is the cousin of Black Bolt and a member of the Inhuman Royal Family. " +
                "He is Black Bolt's bodyguard and trainer of all Inhumans recently exposed to the Terrigen Mists. " +
                "If ever an Inhuman is lost, Gorgon will find them and bring them home. With the release of the Terrigen" +
                " Mists across the world, Gorgon's responsibilities have grown with the increasing number of new Inhumans."));

        biopics.put("Groot", new Biopic("He is Groot...okay, but really Groot is the strangest member of the Guardians " +
                "of the Galaxy... and that's really saying something. A Floral Colossus with a three word vocabulary, he " +
                "is tremendously strong and nearly immortal. Even if he is blown to pieces, so long as just a twig survives" +
                " to be replanted, Groot will return. And he even provides refreshing shade on hot summer days."));

        biopics.put("Hercules", new Biopic("As the illegitimate son of Zeus, Hercules is one of the strongest heroes in" +
                " the world. Unlike his fellow demigod Thor, Hercules makes no secret of his love for wine, women, and " +
                "battle. Having bested countless monsters, gods, and villains, the Prince of Power now seeks anyone who" +
                " can give him a challenge... or a drink."));

        biopics.put("Hulk", new Biopic("Child prodigy Bruce Banner became a weapons researcher for the US Army, where he" +
                " was inadvertently exposed to the radiation of a prototype Gamma Bomb. This granted him the power to " +
                "transform into the nearly invulnerable Hulk -- but at the cost of suffering the consequences of the " +
                "Hulk's unthinking rages."));

        biopics.put("Molly Hayes", new Biopic("Molly Hayes is the youngest member of the Runaways, a group of young heroes" +
                " who ran away from home because their parents were super-villains with apocalyptic plans. When Molly's" +
                " abilities of super strength and endurance began to manifest, she saw it as the perfect opportunity " +
                "to wear a cool costume and become a vigilante super-hero with her friends. However, the constant " +
                "threat of being broken up by powered villains and heroes alike have caused Molly and the Runaways " +
                "to stay on the run."));

        biopics.put("She-Hulk", new Biopic("Crusading lawyer Jennifer Walters was Bruce Banner's cousin, and needed an " +
                "emergency transfusion of his blood after being shot. Along with Banner's blood, Jennifer received " +
                "his ability to transform into a green-skinned juggernaut, and the She-Hulk was born."));

        biopics.put("Spider-Gwen", new Biopic("\n" +
                "Gwendolyne Stacy comes from a universe where she was bitten by a radioactive spider instead of Peter " +
                "Parker. Like Spider-Man, Gwen initially used her powers for financial gain by becoming a professional" +
                " drummer while maintaining a secret identity as “Spider-Woman” and drumming off to the side in her " +
                "friends’ band, “The Mary Janes.” The Peter Parker of this Earth was bullied quite often, and Gwen " +
                "often came to his defense, causing Peter to develop an inferiority complex. After Gwen revealed " +
                "to him that she was Spider-Woman, Peter desired to be special like Gwen and created a serum which" +
                " turned him into that universe's version of the Lizard. The serum causes Peter to go mad, and Gwen" +
                " is forced to fight her friend. Due to the serum, Peter dies in the middle of the battle, and " +
                "Spider-Woman is falsely accused of his murder and is on the run from the authorities. Soon after," +
                " Gwen is pulled into the fight against the Inheritors, which spans across the entire Spider-Verse."));

        biopics.put("Thing", new Biopic("\n" +
                "Reed Richards needed someone to pilot his experimental spaceship, and he asked his college roommate, " +
                "Ben Grimm. The Yancy Street tough-guy turned jet pilot agreed, and when the ship was struck by as cosmic" +
                " ray burst, Grimm became the stone-skinned orange Thing, and one of the Fantastic Four."));

        biopics.put("Thor", new Biopic("Exiled to Midgard by his father Odin, the Norse god of thunder, Thor walks among humanity to learn humility. It's not an easy lesson for him, especially not when he's practically invincible and armed with the divine hammer Mjolnir. A founding member of the Avengers, he fights a constant battle with his trickster half-brother Loki."));
        biopics.put("Thundra", new Biopic("Thundra is one of the strongest women in the world, and the greatest warrior in her own world: an advanced, female-dominated alternate reality. She first came to our universe to challenge the strongest male, in order to prevent her reality from being erased. Though her prime allegiance is to her planet, she has been a steadfast ally of the Fantastic Four, as well as a founding member of the new Lady Liberators."));
        //blaster
        biopics.put("Thane", new Biopic("This mysterious being appeared during Thanos' invasion of Earth. What he is and where he came from remains to be seen, but one thing is for certain: he holds tremendous power in his hands."));
        biopics.put("Fixer", new Biopic("Paul Norbert Ebersol is an intuitive genius. Specializing at creating deadly weapons, electronics, and mechanical devices, he became the supervillain known as Fixer seeking a challenge. Recently, his time as a supervillain has begun to bore him, or so he claims. One can never know if they are truly dealing with the real Fixer or a duplicate."));
        biopics.put("Hybrid", new Biopic("Scott Washington was a Guardsman at the Vault, protecting a unique science experiment: the four offspring of the symbiotic called Venom. After his brother was killed and he was paralysed in a gang shooting, the symbiotes found him and bonded with him. Calling himself Hybrid, he now seeks vengeance against criminals of all kinds."));
        biopics.put("Blizzard", new Biopic("During his years working for Hammer Industries as a hired goon, Donald Gill had a troubled conscience. He had access to the powerful 'Blizzard Battlesuit', which could create blasts of intense cold, walls of ice, and other chilling effects, but he did not want to be used as a cog in a life of crime. He wanted to belong to a team and help those around him. He had been given opportunities to reform in the past, including a brief run with The Thunderbolts, but it was a recent encounter with Chase Stein which created the possibility of working with S.H.I.E.L.D."));
        biopics.put("Baron Mordo", new Biopic("With all the training of Dr. Strange and none of the morality, Baron Mordo is a fearsome master of the arcane. Trained by the Ancient One, Mordo had an unquenchable lust for power. The Ancient One rejected Mordo as his successor and trained Stephen Strange to be the Sorcerer Supreme. Jealous, Mordo pursued new opportunities to increase his power, often in conflict with Dr. Strange, and eventually became a servant of Dormammu. After attempting to usurp Dormammu, Mordo was obliterated by the Mindless Ones. Resurrected for a dark purpose by Umar, the twin sister of Dormammu, and freed by his archenemy, Dr. Strange, Mordo now serves as Strange's ally while their goals are aligned, but for how long?"));
        biopics.put("Havok", new Biopic("As a child, Alex Summers was separated from his family (his brother Scott would later become the hero Cyclops) and unknowingly raised as Mr. Sinister's Pawn to take advantage of Alex's latent mutant powers. Havok struggled for years to control his ability to absorb cosmic radiation and turn it into powerful plasma blasts. His immense power, combined with his standoffish attitude, have often put him at odds with his brother and the rest of the X-Men; but Havok has remained a proven ally to the heroes' cause."));
        biopics.put("Vision", new Biopic("Ultron created his \"vision of the future\" as an android with the ability to modify his density, becoming either intangible or super-strong at a moment's notice. With the help of S.H.I.E.L.D., Vision broke free from his evil creator and joined the Avengers. Despite his analytical mind and artificial origins, he has proven himself to be a defender of humanity in all respects."));
        biopics.put("Daimon Hellstrom", new Biopic("Seeking to acquire influence on Earth, the demon lord Marduk Kurios sired a son with a human woman. That son became Daimon Hellstrom, who rejected his father's plans, traveled to the infernal realms himself, and stole his father's Netheranium trident, which allowed him to tap into his own vast mystical abilities. In order to control the dark side of his heritage, Daimon became an expert in sorcery and the occult, as well as a powerful warrior in the fight against Demonkind."));
        biopics.put("Nico Minoru", new Biopic("The Pride was an organization of six supervillain married couples, dedicated to the destruction of all of humanity... except for their own children. Those children would prove to be their undoing, becoming a group of young heroes known as the Runaways. The leader of the Runaways is Nico Minoru, daughter of two evil sorcerors, and a powerful magician in her own right. She wields the Staff of One, a mystical weapon which allows its wielder to cast almost any spell they can imagine... but only once."));
        biopics.put("Cannonball", new Biopic("Sam Guthrie is a mutant with the ability to generate and release thermo-chemical energy through his body, transforming into a virtually invulnerable human rocket. While he is well-known as a founding member of the New Mutants, he has since brought his courage and sense of justice to many heroic teams."));
        biopics.put("Crystal", new Biopic("Always more hospitable to outsiders than her sister Medusa, Crystallia Amaquelin has often acted as a liason to the world beyond Attilan. Able to bend the elemental forces of water, earth, fire and air, Crystal has been a valuable asset not only to the Inhuman Royal Family, but also as a member of the Fantastic Four and Avengers."));
        biopics.put("Cable", new Biopic("Cyclops sent his only son into the future in an attempt to save him from the techno-organic virus consuming his body. That child became Cable, a hardened half-robotic mercenary, who came back to the present to prevent the apocalyptic history he lived through. Cable has tremendous psionic powers, though he prefers to solve problems the simple way: with bullets."));
        biopics.put("Domino", new Biopic("Neena Thurman was genetically modified in a top-secret government breeding program, one of only two individuals to survive the process. After she was freed by a religious cult called the Armajesuits, Neena became the mercenary known as Domino. Her skill with firearms and her mutant powers of probability manipulation make for a potent combination."));
        biopics.put("Rocket Raccoon", new Biopic("Rocket Raccoon was genetically engineered by robots to oversee an insane asylum. After fighting an army of robotic clowns lead by a mole and being kidnapped by asparagus people, he signed on to the Guardians of the Galaxy, which is when things started to get weird. But Rocket takes comfort from the friendship of his fellow Guardians, particularly Groot. And from his guns. His many, many guns."));
        biopics.put("Nova", new Biopic("Sam Alexander grew up thinking that his dad was a drunk and a liar; it turns out only the first was true. Awakened one night by a green assassin and a talking raccoon, Sam learned that his dad's tales of being a space adventurer were all true and that he had gone missing! With evil on the move, Rocket and Gamora quickly trained Sam to be the universe's last remaining Nova!"));
        biopics.put("Deathlok", new Biopic("Henry Hayes was a combat medic in the U.S. Army who lost his leg in a suicide bomber attack. The Biotek corporation gave him a new synthetic leg, but unbeknownst to Henry, they added far more than just a new leg. Biotek had turned Henry into a Deathlok, a cyborg assassin. Using a trigger word to control Henry, they sent him on several special operations, wiping his memory after each mission. With the help of S.H.I.E.L.D. and Henry's sympathetic handler, Deathlok has managed to break free of his mind control and seeks to put an end to Biotek."));
        biopics.put("Misty Knight", new Biopic("Police officer Mercedes \"Misty\" Knight, a strong woman with a strong sense of justice, lost her arm while in the line of duty. Her heroism was noticed by Tony Stark who arranged to replace her arm with a weaponized prosthetic. Facing a desk job when she returned to the force, she formed Nightwing Restorations, a private investigation company with Colleen Wing. Misty took the job s that most would avoid, often teaming up with Iron Fist and Luke Cage, and eventually running Heroes for Hire."));
        biopics.put("Sunfire", new Biopic("Shiro Yoshida was raised by his xenophobic uncle to be a mutant weapon against America. When the scheme was thwarted by the X-Men, Shiro put aside his distrust to join them. Though a hard man to befriend, Sunfire's arrogance is deserved: he can convert radiation into directed energy, allowing him to fly and project blasts of superheated plasma."));
        biopics.put("Amazing Spider-Woman", new Biopic("In an alternate reality, Peter Parker married Mary Jane Watson and had a daughter, May \"Mayday\" Parker. Inheriting her father's powers, Mayday donned Ben Reilly's old costume in order to confront the new Green Goblin. Against her parents' initial misgiving, she continued being a superhero. After her father's death at the hand of the Inheritors, May rechristened herself the Amazing Spider-Woman, continuing on with the tradition that with great power comes great responsibility."));
        biopics.put("Doctor Voodoo", new Biopic("After twelve years in America studying psychology, Jericho Drumm returned to his homeland of Haiti to help his brother Daniel fight an evil sorceror. As Daniel lay dying, he made Jericho promise to take up the ways of his ancestors and avenge him. Now called Dr. Voodoo, Jericho's knowledge of the mystic arts rivals that of Dr. Strange, and he has held the mantle of Sorceror Supreme when Strange was unable to."));
        biopics.put("Dr. Strange", new Biopic("Founder of the Defenders and one-time Sorcerer Supreme, Stephen Strange is still among the most powerful magicians on Earth. He has dedicated his life to the fight against demonic incursions from other realms, especially Dormammu's Dark Dimension."));
        biopics.put("Human Torch", new Biopic("Teenage rebel Johnny Storm was bombarded with cosmic rays during the fateful voyage of Reed Richards' spacecraft that created the Fantastic Four, becoming the Human Torch. He can transform his body into a superheated plasma and project shaped flames from any part of himself. He can also fly and control temperatures in his immediate area. His sister, Sue Storm, is the Invisible Woman."));
        biopics.put("Iron Man", new Biopic("Visionary, playboy, billionaire, Tony Stark is one of the founding Avengers and - thanks to the constantly evolving Iron Man armor - one of the more formidable combat assets in S.H.I.E.L.D.'s arsenal. His cynical demeanor disguises a deep belief in himself and the power of the human mind to invent its way out of problems."));
        biopics.put("Karolina Dean", new Biopic("Karolina Dean used to think she was allergic to penicillin because of the medical identification bracelet her parents forced her to wear. It turned out she was actually an alien from outer space and her parents used the bracelet as an inhibitor of her true Majesdanian energy manipulating powers. It also turned out her parents were evil space invaders and members of a supervillain group called The Pride. Not wanting to be part of her parent's plans, Karolina joined with the Runaways to fight against The Pride's plans for world domination."));
        biopics.put("Ms. Marvel", new Biopic("Air Force officer Carol Danvers was caught in an explosion with the alien Mar-Vell. She survived and found that her DNA had combined with his to give her the ability to fly and the power to absorb and redirect practically any amount of energy."));
        biopics.put("Phoenix", new Biopic("One of the original X-Men, Jean Grey has developed her native telepathic and telekinetic abilities to unheard-of levels as a result of her bonding with the Phoenix Force. As the avatar of that cosmic power, she has attained control over time and space, and can even resurrect the dead. The true extent of her powers has yet to be discovered."));
        biopics.put("Scarlet Witch", new Biopic("An orphan raised with her twin brother Quicksilver, Wanda Maximoff possesses a unique combination of mutant and magical powers. When persecuted for her probability-changing mutant abilities, the twins sought refuge with the Brotherhood of Evil Mutants, unaware that Magneto was their father. Unhappy at being a villain, Wanda convinced her brother that they should join the Avengers to redeem themselves. Where the Scarlet Witch goes, chaos follows."));
        biopics.put("Storm", new Biopic("Orphaned as a young child in Egypt, Ororo Munroe traveled Africa as a young woman, when her powers over the weather began to develop and she joined the X-Men. She and T'Challa, the Black Panther, jointly ruled the ancient African kingdom of Wakanda until its destruction."));
        biopics.put("Elsa Bloodstone", new Biopic("Elsa Bloodstone was only a toddler when her father abandoned her with her mother. Elsa didn't learn why until many years later when she heard of his death and came to settle his estate. Learning that her father was a nearly immortal monster-hunter, Elsa inherited a choker with a portion of her father's Bloodgem, which granted both Elsa and her father with incredible powers which she used to train and take on her father's mantle as a monster-hunter. Elsa is now the expert when it comes to the supernatural and the things that go bump in the night. Curiously, a recent run-in with the Beyond Corporation has caused Elsa to question the truth about her own past."));
        biopics.put("Electro", new Biopic("Maxwell Dillion was an unambitious man working as lineman for the local power company. When one of his workers was knocked unconscious at the top of an utility pole, Max only agreed to save him as long as he was paid for it. Saving the other lineman, Max was suddenly struck by lightning, awakening the power to channel electricity. Realizing he could use these powers for his own selfish goals, he dubbed himself Electro and turned to a life of crime, often conflicting with the Amazing Spider-Man, As a founding member of the Sinister Six, Electro is considered one of the Webhead's deadliest foes. Under an arrangement by Nick Fury, Electro was apprehended and is now working with S.H.I.E.L.D. to aid against the Worthy and the Incursion crisis."));
        //scrapper
        biopics.put("Omega Sentinel", new Biopic("Formerly a detective in the Indian National Police, Karima Shapandar was abducted and implanted with Sentinel technology and weapons, turning her into an anti-mutant sleeper agent. Known as the Omega Sentinel, she fought the Avengers until her human mind was restored to her by Tony Stark. She now fights on the side of the Avengers, hoping to reclaim ownership of her destiny."));
        biopics.put("Sabretooth", new Biopic("Though Victor Creed's mutant healing factor and claws may resemble those of Wolverine, the comparison ends there. Sabretooth is feral, bloodthirsty, and utterly without humanity. These qualities served him well in the Weapon X program, where he and Wolverine forged their mutual hatred. Sabretooth now works for S.H.I.E.L.D., though not by choice; the bomb in his head, implanted by an unknown organization, is the only thing keeping him from killing everyone around him."));
        biopics.put("Avalanche", new Biopic("One of the longest-serving members of the Brotherhood of Mutants, Dominikos Petrakis can generate vibrating waves from his hands and violently shake apart inorganic matter."));
        biopics.put("Magik", new Biopic("Abducted into the demonic realm of the Limbo as a child, Illyana Rasputin eventually came to rule it through her mutant powers of teleportation and her gift for sorcery. Though she has friends in the X-Men, especially her brother Colossus, she will always carry a piece of hell with her."));
        biopics.put("Ghost Rider", new Biopic("To save his adopted father, Johnny Blaze made a pact with the demon Mephisto. In return, the motorcycle stuntman would become Mephisto's emissary, the Spirit of Vengeance: the Ghost Rider. With his living chains, hellfire, and supernatural strength, Ghost Rider is the bane of all who cause others pain."));
        biopics.put("Ka-Zar", new Biopic("Lord Robert Plunder, with his eldest son, Kevin Plunder, fled to the Savage Land to escape those seeking to exploit its rare deposits of Vibranium. After Lord Plunder was killed by the native Maa-Gor tribe, the same fate seemed to be in store for Kevin until he was rescued by Zabu, the last of a species of saber-toothed tiger. The two formed an empathic bond and became legendary to the denizens of the Savage Land. Kevin was given the name of Ka-Zar, which means \"son of the tiger,\" and has allied with many heroes that have found themselves lost in the Savage Land."));
        biopics.put("Blade", new Biopic("Eric Brooks was born an orphan. His mother was murdered during child birth, fed upon by a vampire. This act made Eric into a Dhampir, half-man and half-vampire. Gifted with all of a vampire's gifts and none of their weaknesses except for their thirst for blood, Eric swore to avenge his mother's death and became Blade. Trained as a vampire hunter, Blade hunts the undead lords of the night and seeks to kill the Lord of the Vampires, putting them all to rest."));
        biopics.put("Chase Stein", new Biopic("Chase Stein was an average high school student who was good at sports and even better at slacking off, much to the chagrin of his genius-level inventor parents. Chase and his friends ran away from home when they found out that their parents were part of a murderous super villain group known as The Pride. While investigating his parent’s workshop, Chase came across many of his parent’s inventions, including a pair of X-Ray Goggles and a set of weaponized Fistigons. A while later, Chase’s girlfriend, Gertrude Yorkes, died in his arms… twice, bestowing upon him her Empathic Link with Old Lace, a genetically engineered dinosaur from the 87th century. They fight crime!"));
        biopics.put("Spitfire", new Biopic("After being bitten by a vampire, Jacqueline Falsworth required a transfusion of artificial blood to save her life. The combination of artificial blood and the vampire bite granted her super speed, which she used to her advantage while working with the Invaders. Many years later, she was grievously wounded and given a second transfusion which once again reacted with the old vampire bite, granting her the regenerative powers, claws, and fangs of a vampire but with none of the normal vampiric weaknesses. Embracing her new life as a part-vampire, part-android, part-human, Spitfire seeks her place in the world as a member of MI:13."));
        biopics.put("Deadpool", new Biopic("s this an interrogation? I bet you want me to tell you that I am a wise-cracking mercenary with a regenerative healing factor - basically a better version of Wolverine. Or you want me to say I have a keen sense of fashion and a gorgeous face. Well I'm not going to! This 'Merc With a Mouth' is keeping his mouth shut this time!"));
        biopics.put("Shatterstar", new Biopic("A refugee from an alien dimension, Shatterstar was genetically engineered to excel at gladiatorial battles for the entertainment of his creators. He broke free of his slavery and escaped to this universe, where he became a member of X-Factor. His mastery of hand-to-hand combat is enhanced by his mutant ability to convert sonic waves into vibratory energy."));
        biopics.put("Hogun", new Biopic("Hogun the Grim finds little to smile about. With his homeland destroyed and his people slain, he wandered the Nine Realms until he eventually came to reside in Asgard. There he found lifelong friends in the form of Volstagg the Voluminous and Fandral the Dashing. Together, they form the Warriors Three, Asgard's most steadfast defenders and close allies of Thor."));
        biopics.put("Drax", new Biopic("Arthur Douglas witnessed Thanos' first visit to Earth and paid for it with his life. When Kronos the Eternal created a powerful body to counter Thanos, Arthur's soul was instilled within it and he was reborn as Drax the Destroyer. Though renowned as a Guardian of the Galaxy, Drax's true allegiance lies with a single purpose: killing Thanos."));
        biopics.put("Karnak", new Biopic("After Karnak's older brother, Triton, was changed by the Terrigen Mists with undesired results, his parents begged to have Karnak avoid a similar transformation. Their request was granted, and Karnak was sent to his father's Tower of Wisdom to physically and mentally train. Karnak's honed skills allow him to spot and exploit any weakness of an opponent or structure. Using these martial skills, Karnak now serves Black Bolt and the Inhuman royal family to this day."));
        biopics.put("Angela", new Biopic("A long time ago, Asgard was at war with the Tenth Realm, Heven. In an attempt to blackmail Odin to surrender, the Queen of the Angels kidnapped Aldrif, Odin's first-born and heir to Asgard. Odin refused and witnessed the death of his infant daughter. Enraged, the All-Father banished all the Angels and sealed off Heven from the other Nine Realms. Unbeknownst to Odin and the Queen of the Angels, Aldrif survived and was raised, in secret, as a Huntress of Heven known as Angela the Wingless One, but recent events have revealed Angela's true parentage. Now shunned by the Angels and filled with an Angel's hate for Asgard, Angela seeks out a place for herself in the galaxy."));
        biopics.put("Squirrel Girl", new Biopic("At the humble beginning of her career, Doreen Green attempted to become Iron Man's sidekick. Afterwards, she quickly came into her own, becoming a legendary icon of superhuman power. Though her powers of agility and command over squirrels may seem unimpressive to the uneducated eye, she's proven herself one of the most powerful warriors in the world, having easily defeated Wolverine, Deadpool, Dr. Doom, Terrax, and even Thanos."));
        biopics.put("Daredevil", new Biopic("Blinded by radioactive material when he was young, Matt Murdock nevertheless went on to become a skillful lawyer. As Daredevil, he puts his superhumanly enhanced senses and incredible martial-arts skills to service protecting the people of Hell's Kitchen and New York City."));
        biopics.put("Iron Fist", new Biopic("Orphaned as a boy, Danny Rand was granted the powers of the Iron Fist as he achieved adulthood. Often partnering with Luke Cage, he is a master of K'un L'un martial arts and can focus the superhuman energy of the Iron Fist to fight, protect, or heal."));
        biopics.put("Luke Cage", new Biopic("Wrongfully imprisoned, Carl Lucas agreed to be an experimental subject in exchange for an early parole. The experiment went haywire, but Lucas emerged from it as Luke Cage, with superhuman strength and density, skin that can deflect a bullet and peerless street-fighting abilities."));
        biopics.put("Quicksilver", new Biopic("Pietro Maximoff grew up an orphan with his twin sister, Scarlet Witch. Her wildly unpredictable powers have led Pietro to protect her throughout his life, with the help of his mutant ability of supersonic speed. At times as arrogant and manipulative as his father Magneto, Quicksilver has been both hero and villain, but has always tried to act in the best interests of his family."));
        biopics.put("Sif", new Biopic("The Asgardian warrior Sif is sister to Heimdall and close companion to Thor. She is a relentless warrior and has fought as Asgard's champion on numerous occasions. Sif is more closely tied to Midgard than any other Asgardian save Thor, and has come to love some humans. Her sword is able to cut through the barriers between dimensions."));
        biopics.put("Spider-Woman", new Biopic("Suffering from uranium poisoning as a young girl, Jessica Drew was at the point of death when her geneticist father injected her with a serum derived from spider venom. After decades in stasis as the serum took hold, Jessica reawoke into the contemporary world with tremendous powers. Initially trained by Hydra, she rebelled against them and joined S.H.I.E.L.D., where she's a valued asset."));
        biopics.put("Spider-Man 2099", new Biopic("In a future alternate reality, Miguel O'Hara worked for the Alchemax Corporation as a geneticist specializing in gene splicing. When an experiment to imprint new genetic codes went awry and resulted in the test subject's death, Miguel attempted to resign but was secretly drugged by Tyler Ston. the head of Alchemax. Now addicted to Rapture, Miguel would be forced to remain at Alchemax, since they were the sole manufacturer of the drug. Miguel decided to risk using the imprinting experimentation on himself in order to rid himself of the addiction instead of being Alchemax's puppet. However, an attempted sabotage during the experiment resulted in splicing Miguel's genetic codes with that of a spider, gaining abilities to the Spider-Man of the past. Repurposing an old costume for the Day of the Dead, Miguel became the Spider-Man of 2099, battling Alchemax and injustice in Nueva York."));
        biopics.put("Union Jack", new Biopic("When war threatened Britain, James Falsworth swore to defend his country, and donned the costume of Union Jack. He is skilled at all forms of combat, specializing in pistols, daggers, and other weapons of espionage. A close friend of Captain America, James has fought alongside Rogers to protect the British Isles on numerous occasions."));
        biopics.put("Wolverine", new Biopic("Born in 19th century Canada, James 'Logan' Howlett was a frail child. His mutant abilities did not manifest themselves until adolescence, after which he became a drifter and soldier. He drew the attention of several shadowy black-ops organizations, and suffered experimental procedures that bonded Adamantium to his skeleton and claws. Now a committed member of the X-Men, Wolverine carries a mortal grudge against Victor Creed, better known as Sabretooth."));
        biopics.put("Kamala Khan", new Biopic("Kamala Khan is a fangirl through and through. She idolizes every superhero, especially the former Ms. Marvel, Carol Danvers. One night, she snuck out of her house to go to a party. While returning home, a strange mist enveloped and formed a cocoon around her. She emerged from the cocoon and soon discovered that she had gained incredible powers. Kamala decided that with those powers came a great opportunity to become a new Super Hero. Taking her idol's name for herself, Kamala selflessly seeks to save those in need for no other reason than that it is the right thing to do."));
        biopics.put("Hellcat", new Biopic("Exploited childhood star, Patsy Walker, was inspired to become a Super Hero from a young age. She befriended both Beast and Moondragon who helped train Patsy in various martial arts and developed her latent psionic abilities. After which, she donned Tigra's old costume, and became known as Hellcat. While a member of the Defenders, she met Daimon Hellstrom. The two of them fell in love and were married until Patsy was killed by one of Daimon's adversaries, Deathurge. Her soul was trapped in Mephisto's realm, but she was saved and brought back to life by Hellstrom and Hawkeye's team of Thunderbolts. Patsy and Daimon separated soon afterwards, and Patsy traveled the world helping other heroes, eventually settling to work with her friend, She-Hulk, as a private investigator."));
        //tactical
        biopics.put("Magneto", new Biopic(""));
        biopics.put("Constrictor", new Biopic(""));
        biopics.put("Loki", new Biopic(""));
        biopics.put("Doctor Doom", new Biopic(""));
        biopics.put("Moonstone", new Biopic(""));
        biopics.put("Kang", new Biopic(""));
        biopics.put("Superior Spider-Man", new Biopic(""));
        biopics.put("Boomerang", new Biopic(""));
        biopics.put("Howard the Duck", new Biopic(""));
        biopics.put("Emma Frost", new Biopic(""));
        biopics.put("Hank Pym", new Biopic(""));
        biopics.put("Rescue", new Biopic(""));
        biopics.put("Black Bolt", new Biopic(""));
        biopics.put("Fantomex", new Biopic(""));
        biopics.put("Red Hulk", new Biopic(""));
        biopics.put("Black Knight", new Biopic(""));
        biopics.put("Black Panter", new Biopic(""));
        biopics.put("Captain America", new Biopic(""));
        biopics.put("Cyclops", new Biopic(""));
        biopics.put("Gamora", new Biopic(""));
        biopics.put("Hawkeye", new Biopic(""));
        biopics.put("Kate Bishop", new Biopic(""));
        biopics.put("Mr. Fantastic", new Biopic(""));
        biopics.put("Quake", new Biopic(""));
        biopics.put("War Machine", new Biopic(""));
        biopics.put("Lizard", new Biopic(""));
        biopics.put("Kraven the Hunter", new Biopic(""));
        //infiltrator
        biopics.put("Satana", new Biopic(""));
        biopics.put("Elektra", new Biopic(""));
        biopics.put("Enchantress", new Biopic(""));
        biopics.put("Winter Soldier", new Biopic(""));
        biopics.put("Falcon", new Biopic(""));
        biopics.put("Star-Lord", new Biopic(""));
        biopics.put("Ultimate Spider-Man", new Biopic(""));
        biopics.put("Ant-Man", new Biopic(""));
        biopics.put("Psylocke", new Biopic(""));
        biopics.put("Spiral", new Biopic(""));
        biopics.put("Agent Venom", new Biopic(""));
        biopics.put("Victor Mancha", new Biopic(""));
        biopics.put("A-Bomb", new Biopic(""));

        biopics.put("Shanna", new Biopic("Born in the jungles of Zaire, Shanna O'Hara learned to survive even in the " +
                "deadliest of environments. Her abilities only increased when she was resurrected with the life force" +
                " of the Savage Land, giving her the strength and speed of a dozen men."));

        biopics.put("Morbius", new Biopic("A brilliant biochemist, Dr. Michael Morbius suffered from a degenerative blood" +
                " disease that destroyed his red blood cells. Attempting to cure himself transformed him into a " +
                "pseado-vampire. As a living vampire, Morbius suffers from an insatiable thirst for blood that has forced" +
                " him into conflicts with many heroes, usually Spider-Man."));

        biopics.put("Black Cat", new Biopic(""));
        biopics.put("Black Widow", new Biopic(""));
        biopics.put("Fandral", new Biopic(""));
        biopics.put("Gambit", new Biopic(""));
        biopics.put("Invisible Woman", new Biopic(""));
        biopics.put("Kitty Pryde", new Biopic(""));
        biopics.put("Medusa", new Biopic(""));
        biopics.put("Nightcrawler", new Biopic(""));
        biopics.put("Spider-Man", new Biopic(""));
        biopics.put("Tigra", new Biopic(""));
        biopics.put("Wasp", new Biopic(""));
        //generalist
        biopics.put("Taskmaster", new Biopic("With his \"photographic reflexes\", Tony Masters can duplicate any fighting style he observes. His skills are quite literally the equal of Captain America, Hawkeye, and a multitude of other heroes and villains. After becoming one of the world's foremost mercenaries, he opened several \"academies\", training any aspiring villain with enough cash to enroll. Beyond that, little is known about Taskmaster; even he has forgotten much of his past, overwriting his memories with ever more combat data."));
        biopics.put("Destroyer", new Biopic("The Destroyer is a metal construct, crafted by a metal stronger than even Uru and empowered by the All-Father, Odin. A weapon forged against the Celestials, the Destroyer was lost for ages until Loki discovered it and used it to attack his hated half-brother Thor. It can only animate by assuming the life force of another, but once it does, it is nearly invincible. To say who's life-force resides in the armour currently...is a mystery."));
        biopics.put("Mockingbird", new Biopic("Barbara Morse was researching a way to recreate the Super Soldier Serum when she was recruited by S.H.I.E.L.D.. There, she trained to match her athleticism to her intelligence, Despite a lack of powers, her natural combat prowess has earned her a place on the Avenger's team."));
        biopics.put("Silk", new Biopic("Cindy Moon was a gifted child with an eidetic memory. Bitten by the same radioactive spider that created her world's Spider-Man, Cindy was locked away in a bunker to hide her from the Inheritors. Eventually, Spider-Man learned of her existence and sought her out only to draw the attention of the Inheritors and set of a chain of events that would affect the Spider-Verse."));
        biopics.put("Red She-Hulk", new Biopic("Betty Ross's life has been consumed by a battle between two men, her father and Bruce Banner. Even before the gamma accident turned Bruce Banner into the Hulk, Betty's attraction to him led to her father developing a disdain for the brilliant scientist. Despite her father's best efforts, Betty and Bruce were eventually married. But after her father was transformed into the Red Hulk and the Abomination tried to poison her, Betty and Bruce's relationship suffered, and they separated. Betty was later abducted and transformed into the Red She-Hulk by the Leader."));
        biopics.put("Angel", new Biopic("Warren Worthington III's life of wealth and privilege was changed forever when his mutation manifested and caused wings to sprout from his back. He joined Professor Xavier's School for Gifted Youngsters and became a founding member of the X-Men. Later, he was transformed by Apocalypse into the Horseman of Death, Archangel. To this day he carries the mental scars of Apocalypse's brainwashing, as well as the bio-metallic wings that replaced his feathers. Newly gifted with rejuvenating abilities, the Angel seeks to help his allies and all those unable to protect themselves."));
        biopics.put("Colleen Wing", new Biopic("After her mother was killed by an unknown assailant, Colleen Wing grew up with her grandfather in the northern mountains of Honshu. As the only grandchild, Colleen learned the arts of the samurai from her grandfather as per family tradition. Eventually Colleen made her home in New York City where she became involved in a gunfight. Saved by the policewoman, Misty Knight, Colleen quickly became fast friends with her savior. When Misty was injured in a terrorist attack, Colleen supported her friend and encouraged her to forge ahead. She joined Misty in creating Nightwing Restorations, and the two became known for their martial prowess as \"the Daughters of the Dragon.\" Together, Misty and Colleen clean the streets of New York, commonly teaming up with the Heroes for Hire, Luke Cage and Iron Fist."));;
        biopics.put("Punisher", new Biopic("Frank Castle swore a personal vendetta against all criminals after his family was killed by the mob. Neither hero nor villain, the Punisher is an expert at every form of combat known to man, fueled by an endless reservoir of cold fury, and completely unburdened by mercy or restraint."));
        biopics.put("Moon Knight", new Biopic("Marc Spector was brought back to life by Khonshu, Egyptian god of vengeance and the moon, to be an avatar of justice. At least, that's what Marc claims; leading multiple lives and guilt over his mercenary past have fractured his sanity on several occasions. What is undeniable is that his skills at martial arts, marksmanship, and crime-solving make Moon Knight a formiddable crusader against evil."));
        biopics.put("Beast", new Biopic("The name \"Beast\" may describe Dr. Hank McCoy's bestial exterior, but a man of rare wit lies behind the fur. For the times when his genius intellect isn't enough, Beast relies on his enhanced senses, superb agility, and unflagging courage."));
        biopics.put("Rogue", new Biopic("Nearly killing the first boy she kissed, Anna-Marie has always struggled to control her mutant gift. With the ability to absorb powers and memories at a cost, she ran away from home to avoid hurting others. She was taken in by Mystique who became a mother figure for the conflicted girl and recruited her to the Brotherhood of Evil Mutants. After permanently absorbing the powers of Ms. Marvel, she realized that she had inherited the hero's personality as it struggled for control of her mind. Unable to control her thoughts, and fearing for her own sanity, she turned to Professor X for his telepathic help, eventually joining the X-Men and redeeming herself."));
        biopics.put("Spider-Man Noir", new Biopic("In an alternate reality still in the midst of the Great Depression, the Goblin murdered Ben Parker for encouraging a strike on the local sweatshops. Seeking justice, Peter Parker became an investigative journalist in an attempt to expose the corruption in New York. One evening, Peter was investigating a warehouse where the Goblin's henchmen were housing stolen artifacts. An antient artifact of a spider statue broke open, releasing a swarm of spiders hidden within. One of these spiders bit Peter causing him to pass out and dream of an ancient spider god. When Peter came to, he discovered that he had been gifted with arachnid-like superpowers. Donning a costume using parts of his Uncle Ben's World War I airman uniform, he became the violent vigilante, The Spider-Man."));
        return biopics;
    }

}
