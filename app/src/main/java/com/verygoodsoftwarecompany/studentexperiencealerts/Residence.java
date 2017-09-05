package com.verygoodsoftwarecompany.studentexperiencealerts;

public enum Residence {

    RAVEL_RESIDENCE("Ravel Residence", "http://ravelresidence.studentexperience.nl/?language=en", 5),
    AMSTEL_HOME("Amstel Home", "http://roomselector.studentexperience.nl/?language=en", 5),
    NAUTIQUE_LIVING("Nautique Living", "http://nautiqueliving.studentexperience.nl/?language=en", 12);

    private String name;
    private String URL;
    private int numberOfFloors;

    Residence(String name, String URL, int numberOfFloors) {
        this.name = name;
        this.URL = URL;
        this.numberOfFloors = numberOfFloors;
    }
}
