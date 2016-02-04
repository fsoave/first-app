package com.support.android.designlibdemo.character.character_activity;

/**
 * Created by fabio on 21/12/15.
 */
public class CharacterData {

    private String name;
    private int drawableIcon;
    private int drawableDialog;

    public CharacterData( String name, int drawableIcon, int drawableDialog ) {
        this.setName(name);
        this.setDrawableDialog(drawableDialog);
        this.setDrawableIcon(drawableIcon);
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getDrawableIcon() { return drawableIcon; }

    public void setDrawableIcon(int drawableIcon) { this.drawableIcon = drawableIcon;}

    public int getDrawableDialog() { return drawableDialog; }

    public void setDrawableDialog(int drawableDialog) { this.drawableDialog = drawableDialog; }



}
