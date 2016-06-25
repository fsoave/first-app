package com.support.android.designlibdemo.character.character_activity;

import com.support.android.designlibdemo.R;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by fabio on 22/10/15.
 *
 * spero di fare una sola classe per tutti i personaggi
 */

public class Characters {                                                               // to be updated

    private static Map<String, CharacterData> characterDatas;
    private static Map<String, BiopicData> biopics;

    // Heroes
    public static Map<String, CharacterData > getHeroBruiser(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Juggernaut", new CharacterData("Juggernaut", R.drawable.juggernaut, R.drawable.juggernaut_dial));
        characterDatas.put("Sandman", new CharacterData("Sandman", R.drawable.sandman, R.drawable.sandman_dial));
        characterDatas.put("Hyperion", new CharacterData("Hyperion", R.drawable.hyperion, R.drawable.hyperion_dial));
        characterDatas.put("Volstagg", new CharacterData("Volstagg", R.drawable.volstagg, R.drawable.volstagg_dial));
        characterDatas.put("Valkyrie", new CharacterData("Valkyrie", R.drawable.valkyrie, R.drawable.valkyrie_dial));
        characterDatas.put("Wonder Man", new CharacterData("Wonder Man", R.drawable.wonder_man, R.drawable.wonder_man_dial));
        characterDatas.put("Ares", new CharacterData("Ares", R.drawable.ares, R.drawable.ares_dial));
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
        characterDatas.put("Shocker", new CharacterData("Shocker", R.drawable.shocker, R.drawable.shocker_dial));
        characterDatas.put("Death locket", new CharacterData("Death locket", R.drawable.death_locket, R.drawable.death_locket_dial));
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
        characterDatas.put("Hellcat", new CharacterData("Hellcat", R.drawable.hellcat, R.drawable.hellcat_dial));
        characterDatas.put("Thor - Jane Foster", new CharacterData("Thor - Jane Foster", R.drawable.thor_jane, R.drawable.thor_jane_dial));
        characterDatas.put("Mantis", new CharacterData("Mantis", R.drawable.mantis, R.drawable.mantis_dial));
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
        characterDatas.put("Cammi", new CharacterData("Cammi", R.drawable.cammi, R.drawable.cammi_dial));
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
        characterDatas.put("Cloak and Dagger", new CharacterData("Cloak and Dagger", R.drawable.cloak_and_dagger, R.drawable.cloak_and_dagger_dial));
        characterDatas.put("Beetle", new CharacterData("Beetle", R.drawable.beetle, R.drawable.beetle_dial));
        characterDatas.put("Moondragon", new CharacterData("Moondragon", R.drawable.moondragon, R.drawable.moondragon_dial));
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
        characterDatas.put("Blue Marvel", new CharacterData("Blue Marvel", R.drawable.blue_marvel, R.drawable.blue_marvel_dial));
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
        characterDatas.put("Shocker", new CharacterData("Shocker", R.drawable.shocker, R.drawable.shocker_dial));
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
        characterDatas.put("Thor - Jane Foster", new CharacterData("Thor - Jane Foster", R.drawable.thor_jane, R.drawable.thor_jane_dial));
        characterDatas.put("Mantis", new CharacterData("Mantis", R.drawable.mantis, R.drawable.mantis_dial));
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
        characterDatas.put("Blue Marvel", new CharacterData("Blue Marvel", R.drawable.blue_marvel, R.drawable.blue_marvel_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getSpecOpTactical(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Emma Frost", new CharacterData("Emma Frost", R.drawable.emma_frost, R.drawable.emma_frost_dial));
        characterDatas.put("Hank Pym", new CharacterData("Hank Pym", R.drawable.hank_pym, R.drawable.hank_pym_dial));
        characterDatas.put("Rescue", new CharacterData("Rescue", R.drawable.rescue, R.drawable.rescue_dial));
        characterDatas.put("Black Bolt", new CharacterData("Black Bolt", R.drawable.black_bolt, R.drawable.black_bolt_dial));
        characterDatas.put("Cammi", new CharacterData("Cammi", R.drawable.cammi, R.drawable.cammi_dial));
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
        characterDatas.put("Hellcat", new CharacterData("Hellcat", R.drawable.hellcat, R.drawable.hellcat_dial));
        return characterDatas;
    }

    public static Map<String, CharacterData > getPVPInfiltrator(){
        characterDatas = new TreeMap<>();
        characterDatas.put("Psylocke", new CharacterData("Psylocke", R.drawable.psylocke, R.drawable.psylocke_dial));
        characterDatas.put("Spiral", new CharacterData("Spiral", R.drawable.spiral, R.drawable.spiral_dial));
        characterDatas.put("Agent Venom", new CharacterData("Agent Venom", R.drawable.agent_venom, R.drawable.agent_venom_dial));
        characterDatas.put("Victor Mancha", new CharacterData("Victor Mancha", R.drawable.victor_mancha, R.drawable.victor_mancha_dial));
        characterDatas.put("A-Bomb", new CharacterData("A-Bomb", R.drawable.a_bomb, R.drawable.a_bomb_dial));
        characterDatas.put("Cloak and Dagger", new CharacterData("Cloak and Dagger", R.drawable.cloak_and_dagger, R.drawable.cloak_and_dagger_dial));
        characterDatas.put("Beetle", new CharacterData("Beetle", R.drawable.beetle, R.drawable.beetle_dial));
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
        characterDatas.put("Death locket", new CharacterData("Death locket", R.drawable.death_locket, R.drawable.death_locket_dial));
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
        characterDatas.put("Moondragon", new CharacterData("Moondragon", R.drawable.moondragon, R.drawable.moondragon_dial));
        return characterDatas;
    }

    //Enemy

    //groupboss

}
