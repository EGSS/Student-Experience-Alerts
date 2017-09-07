package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter {

    private static final String TAG = "CardAdapter";

    private ArrayList<CardEntry> cardList;
    private final int layoutResource;
    private final LayoutInflater layoutInflater;

    public CardAdapter(Context context, int resource, ArrayList<CardEntry> cardList) {
        super(context, resource);
        this.layoutResource = resource;
        this.layoutInflater = LayoutInflater.from(context);
        this.cardList = cardList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(layoutResource, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.residenceImage);
        TextView textView = (TextView) view.findViewById(R.id.residenceName);
        Switch mSwitch = (Switch) view.findViewById(R.id.receiveResidenceNotifications);
        CardEntry entry = cardList.get(position);
        imageView.setImageResource(entry.getResourceID());
        textView.setText(entry.getName());
        mSwitch.setChecked(entry.isSwitchState());
        return view;
    }

    @Override
    public int getCount() {
        return cardList.size();
    }
}
