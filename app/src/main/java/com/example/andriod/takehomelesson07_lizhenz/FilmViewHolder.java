package com.example.andriod.takehomelesson07_lizhenz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class FilmViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView wandNameView;
    private TextView wandInfoView;
    private ImageView wandImageView;
    private Context context;

    public TextView getWandNameView() {
        return wandNameView;
    }

    public void setWandNameView(TextView wandNameView) {
        this.wandNameView = wandNameView;
    }

    public TextView getWandInfoView() {
        return wandInfoView;
    }

    public void setWandInfoView(TextView wandInfoView) {
        this.wandInfoView = wandInfoView;
    }

    public ImageView getWandImageView() {
        return wandImageView;
    }

    public void setWandImageView(ImageView wandImageView) {
        this.wandImageView = wandImageView;
    }

    public FilmViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        wandNameView = (TextView) itemView.findViewById(R.id.wand_name);
        wandInfoView = (TextView) itemView.findViewById(R.id.wand_info);
        wandImageView = (ImageView) itemView.findViewById(R.id.wand_image);
        //this.context = context;


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, wandNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

