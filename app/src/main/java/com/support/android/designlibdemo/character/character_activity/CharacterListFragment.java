package com.support.android.designlibdemo.character.character_activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.support.android.designlibdemo.Adapter.RVAdapter;
import com.support.android.designlibdemo.R;
import com.support.android.designlibdemo.character.groupboss.GBoss;
import com.support.android.designlibdemo.utils.CharactersInString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by fabio on 22/10/15.
 *
 * quando funzionerà il db, spero di poter usare una sola activity con 6 tab che contengano sia buoni che cattivi
 */

public class CharacterListFragment extends Fragment {

    String class_type;
    String[] character_type;
    Map<String, CharacterData> CharacterDataMap;
    private RecyclerView rv;
    public List<CharacterData> characters;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rv = (RecyclerView) inflater.inflate(
                R.layout.fragment_character_list, container, false);

        Bundle bundle = this.getArguments(); // class, type
        if (bundle != null) {
            this.prepareFragment(bundle);           //call to initializeData();
        }else{
            String[] type = null;
        }

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        initializeAdapter();
        return rv;
    }

    // in futuro devo modificare qui
    private void initializeData(String[] character_type){
        int i = 0;
        characters = new ArrayList<CharacterData>();
        List<String> list = getList(character_type);
        while (i < list.size()) {
            characters.add(new CharacterData(list.get(i), R.drawable.baron_mordo, R.drawable.example_dialogue));
            i++;
        }
    }

    private void initializeData2(Map<String, CharacterData> CharacterDataMap){
        characters = new ArrayList<CharacterData>(CharacterDataMap.values()); //.keys() ritorna una collection di chiavi -> string
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(characters);
        rv.setAdapter(adapter);
    }

    private void prepareFragment(Bundle bundle){
        class_type = bundle.getString("class");
        String type = bundle.getString("type");
        if (class_type.equals("lockbox")){
            if (type.equals("Bruiser")){ CharacterDataMap = Characters.getLockBoxesBruiser(); initializeData2(CharacterDataMap);}
            if (type.equals("Blaster")){ CharacterDataMap = Characters.getLockBoxesBlaster();  initializeData2(CharacterDataMap);}
            if (type.equals("Scrapper")){ CharacterDataMap = Characters.getLockBoxesScrapper(); initializeData2(CharacterDataMap);}
            if (type.equals("Infiltrator")){  CharacterDataMap = Characters.getLockBoxesInfiltrator(); initializeData2(CharacterDataMap);}
            if (type.equals("Tactical")){  CharacterDataMap = Characters.getLockBoxesTactical(); initializeData2(CharacterDataMap);}
            if (type.equals("Generalist")){  CharacterDataMap = Characters.getLockBoxesGeneralist(); initializeData2(CharacterDataMap);}

        }
        if (class_type.equals("hero")){
            if (type.equals("Bruiser")){ CharacterDataMap = Characters.getHeroBruiser(); initializeData2(CharacterDataMap);}
            if (type.equals("Blaster")){ CharacterDataMap = Characters.getHeroBlaster(); initializeData2(CharacterDataMap);}
            if (type.equals("Scrapper")){ CharacterDataMap = Characters.getHeroScrapper(); initializeData2(CharacterDataMap);}
            if (type.equals("Infiltrator")){ CharacterDataMap = Characters.getHeroInfiltrator(); initializeData2(CharacterDataMap);}
            if (type.equals("Tactical")){ CharacterDataMap = Characters.getHeroTactical(); initializeData2(CharacterDataMap);}
            if (type.equals("Generalist")){ CharacterDataMap = Characters.getHeroGeneralist(); initializeData2(CharacterDataMap);}
        }
        // da dividere in classi
        if (class_type.equals("enemy")){
            if (type.equals("Bruiser")){ character_type = CharactersInString.sEnemiesStrings; initializeData(character_type);}
            if (type.equals("Blaster")){ character_type = CharactersInString.sEnemiesStrings; initializeData(character_type);}
            if (type.equals("Scrapper")){ character_type = CharactersInString.sEnemiesStrings; initializeData(character_type);}
            if (type.equals("Infiltrator")){ character_type = CharactersInString.sEnemiesStrings; initializeData(character_type);}
            if (type.equals("Tactical")){ character_type = CharactersInString.sEnemiesStrings; initializeData(character_type);}
            if (type.equals("Generalist")){ character_type = CharactersInString.sEnemiesStrings; initializeData(character_type);}
        }
        if (class_type.equals("pvp")){
            if (type.equals("Bruiser")){ CharacterDataMap = Characters.getPVPBruiser(); initializeData2(CharacterDataMap);}
            if (type.equals("Blaster")){ CharacterDataMap = Characters.getPVPBlaster(); initializeData2(CharacterDataMap);}
            if (type.equals("Scrapper")){ CharacterDataMap = Characters.getPVPScrapper(); initializeData2(CharacterDataMap);}
            if (type.equals("Infiltrator")){ CharacterDataMap = Characters.getPVPInfiltrator(); initializeData2(CharacterDataMap);}
            if (type.equals("Tactical")){ CharacterDataMap = Characters.getPVPTactical(); initializeData2(CharacterDataMap);}
            if (type.equals("Generalist")){ CharacterDataMap = Characters.getPVPGeneralist(); initializeData2(CharacterDataMap);}
        }
        if (class_type.equals("specop")){
            if (type.equals("Bruiser")){ CharacterDataMap = Characters.getSpecOpBruiser(); initializeData2(CharacterDataMap);}
            if (type.equals("Blaster")){ CharacterDataMap = Characters.getSpecOpBlaster(); initializeData2(CharacterDataMap);}
            if (type.equals("Scrapper")){ CharacterDataMap = Characters.getSpecOpScrapper(); initializeData2(CharacterDataMap);}
            if (type.equals("Infiltrator")){ CharacterDataMap = Characters.getSpecOpInfiltrator(); initializeData2(CharacterDataMap);}
            if (type.equals("Tactical")){ CharacterDataMap = Characters.getSpecOpTactical(); initializeData2(CharacterDataMap);}
            if (type.equals("Generalist")){ CharacterDataMap = Characters.getSpecOpGeneralist(); initializeData2(CharacterDataMap);}
        }
        if (class_type.equals("covert")){
            if (type.equals("Bruiser")){ CharacterDataMap = Characters.getCovertBruiser(); initializeData2(CharacterDataMap);}
            if (type.equals("Blaster")){ CharacterDataMap = Characters.getCovertBlaster(); initializeData2(CharacterDataMap);}
            if (type.equals("Scrapper")){ CharacterDataMap = Characters.getCovertScrapper(); initializeData2(CharacterDataMap);}
            if (type.equals("Infiltrator")){ CharacterDataMap = Characters.getCovertInfiltrator(); initializeData2(CharacterDataMap);}
            if (type.equals("Tactical")){ CharacterDataMap = Characters.getCovertTactical(); initializeData2(CharacterDataMap);}
            if (type.equals("Generalist")){ CharacterDataMap = Characters.getCovertGeneralist(); initializeData2(CharacterDataMap);}
        }
        if (class_type.equals("groupboss")){
            if (type.equals("Bruiser")){ character_type = GBoss.sGroupBossStrings; initializeData(character_type);}
            if (type.equals("Blaster")){ character_type = GBoss.sGroupBossStrings; initializeData(character_type);}
            if (type.equals("Scrapper")){ character_type = GBoss.sGroupBossStrings; initializeData(character_type);}
            if (type.equals("Infiltrator")){ character_type = GBoss.sGroupBossStrings; initializeData(character_type);}
            if (type.equals("Tactical")){ character_type = GBoss.sGroupBossStrings; initializeData(character_type);}
            if (type.equals("Generalist")){ character_type = GBoss.sGroupBossStrings; initializeData(character_type);
            }
        }
    }

    public List<String> getList(String[] array) {
        ArrayList<String> list = new ArrayList<>(array.length);
        int i = 0;
        while (list.size() < array.length) {
            list.add(array[i]);
            i++;
        }
        return list;
    }
}
