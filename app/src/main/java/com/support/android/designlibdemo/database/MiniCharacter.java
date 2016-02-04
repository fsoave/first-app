package com.support.android.designlibdemo.database;

/**
 * Created by fabio on 03/11/15.
 */
public class MiniCharacter {

    private long id;
    public String name;
    public String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return this.getName();
    }

}
