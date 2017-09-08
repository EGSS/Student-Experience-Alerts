package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private Context context;
    private ArrayList<CardEntry> cardList;

    public class CardViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;
        public Switch aSwitch;

        public CardViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.residenceImage);
            textView = (TextView) itemView.findViewById(R.id.residenceName);
            aSwitch = (Switch) itemView.findViewById(R.id.receiveResidenceNotifications);
        }
    }

    public CardAdapter(Context context, ArrayList<CardEntry> cardList) {
        this.context = context;
        this.cardList = cardList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_record, parent, false);
        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final CardViewHolder holder, int position) {
        CardEntry entry = cardList.get(position);
        holder.imageView.setImageResource(entry.getResourceID());
        holder.textView.setText(entry.getName());
        holder.aSwitch.setChecked(entry.isSwitchState());
        holder.aSwitch.setText(R.string.receive_notifications);
        holder.aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSwitch();
            }
        });
    }

    public void toggleSwitch() {
        //do nothing
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}