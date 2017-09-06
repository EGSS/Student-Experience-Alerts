package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CardAdapter extends ArrayAdapter {

    private Settings settings;

    public CardAdapter(Context context, int resource, Settings settings) {
        super(context, resource);
        this.settings = settings;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return Residence.values().length;
    }
}
