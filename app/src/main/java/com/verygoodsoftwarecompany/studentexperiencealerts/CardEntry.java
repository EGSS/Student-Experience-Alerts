package com.verygoodsoftwarecompany.studentexperiencealerts;

public class CardEntry {

    private int resourceID;
    private String name;
    private boolean switchState;

    public CardEntry(int resourceID, String name, boolean switchState) {
        this.resourceID = resourceID;
        this.name = name;
        this.switchState = switchState;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwitchState() {
        return switchState;
    }

    public void setSwitchState(boolean switchState) {
        this.switchState = switchState;
    }
}
