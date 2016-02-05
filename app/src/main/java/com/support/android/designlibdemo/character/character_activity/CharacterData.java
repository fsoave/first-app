package com.support.android.designlibdemo.character.character_activity;

/**
 * Created by fabio on 21/12/15.
 */
public class CharacterData {

    private String name;
    private int drawableIcon;
    private int drawableDialog;

    private int releaseOrder;       //TODO: add this in the constructor.
    private String biopic;          //TODO: add this in the constructor.
    private boolean mine;           //TODO: add this in the constructor.
    private int classType;          //TODO: add this in the constructor.


    public CharacterData( String name, int drawableIcon, int drawableDialog ) {
        this.setName(name);
        this.setDrawableDialog(drawableDialog);
        this.setDrawableIcon(drawableIcon);
    }

    /* getter and setters */
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getDrawableIcon() { return drawableIcon; }

    public void setDrawableIcon(int drawableIcon) { this.drawableIcon = drawableIcon;}

    public int getDrawableDialog() { return drawableDialog; }

    public void setDrawableDialog(int drawableDialog) { this.drawableDialog = drawableDialog; }

    public int getReleaseOrder() { return releaseOrder;}

    public void setReleaseOrder(int releaseOrder) { this.releaseOrder = releaseOrder; }

    public String getBiopic() { return biopic;}

    public void setBiopic(String biopic) { this.biopic = biopic;}

    public boolean isMine() {return mine;}

    public void setMine(boolean mine) { this.mine = mine;}

    public int getClassType() { return classType; }

    public void setClassType(int classType) { this.classType = classType; }
}
