package com.verygoodsoftwarecompany.studentexperiencealerts.deprecated;

import com.verygoodsoftwarecompany.studentexperiencealerts.R;

@Deprecated
public enum Residence {

    RAVEL_RESIDENCE("Ravel Residence", R.drawable.ravel , 5),
    AMSTEL_HOME("Amstel Home", R.drawable.amstel, 5),
    NAUTIQUE_LIVING("Nautique Living", R.drawable.nautique, 12);

    private String name;
    private int drawable;
    private int numberOfFloors;

    Residence(String name, int drawable, int numberOfFloors) {
        this.name = name;
        this.drawable = drawable;
        this.numberOfFloors = numberOfFloors;
    }

    public int getDrawable() {
        return drawable;
    }

    /**
     * "http://ravelresidence.studentexperience.nl/?language=en"
     * "http://roomselector.studentexperience.nl/?language=en"
     * "http://nautiqueliving.studentexperience.nl/?language=en"
     */
}
