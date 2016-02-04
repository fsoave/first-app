package com.support.android.designlibdemo.future.database;

/**
 * Created by fabio on 22/10/15.
 */
public class Character {
    public String name;
    public String type;
    public String bio;
    public int cps;

    public boolean recruitable;  // false = blocked

    public boolean isLockbox;
    public String lockbox_name;

    public boolean isPVP;   // if true cp=135
    public int pvp_number;

    public boolean isSpecOp; // if true cp=200
    public int specop_number;

    public boolean isHero;
    public boolean isEnemy;
    public boolean isCovertTask;
    public boolean isGroupBoss;
    public boolean isPlayable;  //charles xavier, coulson, fury, hill = false
    public boolean restrict;    //like Doom

    /*
    * if isEnemy and isLockbox = true -> isMine can be true
    *                          = False -> isMine is false
    * */
    public boolean isMine;      //true - I've the hero

    public String nameImageIcon;
    public String nameImageBkg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getCps() {
        return cps;
    }

    public void setCps(int cps) {
        this.cps = cps;
    }

    public boolean isRecruitable() {
        return recruitable;
    }

    public void setRecruitable(boolean recruitable) {
        this.recruitable = recruitable;
    }

    public boolean isLockbox() {
        return isLockbox;
    }

    public void setIsLockbox(boolean isLockbox) {
        this.isLockbox = isLockbox;
    }

    public String getLockbox_name() {
        return lockbox_name;
    }

    public void setLockbox_name(String lockbox_name) {
        this.lockbox_name = lockbox_name;
    }

    public boolean isPVP() {
        return isPVP;
    }

    public void setIsPVP(boolean isPVP) {
        this.isPVP = isPVP;
    }

    public int getPvp_number() {
        return pvp_number;
    }

    public void setPvp_number(int pvp_number) {
        this.pvp_number = pvp_number;
    }

    public boolean isSpecOp() {
        return isSpecOp;
    }

    public void setIsSpecOp(boolean isSpecOp) {
        this.isSpecOp = isSpecOp;
    }

    public int getSpecop_number() {
        return specop_number;
    }

    public void setSpecop_number(int specop_number) {
        this.specop_number = specop_number;
    }

    public boolean isHero() {
        return isHero;
    }

    public void setIsHero(boolean isHero) {
        this.isHero = isHero;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setIsEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }

    public boolean isCovertTask() {
        return isCovertTask;
    }

    public void setIsCovertTask(boolean isCovertTask) {
        this.isCovertTask = isCovertTask;
    }

    public boolean isGroupBoss() {
        return isGroupBoss;
    }

    public void setIsGroupBoss(boolean isGroupBoss) {
        this.isGroupBoss = isGroupBoss;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setIsPlayable(boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    public boolean isRestrict() {
        return restrict;
    }

    public void setRestrict(boolean restrict) {
        this.restrict = restrict;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setIsMine(boolean isMine) {
        this.isMine = isMine;
    }

    public String getNameImageIcon() {
        return nameImageIcon;
    }

    public void setNameImageIcon(String nameImageIcon) {
        this.nameImageIcon = nameImageIcon;
    }

    public String getNameImageBkg() {
        return nameImageBkg;
    }

    public void setNameImageBkg(String nameImageBkg) {
        this.nameImageBkg = nameImageBkg;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return name;
    }
}
