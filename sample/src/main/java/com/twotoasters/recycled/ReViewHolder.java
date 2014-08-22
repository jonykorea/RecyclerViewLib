package com.twotoasters.recycled;


import android.view.View;
import android.widget.TextView;

import com.twotoasters.android.support.v7.widget.CardView;
import com.twotoasters.android.support.v7.widget.RecyclerView.ViewHolder;

public class ReViewHolder extends ViewHolder {
    public CardView cardView;
    public TextView textView;

    public ReViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView;
        cardView.setRadius(itemView.getResources().getDimension(R.dimen.card_radius));

        textView = (TextView) cardView.getChildAt(0);
    }
}
