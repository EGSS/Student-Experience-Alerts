package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;

public class Settings {

    private static final String SHARED_PREFERENCES_KEY = "SHARED_PREFERENCES";
    private static final String RAVEL_NOTIFICATION_KEY = "RAVEL_NOTIFICATION";
    private static final String AMSTEL_NOTIFICATION_KEY = "RAVEL_NOTIFICATION";
    private static final String NAUTIQUE_NOTIFICATION_KEY = "RAVEL_NOTIFICATION";
    private static final String EULA_ACCEPTED_KEY = "RAVEL_NOTIFICATION";
    private static final String LOCALE_SELECTION_KEY = "RAVEL_NOTIFICATION";

    private boolean ravelNotifications;
    private boolean amstelNotifications;
    private boolean nautiqueNotifications;
    private boolean acceptsEULA;
    private String locale;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public Settings(Activity context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_KEY, MODE_PRIVATE);
        editor = sharedPreferences.edit();
        ravelNotifications = sharedPreferences.getBoolean(RAVEL_NOTIFICATION_KEY, true);
        amstelNotifications = sharedPreferences.getBoolean(AMSTEL_NOTIFICATION_KEY, true);
        nautiqueNotifications = sharedPreferences.getBoolean(NAUTIQUE_NOTIFICATION_KEY, true);
        acceptsEULA = sharedPreferences.getBoolean(EULA_ACCEPTED_KEY, false);
        locale = sharedPreferences.getString(LOCALE_SELECTION_KEY, Locale.ENGLISH.getLanguage());
    }

    public boolean isRavelNotifications() {
        return ravelNotifications;
    }

    public boolean isAmstelNotifications() {
        return amstelNotifications;
    }

    public boolean isNautiqueNotifications() {
        return nautiqueNotifications;
    }

    public boolean isAcceptsEULA() {
        return acceptsEULA;
    }

    public String getLocale() {
        return locale;
    }

    public void setRavelNotifications(boolean ravelNotifications) {
        editor.putBoolean(RAVEL_NOTIFICATION_KEY, ravelNotifications);
        editor.commit();
        this.ravelNotifications = sharedPreferences.getBoolean(RAVEL_NOTIFICATION_KEY, true);
    }

    public void setAmstelNotifications(boolean amstelNotifications) {
        editor.putBoolean(AMSTEL_NOTIFICATION_KEY, amstelNotifications);
        editor.commit();
        this.amstelNotifications = sharedPreferences.getBoolean(AMSTEL_NOTIFICATION_KEY, true);
    }

    public void setNautiqueNotifications(boolean nautiqueNotifications) {
        editor.putBoolean(NAUTIQUE_NOTIFICATION_KEY, nautiqueNotifications);
        editor.commit();
        this.nautiqueNotifications = sharedPreferences.getBoolean(NAUTIQUE_NOTIFICATION_KEY, true);
    }

    public void setAcceptsEULA(boolean acceptsEULA) {
        editor.putBoolean(EULA_ACCEPTED_KEY, acceptsEULA);
        editor.commit();
        this.acceptsEULA = sharedPreferences.getBoolean(EULA_ACCEPTED_KEY, true);
    }

    public void setLocale(Locale locale) {
        editor.putString(LOCALE_SELECTION_KEY, locale.getLanguage());
        editor.commit();
        this.locale = sharedPreferences.getString(LOCALE_SELECTION_KEY, locale.getLanguage());
    }
}