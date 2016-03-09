package com.support.android.designlibdemo.character.character_activity;

import com.support.android.designlibdemo.R;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by fabio on 9/3/16.
 *
 */

public class Biopic {

    private String bio;

    public Biopic(String bio){
        this.setBio(bio);
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
